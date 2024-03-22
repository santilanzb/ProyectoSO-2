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

    
            
    public static void main(String[] args) {
        ApplicationWindow appWindow = new ApplicationWindow();
        AI ai = new AI(appWindow);
        Administrator admin = new Administrator(ai, appWindow);
        admin.start();
        java.awt.EventQueue.invokeLater(new Runnable()  {
            public void run() {
                appWindow.setVisible(true);
            }
        });
    }
   
    
}
