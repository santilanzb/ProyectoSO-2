/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.Random;

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
    
    @Override
    public void run() {
        
    }
    
                                 //RegularShow          //Avatar
    public void Pelea(Characters characters1,Characters characters2 ){
        fightRegularShow.insertBegin(characters1);
        fightAvatar.insertBegin(characters2);
        
        //Para RegularShow:
        if (characters1.special == "enchufado" && (characters2.special == "calvo" || characters2.special == "malandro" || characters2.special == "calidoso" || characters2.special == "milloneta") ){
            Winners.insertBegin(characters1);
            
        }else if (characters2.special == "enchufado" && (characters1.special == "calvo" || characters1.special == "malandro" || characters1.special == "calidoso" || characters1.special == "milloneta") ){
            Winners.insertBegin(characters2);
            
        }else if(characters1.special == "calvo" && (characters2.special == "malandro" || characters2.special == "calidoso" || characters2.special == "milloneta")){
             Winners.insertBegin(characters1);
             
        }else if(characters2.special == "calvo" && (characters1.special == "malandro" || characters1.special == "calidoso" || characters1.special == "milloneta")){
             Winners.insertBegin(characters2);
             
        }else if(characters1.special == "malandro" && (characters2.special == "calidoso" || characters2.special == "milloneta")){
            Winners.insertBegin(characters1);
            
        }else if(characters2.special == "malandro" && (characters1.special == "calidoso" || characters1.special == "milloneta")){
            Winners.insertBegin(characters2);
            
        }else if(characters1.special == "calidoso" && (characters2.special == "milloneta")){
            Winners.insertBegin(characters1);
        
        }else if(characters2.special == "calidoso" && (characters1.special == "milloneta")){
            Winners.insertBegin(characters2);
            
        }else if(characters1.special == characters2.special){
            regularshow.priority1RS.enqueue(characters1);
            avatar.priority1A.enqueue(characters2);
        }
        fightRegularShow.deleteBegin();
        fightAvatar.deleteBegin();
        
    }
}
