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
public class Avatar {
    Queue priority1A = new Queue();
    Queue priority2A = new Queue();
    Queue priority3A = new Queue();
    Queue refuerzoA = new Queue();
    
    public static class Aang extends Characters {
        Random random = new Random();
        int id = random. nextInt(0,1000);
        String special ="aire";
        public Aang(){
           super();
        }
    }
    
    public static class Katara extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        String special ="agua";
        public Katara(){
           super();          
        }
    }
    
    public static class PrincipeZuko extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        String special ="fuego";
        public PrincipeZuko(){
           super();          
        }
    }
    
    public static class TophBeifong extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        String special ="tierra";
        public TophBeifong(){
           super();          
        }
    }
    
    public static class Azula extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        String special ="fuego";
        public Azula(){
           super();          
        }
    }
    
    public static class Sokka extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        String special ="calidoso";
        public Sokka(){
           super();          
        }
    }
    
    public static class TyLee extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        String special ="fuego";
        public TyLee(){
           super();          
        }
    }
    
    public static class Yue extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        String special ="agua";
        public Yue(){
           super();          
        }
    }
    
    public static class Appa extends Characters{
        Random random = new Random();
        String special ="aire";
        int id = random. nextInt(0,1000);
        public Appa(){
           super();          
        }
    }
    
    public static class Suki extends Characters{
        Random random = new Random();
        int id = random. nextInt(0,1000);
        String special ="tierra";
        public Suki(){
           super();          
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

