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


/**
 *
 * @author santi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Personajes Avatar
//        Avatar avatar = new Avatar();
//        Aang aang = new Aang();
//        Katara katara = new Katara();
//        PrincipeZuko principezuko = new PrincipeZuko();
//        TophBeifong tophbeifong = new TophBeifong();
//        Azula azula = new Azula();
//        Sokka sokka = new Sokka();
//        TyLee tylee = new TyLee();
//        Yue iroh = new Yue();
//        Appa appa = new Appa();
//        Suki suki = new Suki();
//
//        //Agregar Colas prioridad Avatar
//        avatar.DetCalidadPersonajes(aang);
//        avatar.DetCalidadPersonajes(katara);
//        avatar.DetCalidadPersonajes(principezuko);
//        avatar.DetCalidadPersonajes(tophbeifong);
//        avatar.DetCalidadPersonajes(azula);
//        avatar.DetCalidadPersonajes(sokka);
//        avatar.DetCalidadPersonajes(tylee);
//        avatar.DetCalidadPersonajes(iroh);
//        avatar.DetCalidadPersonajes(appa);
//        avatar.DetCalidadPersonajes(suki);
//
//        // Mostrar Colas Avatar
//       System.out.println("C1 Avatar");
//       avatar.priority1A.print();
//       System.out.println("");
//       System.out.println("C2 Avatar");
//       avatar.priority2A.print();
//       System.out.println("");
//       System.out.println("C3 Avatar");
//       avatar.priority3A.print();
//       System.out.println("");
//       System.out.println("");
//
//       // Personajes Regular Show
//       RegularShow regularshow = new RegularShow();
//       Mordecai mordecai = new Mordecai();
//       Rigby rigby = new Rigby();
//       Musculoso musculoso = new Musculoso();
//       Benson benson = new Benson();
//       Skips skips = new Skips();
//       Papaleta  papaleta = new  Papaleta();
//       Starla starla = new Starla();
//       Margarita margarita = new Margarita();
//       Fantasmin fantasmin = new Fantasmin();
//       MrMaellard mrmaellard = new MrMaellard();
//
//       //Agregar Colas prioridad RegularShow
//       regularshow.DetCalidadPersonajes(mordecai);
//       regularshow.DetCalidadPersonajes(rigby);
//       regularshow.DetCalidadPersonajes(musculoso);
//       regularshow.DetCalidadPersonajes(benson);
//       regularshow.DetCalidadPersonajes(skips);
//       regularshow.DetCalidadPersonajes(papaleta);
//       regularshow.DetCalidadPersonajes(starla);
//       regularshow.DetCalidadPersonajes(margarita);
//       regularshow.DetCalidadPersonajes(fantasmin);
//       regularshow.DetCalidadPersonajes(mrmaellard);
//
//       // Mostrar Colas RegularShow
//        System.out.println("C1 RegularShow");
//        regularshow.priority1RS.print();
//        System.out.println("");
//        System.out.println("C2 RegularShow");
//        regularshow.priority2RS.print();
//        System.out.println("");
//        System.out.println("C3 RegularShow");
//        regularshow.priority3RS.print();
//        System.out.println("");
//        System.out.println("");
//
//
//        //AI ai = new AI();
//       //ai.Pelea((Characters) regularshow.priority1RS.getHead().getElement(),(Characters) avatar.priority1A.getHead().getElement());
//        //ai.Winners.print();
//
//        //System.out.println("");
//        //System.out.println("C1 Avatar");
//        //avatar.priority1A.print();
//        //System.out.println("C1 RegularShow");
//        //regularshow.priority1RS.print();
//
//
//        aang.setPhoto("src/ImagesAvatar/Aang.jpg");
//        Image photo = aang.getPhoto();

                // Create instances of Characters
        Characters aang = new Avatar.Aang();
        Characters katara = new Avatar.Katara();
        Characters zuko = new Avatar.PrincipeZuko();
        Characters mordecai = new RegularShow.Mordecai();
        Characters rigby = new RegularShow.Rigby();
        Characters musculoso = new RegularShow.Musculoso();

        // Create instances of Avatar and RegularShow
        Avatar avatar = new Avatar();
        RegularShow regularShow = new RegularShow();

        // Add Characters to the queues in Avatar and RegularShow
        avatar.priority1A.enqueue(aang);
        avatar.priority2A.enqueue(katara);
        avatar.priority3A.enqueue(zuko);
        regularShow.priority1RS.enqueue(mordecai);
        regularShow.priority2RS.enqueue(rigby);
        regularShow.priority3RS.enqueue(musculoso);

        // Print the size of the queues to check if the characters are added
        System.out.println("Size of Avatar queue 1: " + avatar.priority1A.getLength());
        System.out.println("Size of Avatar queue 2: " + avatar.priority2A.getLength());
        System.out.println("Size of Avatar queue 3: " + avatar.priority3A.getLength());
        System.out.println("Size of RegularShow queue 1: " + regularShow.priority1RS.getLength());
        System.out.println("Size of RegularShow queue 2: " + regularShow.priority2RS.getLength());
        System.out.println("Size of RegularShow queue 3: " + regularShow.priority3RS.getLength());

        // Create an instance of AI and start it
        AI ai = new AI();
        ai.start();
            }

    
}
