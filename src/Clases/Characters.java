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
    

    public Characters(int habilidad, int puntosVida, int fuerza, int agilidad) {
        this.Habilidad = habilidad;
        this.PuntosVida = puntosVida;
        this.Fuerza = fuerza;
        this.Agilidad = agilidad;
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
            return calidad = true;
        } else {
            return calidad = false;
        }
    }
    
    public static Characters generarAtributos(boolean calidad) {
        Random random = new Random();
        int habilidad, puntosVida, fuerza, agilidad;

        if (calidad) {
            habilidad = random.nextInt(7, 11);
            puntosVida = random.nextInt(7, 11);
            fuerza = random.nextInt(7, 11);
            agilidad = random.nextInt(7, 11);
        } else {
            habilidad = random.nextInt(0, 7);
            puntosVida = random.nextInt(0, 7);
            fuerza = random.nextInt(0, 7);
            agilidad = random.nextInt(0, 7);
        }

        return new Characters(habilidad, puntosVida, fuerza, agilidad);
    }
}
