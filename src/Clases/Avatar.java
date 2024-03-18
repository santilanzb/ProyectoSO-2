/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
/**
 *
 * @author Abraham Santana
 */
public class Avatar {
    Queue priority1A = new Queue();
    Queue priority2A = new Queue();
    Queue priority3A = new Queue();
    Queue refuerzoA = new Queue();

    public Queue getPriority1A() {
        return priority1A;
    }

    public Queue getPriority2A() {
        return priority2A;
    }

    public Queue getPriority3A() {
        return priority3A;
    }

    public Queue getRefuerzoA() {
        return refuerzoA;
    }

   
    
    
    public static class Aang extends Characters {
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Aang(){
           super("Aang");
           this.photo = null; // Inicializar photo como null
        }
        
        public void setPhoto(String imagePath) {
        try {
            File file = new File(imagePath);
            this.photo = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        // Método para obtener la foto
        public Image getPhoto() {
        return photo;
        }
        
    }
    
    public static class Katara extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public Katara(){
           super("Katara");
        }
    }
    
    public static class PrincipeZuko extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public PrincipeZuko(){
           super("Principe Zuko");
        }
    }
    
    public static class TophBeifong extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public TophBeifong(){
           super("Toph Beifong");
        }
    }
    
    public static class Azula extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public Azula(){
           super("Azula");
        }
    }
    
    public static class Sokka extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public Sokka(){
           super("Sokka");
        }
    }
    
    public static class TyLee extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public TyLee(){
           super("Ty Lee");
        }
    }
    
    public static class Yue extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public Yue(){
           super("Yue");

        }
    }
    
    public static class Appa extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public Appa(){
           super("Appa");

        }
    }
    
    public static class Suki extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public Suki(){
           super("Suki");

        }
    }
    
    public void DetCalidadPersonajes(Characters characters){
        int cont = 0;
        if (characters.Habilidad >= 8){
            cont ++;
        }if (characters.Agilidad >= 8){
            cont ++;
        }if (characters.PuntosVida >= 8){
            cont ++;
        }if (characters.Fuerza >= 8){
            cont ++;
        }if (cont == 4 || cont == 3){
            priority1A.enqueue(characters);
        }else if (cont == 2 ){
            priority2A.enqueue(characters);
        }if (cont == 0 || cont == 1){
            priority3A.enqueue(characters);
        }
    }

}

