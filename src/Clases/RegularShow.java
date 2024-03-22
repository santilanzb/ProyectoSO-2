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
           ImageIcon icon = createImageIcon("src/ImagesRegularShow/Mordecai.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }
        

    }
    
    public static class Rigby extends Characters{
       Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Rigby(){
           super("Rigby");
           ImageIcon icon = createImageIcon("src/ImagesRegularShow/Rigby.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }

    }
    
    public static class Musculoso extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Musculoso(){
           super("Musculoso");
           ImageIcon icon = createImageIcon("src/ImagesRegularShow/Musculoso.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }
        
    }
    
    public static class Benson extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Benson(){
           super("Benson");
           ImageIcon icon = createImageIcon("src/ImagesRegularShow/Benson.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }

    }
    
    public static class Skips extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Skips(){
           super("Skips");
           ImageIcon icon = createImageIcon("src/ImagesRegularShow/Skips.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }

    }
    
    public static class Papaleta extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Papaleta(){
           super("Papaleta");
           ImageIcon icon = createImageIcon("src/ImagesRegularShow/Papaleta.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }

    }
    
    public static class Starla extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Starla(){
           super("Starla");
           ImageIcon icon = createImageIcon("src/ImagesRegularShow/Starla.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }
        
    }
    
    public static class Margarita extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Margarita(){
           super("Margarita");
           ImageIcon icon = createImageIcon("src/ImagesRegularShow/Margarita.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }
        
    }
    
    public static class Fantasmin extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public Fantasmin(){
           super("Fantasmin");
           ImageIcon icon = createImageIcon("src/ImagesRegularShow/Fantasmin.jpg"); // replace with actual path
           
           if (icon != null) {
           this.photo = icon.getImage();
            } else {
           System.out.println("Image not found");
            }
        }
        
    }
    
    public static class MrMaellard extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        private Image photo;
        
        public MrMaellard(){
           super("MrMaellard");
           ImageIcon icon = createImageIcon("src/ImagesRegularShow/MrMaellard.jpg"); // replace with actual path
           
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
            priority1RS.enqueue(characters);
        }else if (cont == 2 ){
            priority2RS.enqueue(characters);
        }if (cont == 0 || cont == 1){
            priority3RS.enqueue(characters);
        }
    }
}
