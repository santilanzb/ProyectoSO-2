/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;

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
        public Mordecai(){
           super("Mordecai");

        }
    }
    
    public static class Rigby extends Characters{
       Random random = new Random();
        int id = random. nextInt(0,1000);
        public Rigby(){
           super("Rigby");

        }
    }
    
    public static class Musculoso extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public Musculoso(){
           super("Musculoso");

        }
    }
    
    public static class Benson extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public Benson(){
           super("Benson");

        }
    }
    
    public static class Skips extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public Skips(){
           super("Skips");

        }
    }
    
    public static class Papaleta extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public Papaleta(){
           super("Papaleta");
        }
    }
    
    public static class Starla extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public Starla(){
           super("Starla");
        }
    }
    
    public static class Margarita extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public Margarita(){
           super("Margarita");
        }
    }
    
    public static class Fantasmin extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public Fantasmin(){
           super("Fantasmin");
        }
    }
    
    public static class MrMaellard extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        public MrMaellard(){
           super("MrMaellard");
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
