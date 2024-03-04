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
    public boolean Calidad;
    

    public Characters() {
        this.Habilidad = 0;
        this.PuntosVida = 0;
        this.Fuerza = 0;
        this.Agilidad = 0;
        this.Calidad = false;
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
    
    public boolean DetCalidad(int probabilidad){
        Random random = new Random();
        int num = random.nextInt(101);
        if (num <= probabilidad){
            return Calidad = true;
        } else {
            return Calidad = false;
        }
    }
     
}
