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
public class Characters {
    public int Habilidad;
    public int PuntosVida;
    public int Fuerza;
    public int Agilidad;
    public boolean calidad;
    public String special;
    
    

    public Characters() {

        this.Habilidad = generarHabilidad(DetCalidad(60));
        this.PuntosVida = generarPuntosVida(DetCalidad(70));
        this.Fuerza = generarFuerza(DetCalidad(50));
        this.Agilidad = generarAgilidad(DetCalidad(40));
        this.calidad = false;
        this.special = generarEspecial();
    }

    public int getHabilidad() {
        return Habilidad;
    }

    public void setHabilidad(int Habilidad) {
        this.Habilidad = Habilidad;
    }

    public int getPuntosVida() {
        return PuntosVida;
    }

    public void setPuntosVida(int PuntosVida) {
        this.PuntosVida = PuntosVida;
    }

    public int getFuerza() {
        return Fuerza;
    }

    public void setFuerza(int Fuerza) {
        this.Fuerza = Fuerza;
    }

    public int getAgilidad() {
        return Agilidad;
    }

    public void setAgilidad(int Agilidad) {
        this.Agilidad = Agilidad;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }
    
    
    
    public boolean DetCalidad(int probabilidad){
        Random random = new Random();
        int num = random.nextInt(101);
        if (num <= probabilidad){
            return calidad = true;
        } else {
            return calidad = false;
        }
    }
    
    public int generarHabilidad(boolean calidad) {
        Random random = new Random();
        if (calidad){
            return random.nextInt(8,11 );
        }else {
            return random.nextInt(0,7);        
        }
    }
        
    public int generarPuntosVida(boolean calidad) {
        Random random = new Random();
        if (calidad){
            return random.nextInt(8,11 );
        }else {
            return random.nextInt(0,7);        
        }
    }
    
    public int generarFuerza(boolean calidad) {
        Random random = new Random();
        if (calidad){
            return random.nextInt(8,11 );
        }else {
            return random.nextInt(0,7);        
        }
    }
    
    public int generarAgilidad(boolean calidad) {
        Random random = new Random();
        if (calidad){
            return random.nextInt(8,11 );
        }else {
            return random.nextInt(0,7);        
        }
    }
    
    public String generarEspecial(){
        
        String aire = "aire";
        String fuego = "fuego";
        String agua = "agua";
        String enchufado = "enchufado";
        String tierra = "tierra";
        
        String[] strings = {aire, agua, enchufado, tierra, fuego};
        
        Random random = new Random();
        int randomIndex = random.nextInt(strings.length);
        String randomString = strings[randomIndex];
        
        return randomString;
        
        
    }
    
}
