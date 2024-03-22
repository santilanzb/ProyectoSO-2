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
import javax.swing.ImageIcon;
/**
 *
 * @author Abraham Santana
 */
public class Avatar {
    Queue priority1A = new Queue();
    Queue priority2A = new Queue();
    Queue priority3A = new Queue();
    Queue refuerzoA = new Queue();
    
    public static class Aang extends Characters {
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Aang(){
           super("Aang");
           ImageIcon icon = createImageIcon("src/ImagesAvatar/Aang.jpg"); // replace with actual path
           
           if (icon != null) {
                this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
       }
        
        
    }
    
    public static class Katara extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Katara(){
           super("Katara");
           ImageIcon icon = createImageIcon("src/ImagesAvatar/Katara.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }
        
        
    }
    
    public static class PrincipeZuko extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public PrincipeZuko(){
           super("Principe Zuko");
           ImageIcon icon = createImageIcon("src/ImagesAvatar/PrincipeZuko.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }
        
    }
    
    public static class TophBeifong extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public TophBeifong(){
           super("Toph Beifong");
           ImageIcon icon = createImageIcon("src/ImagesAvatar/TophBeifong.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }
        
    }
    
    public static class Azula extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public Azula(){
           super("Azula");
           ImageIcon icon = createImageIcon("src/ImagesAvatar/Azula.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }
        

    }
    
    public static class Sokka extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public Sokka(){
           super("Sokka");
           ImageIcon icon = createImageIcon("src/ImagesAvatar/Sokka.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }

    }
    
    public static class TyLee extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public TyLee(){
           super("Ty Lee");
           ImageIcon icon = createImageIcon("src/ImagesAvatar/TyLee.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }
        
    }
    
    public static class Yue extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public Yue(){
           super("Yue");
           ImageIcon icon = createImageIcon("src/ImagesAvatar/Yue.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }

        
    }
    
    public static class Appa extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public Appa(){
           super("Appa");
           ImageIcon icon = createImageIcon("src/ImagesAvatar/Appa.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }
        

    }
    
    public static class Suki extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public Suki(){
           super("Suki");
           ImageIcon icon = createImageIcon("src/ImagesAvatar/Suki.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
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

