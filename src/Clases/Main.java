/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;
import static Clases.Avatar.Aang;
import Clases.Avatar.Appa;
import Clases.Avatar.Azula;
import Clases.Avatar.Yue;
import static Clases.Avatar.Katara;
import Clases.Avatar.PrincipeZuko;
import Clases.Avatar.Sokka;
import Clases.Avatar.Suki;
import Clases.Avatar.TophBeifong;
import Clases.Avatar.TyLee;
import Clases.RegularShow.Benson;
import Clases.RegularShow.Fantasmin;
import Clases.RegularShow.Margarita;
import Clases.RegularShow.Mordecai;
import Clases.RegularShow.MrMaellard;
import Clases.RegularShow.Musculoso;
import Clases.RegularShow.Papaleta;
import Clases.RegularShow.Rigby;
import Clases.RegularShow.Skips;
import Clases.RegularShow.Starla;
import java.awt.Image;
import Interfaz.ApplicationWindow;


/**
 *
 * @author santi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrator admin = new Administrator();
        
        
        Avatar avatar = new Avatar();
        RegularShow regularShow = new RegularShow();
        
       
        
        Characters aang = new Avatar.Aang();
        Characters katara = new Avatar.Katara();
        Characters principezuko = new Avatar.PrincipeZuko();
        Characters tophbeifong = new Avatar.TophBeifong();
        Characters azula = new Avatar.Azula();
        Characters sokka = new Avatar.Sokka();
        Characters tylee = new Avatar.TyLee();
        Characters iroh = new Avatar.Yue();
        Characters appa = new Avatar.Appa();
        Characters suki = new Avatar.Suki();

        Characters mordecai = new RegularShow.Mordecai();
        Characters rigby = new RegularShow.Rigby();
        Characters musculoso = new RegularShow.Musculoso();
        Characters benson = new RegularShow.Benson();
        Characters skips = new RegularShow.Skips();
        Characters fantasma = new RegularShow.Fantasmin();
        Characters margarita = new RegularShow.Margarita();
        Characters mrmaellard = new RegularShow.MrMaellard();
        Characters papaleta = new RegularShow.Papaleta();
        Characters starla = new RegularShow.Starla();

        // Se crean instancias de todos los personajes de Avatar y Regular Show
        // Se agregan a las colas de prioridad

        avatar.DetCalidadPersonajes(aang);
        avatar.DetCalidadPersonajes(katara);
        avatar.DetCalidadPersonajes(principezuko);
        avatar.DetCalidadPersonajes(tophbeifong);
        avatar.DetCalidadPersonajes(azula);
        avatar.DetCalidadPersonajes(sokka);
        avatar.DetCalidadPersonajes(tylee);
        avatar.DetCalidadPersonajes(iroh);
        avatar.DetCalidadPersonajes(appa);
        avatar.DetCalidadPersonajes(suki);

        regularShow.DetCalidadPersonajes(mordecai);
        regularShow.DetCalidadPersonajes(rigby);
        regularShow.DetCalidadPersonajes(musculoso);
        regularShow.DetCalidadPersonajes(benson);
        regularShow.DetCalidadPersonajes(skips);
        regularShow.DetCalidadPersonajes(fantasma);
        regularShow.DetCalidadPersonajes(margarita);
        regularShow.DetCalidadPersonajes(mrmaellard);
        regularShow.DetCalidadPersonajes(papaleta);
        regularShow.DetCalidadPersonajes(starla);
        
        avatar.priority1A.print();
        

    }
   
    
}
