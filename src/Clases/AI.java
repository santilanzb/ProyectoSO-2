/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author santi
 */
public class AI extends Thread {
    
    List fightRegularShow = new List();
    List fightAvatar = new List();
    List Winners = new List();
    
    Avatar avatar = new Avatar();
    RegularShow regularshow = new RegularShow();
    
    @Override
    public void run() {
        
    }
    
    public void Pelea(Characters characters1,Characters characters2 ){
        fightRegularShow.insertBegin(characters1);
        fightAvatar.insertBegin(characters2);
        
        
        
        
    }
}
