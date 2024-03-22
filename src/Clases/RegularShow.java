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
public class RegularShow {
    Queue priority1RS = new Queue();
    Queue priority2RS = new Queue();
    Queue priority3RS = new Queue();
    Queue refuerzoRS = new Queue();
    
    
    public static class Mordecai extends Characters {
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Mordecai(){
           super("Mordecai");
           try {
            File file = new File("src/ImagesRegularShow/Mordecai.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
           setPhoto(photo);
        }
        

    }
    
    public static class Rigby extends Characters{
       Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Rigby(){
           super("Rigby");
           try {
            File file = new File("src/ImagesRegularShow/Rigby.png");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
           setPhoto(photo);
        }

    }
    
    public static class Musculoso extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Musculoso(){
           super("Musculoso");
           try {
            File file = new File("src/ImagesRegularShow/Musculoso.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
           setPhoto(photo);
        }
        
    }
    
    public static class Benson extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Benson(){
           super("Benson");
           try {
            File file = new File("src/ImagesRegularShow/Benson.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
           setPhoto(photo);
        }

    }
    
    public static class Skips extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Skips(){
           super("Skips");
           try {
            File file = new File("src/ImagesRegularShow/Skips.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
           setPhoto(photo);
        }

    }
    
    public static class Papaleta extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Papaleta(){
           super("Papaleta");
           try {
            File file = new File("src/ImagesRegularShow/Papaleta.png");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
           setPhoto(photo);
        }

    }
    
    public static class Starla extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Starla(){
           super("Starla");
           try {
            File file = new File("src/ImagesRegularShow/Starla.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
           setPhoto(photo);
        }
        
    }
    
    public static class Margarita extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Margarita(){
           super("Margarita");
           try {
            File file = new File("src/ImagesRegularShow/Margarita.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
           setPhoto(photo);
        }
        
    }
    
    public static class Fantasmin extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Fantasmin(){
           super("Fantasmin");
           try {
            File file = new File("src/ImagesRegularShow/Fantasmin.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
           setPhoto(photo);
        }
        
    }
    
    public static class MrMaellard extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public MrMaellard(){
           super("MrMaellard");
           try {
            File file = new File("src/ImagesRegularShow/MrMaellard.jpg");
            if (file.exists()) {
                this.photo = ImageIO.read(file);
                System.out.println("Image loaded successfully.");
            } else {
                System.out.println("Image not found");
            }
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
           setPhoto(photo);
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
            priority1RS.enqueue(characters);
        }else if (cont == 2 ){
            priority2RS.enqueue(characters);
        }if (cont == 0 || cont == 1){
            priority3RS.enqueue(characters);
        }
    }
}
