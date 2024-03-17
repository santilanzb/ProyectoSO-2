/**
 *
 * @author santi
 */
package Clases;

public class Administrator extends Thread {
    Avatar avatar = new Avatar();
    RegularShow regularShow = new RegularShow();

    @Override
    public void run() {

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

        while (true) {
            administrarColas();
            try {
                Thread.sleep(1000); // Sleep for a while before checking the queues again
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void administrarColas() {
        AI ai = new AI();
        Characters character1 = null;
        Characters character2 = null;

        // Fetch the head of the queue with the highest priority from Avatar
        if (!avatar.priority1A.isEmpty()) {
            character1 = (Characters) avatar.priority1A.dequeue().getElement();
        } else if (!avatar.priority2A.isEmpty()) {
            character1 = (Characters) avatar.priority2A.dequeue().getElement();
        } else if (!avatar.priority3A.isEmpty()) {
            character1 = (Characters) avatar.priority3A.dequeue().getElement();
        }

        // Fetch the head of the queue with the highest priority from RegularShow
        if (!regularShow.priority1RS.isEmpty()) {
            character2 = (Characters) regularShow.priority1RS.dequeue().getElement();
        } else if (!regularShow.priority2RS.isEmpty()) {
            character2 = (Characters) regularShow.priority2RS.dequeue().getElement();
        } else if (!regularShow.priority3RS.isEmpty()) {
            character2 = (Characters) regularShow.priority3RS.dequeue().getElement();
        }

        // If we have a character from both shows, make them fight
        if (character1 != null && character2 != null) {
            ai.Pelea(character1, character2);
        }
    }
}