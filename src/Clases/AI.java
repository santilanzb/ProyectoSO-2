/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import Interfaz.ApplicationWindow;
import java.util.Random;
import java.awt.Image;

/**
 *
 * @author santi
 */
public class AI extends Thread {
    
    List fightRegularShow = new List();
    List fightAvatar = new List();
    List Winners = new List();
    
    Avatar avatar = new Avatar();
    RegularShow regularshow = new RegularShow();
    
    String estado = Acciones();
    
    public static int WinnerA = 0;
    public static int WinnerRS = 0;

    Administrator admin;
    ApplicationWindow applicationWindow;

    public AI(ApplicationWindow applicationWindow) {
        this.admin = new Administrator(this, applicationWindow);
        this.applicationWindow = applicationWindow;
    }

    int cicle = 0;
    
    
    @Override
    public void run() {
        admin.start();
    }
    
                                 //RegularShow          //Avatar
     public synchronized void Pelea(Characters characters1, Characters characters2) {
         System.out.println("Pelea method called with characters: " + characters1.getName() + " and " + characters2.getName());
         fightRegularShow.insertBegin(characters1);
         fightAvatar.insertBegin(characters2);
         
         cicle++;
         
        Image character1Photo = characters1.getPhoto();
        Image character2Photo = characters2.getPhoto();
        applicationWindow.updateWinnerCount(getWinnerA(), getWinnerRS());

         if (cicle % 1 == 0) {
             checkRefuerzoQueues();
         }


         if (cicle % 2 == 0){
             Random rand = new Random();
             if (rand.nextInt(100) < 80){
                 admin.addRandomCharacter();
             }
         }


         // Generate a random number between 1 and 100
         Random random = new Random();
         int randomNumber = random.nextInt(100) + 1;

         // 40% chance that the fight occurs
         if (randomNumber <= 40) {
             if (characters1.special.equals("enchufado") && (characters2.special.equals("calvo") || characters2.special.equals("malandro") || characters2.special.equals("calidoso") || characters2.special.equals("milloneta"))) {
                 Winners.insertBegin(characters1);
                 WinnerRS++;

             } else if (characters2.special.equals("enchufado") && (characters1.special.equals("calvo") || characters1.special.equals("malandro") || characters1.special.equals("calidoso") || characters1.special.equals("milloneta"))) {
                 Winners.insertBegin(characters2);
                 WinnerA++;

             } else if (characters1.special.equals("calvo") && (characters2.special.equals("malandro") || characters2.special.equals("calidoso") || characters2.special.equals("milloneta"))) {
                 Winners.insertBegin(characters1);
                 WinnerRS++;

             } else if (characters2.special.equals("calvo") && (characters1.special.equals("malandro") || characters1.special.equals("calidoso") || characters1.special.equals("milloneta"))) {
                 Winners.insertBegin(characters2);
                 WinnerA++;

             } else if (characters1.special.equals("malandro") && (characters2.special.equals("calidoso") || characters2.special.equals("milloneta"))) {
                 Winners.insertBegin(characters1);
                 WinnerRS++;

             } else if (characters2.special.equals("malandro") && (characters1.special.equals("calidoso") || characters1.special.equals("milloneta"))) {
                 Winners.insertBegin(characters2);
                 WinnerA++;

             } else if (characters1.special.equals("calidoso") && (characters2.special.equals("milloneta"))) {
                 Winners.insertBegin(characters1);
                 WinnerRS++;

             } else if (characters2.special.equals("calidoso") && (characters1.special.equals("milloneta"))) {
                 Winners.insertBegin(characters2);
                 WinnerA++;

             } else if (characters1.special.equals(characters2.special)) {
                 int randomWinner = random.nextInt(100) + 1;

                 // 50% chance to declare character1 as the winner
                 if (randomWinner <= 50) {
                     Winners.insertBegin(characters1);
                     WinnerRS++;
                 }
                 // 50% chance to declare character2 as the winner
                 else {
                     Winners.insertBegin(characters2);
                     WinnerA++;
                 }
             }
             // 27% chance that the fight is a draw
             else if (randomNumber <= 67) { // 40% + 27% = 67%
                 // Send both characters to the end of the priority1 queue
                 avatar.priority1A.enqueue(characters1);
                 regularshow.priority1RS.enqueue(characters2);
             }
             // 33% chance that the fight doesn't happen
             else {
                 // Send both characters to the refuerzoA queue
                 avatar.refuerzoA.enqueue(characters1);
                 regularshow.refuerzoRS.enqueue(characters2);
             }

             fightRegularShow.deleteBegin();
             fightAvatar.deleteBegin();
             System.out.println("Amount of winners from Avatar: " + WinnerA);
             System.out.println("Amount of winners from Regular Show: " + WinnerRS);



         }

     }

    private void checkRefuerzoQueues() {
        System.out.println("checkRefuerzoQueues method called");
        Random rand = new Random();

        // Check the refuerzoA queue
        if (!avatar.refuerzoA.isEmpty()) {
            Characters character = (Characters) avatar.refuerzoA.dequeue().getElement();
            if (rand.nextInt(100) < 40) {
                // 40% chance to move the character to the priority1A queue
                avatar.priority1A.enqueue(character);
            } else {
                // If they fail, they go to the last place of the refuerzoA queue
                avatar.refuerzoA.enqueue(character);
            }
        }

        // Check the refuerzoRS queue
        if (!regularshow.refuerzoRS.isEmpty()) {
            Characters character = (Characters) regularshow.refuerzoRS.dequeue().getElement();
            if (rand.nextInt(100) < 40) {
                // 40% chance to move the character to the priority1RS queue
                regularshow.priority1RS.enqueue(character);
            } else {
                // If they fail, they go to the last place of the refuerzoRS queue
                regularshow.refuerzoRS.enqueue(character);
            }
        }
    }
    
    public String Acciones(){
        if(fightAvatar.getSize() == 0 || fightRegularShow.getSize() == 0){
            return "AI: Peleando";
        } else{
            return "AI: Decidiendo"; 
        }
    }

    public int getWinnerA() {
        return WinnerA;
    }

    public int getWinnerRS() {
        return WinnerRS;
    }

    public List getWinners() {
        return Winners;
    }
    
    
    
}
