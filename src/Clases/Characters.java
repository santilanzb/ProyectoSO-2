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

    public String name;
    
    

    public Characters(String name) {

        this.Habilidad = generarHabilidad(DetCalidad(60));
        this.PuntosVida = generarPuntosVida(DetCalidad(70));
        this.Fuerza = generarFuerza(DetCalidad(50));
        this.Agilidad = generarAgilidad(DetCalidad(40));
        this.calidad = false;
        this.special = generarEspecial();
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        
        String milloneta = "milloneta";
        String enchufado = "enchufado";
        String malandro = "malandro";
        String calvo = "calvo";
        String calidoso = "calidoso";
        
        
        String[] strings = {milloneta,calidoso, enchufado, malandro, calvo};
        
        Random random = new Random();
        int randomIndex = random.nextInt(strings.length);
        String randomString = strings[randomIndex];
        
        return randomString;
        }
    
}
