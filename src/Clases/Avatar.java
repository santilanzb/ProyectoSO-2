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
           try {
            File file = new File("src/ImagesAvatar/Aang.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
       }
        
        
    }
    
    public static class Katara extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Katara(){
           super("Katara");
           try {
            File file = new File("src/ImagesAvatar/Katara.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
        }
        
        
    }
    
    public static class PrincipeZuko extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public PrincipeZuko(){
           super("Principe Zuko");
            try {
            File file = new File("src/ImagesAvatar/PrincipeZuko.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
        }
        
    }
    
    public static class TophBeifong extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public TophBeifong(){
           super("Toph Beifong");
           try {
            File file = new File("src/ImagesAvatar/TophBeifong.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
        }
        
    }
    
    public static class Azula extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public Azula(){
           super("Azula");
           try {
            File file = new File("src/ImagesAvatar/Azula.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
        }
        

    }
    
    public static class Sokka extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public Sokka(){
           super("Sokka");
           try {
            File file = new File("src/ImagesAvatar/Sokka.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
        }

    }
    
    public static class TyLee extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public TyLee(){
           super("Ty Lee");
           try {
            File file = new File("src/ImagesAvatar/TyLee.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
        }
        
    }
    
    public static class Yue extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public Yue(){
           super("Yue");
           try {
            File file = new File("src/ImagesAvatar/Yue.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
        }

        
    }
    
    public static class Appa extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public Appa(){
           super("Appa");
           try {
            File file = new File("src/ImagesAvatar/Appa.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
        }
        

    }
    
    public static class Suki extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        public Suki(){
           super("Suki");
           try {
            File file = new File("src/ImagesAvatar/Suki.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
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

