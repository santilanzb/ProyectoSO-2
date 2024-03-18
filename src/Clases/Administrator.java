/**
 *
 * @author santi
 */
package Clases;
import javax.swing.*;
import java.util.Random;

public class Administrator extends Thread {
    Avatar avatar = new Avatar();
    RegularShow regularShow = new RegularShow();

    private DefaultListModel<String> avatarListModel;
    private DefaultListModel<String> regularShowListModel;
    
    public Administrator(){
        avatarListModel = new DefaultListModel<>();
        regularShowListModel = new DefaultListModel<>();
    }
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
            updateQueueList(avatar.priority1A, avatar.priority2A, avatar.priority3A, avatarListModel);
            updateQueueList(regularShow.priority1RS, regularShow.priority2RS, regularShow.priority3RS, regularShowListModel);
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
        
            // Add print statements to check the state of your queues and characters
        System.out.println("administrarColas method called");
        System.out.println("Initial state of avatar.priority1A: " + avatar.priority1A);
        System.out.println("Initial state of avatar.priority2A: " + avatar.priority2A);
        System.out.println("Initial state of avatar.priority3A: " + avatar.priority3A);
        System.out.println("Initial state of regularShow.priority1RS: " + regularShow.priority1RS);
        System.out.println("Initial state of regularShow.priority2RS: " + regularShow.priority2RS);
        System.out.println("Initial state of regularShow.priority3RS: " + regularShow.priority3RS);

        // Increment the counter for each character in the priority2A and priority3A queues
        incrementCountersAndCheck(avatar.priority2A, avatar.priority3A, avatar.priority1A);
        incrementCountersAndCheck(avatar.priority3A, null, avatar.priority2A);

        // Increment the counter for each character in the priority2RS and priority3RS queues
        incrementCountersAndCheck(regularShow.priority2RS, regularShow.priority3RS, regularShow.priority1RS);
        incrementCountersAndCheck(regularShow.priority3RS, null, regularShow.priority2RS);

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

    private void updateQueueList(Queue priority1, Queue priority2, Queue priority3, DefaultListModel<String> listModel) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                listModel.clear();
                listModel.addElement("Priority 1: " + queueToString(priority1));
                listModel.addElement("Priority 2: " + queueToString(priority2));
                listModel.addElement("Priority 3: " + queueToString(priority3));
            }
        });
    }
    
    private String queueToString(Queue queue) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < queue.getLength(); i++) {
            Characters character = (Characters) queue.dequeue().getElement();
            sb.append(character.getName()).append(", ");
            queue.enqueue(character);
        }
        return sb.toString();
    }
    
    public DefaultListModel<String> getAvatarListModel() {
        return avatarListModel;
    }

    public DefaultListModel<String> getRegularShowListModel() {
        return regularShowListModel;
    }


    public void addRandomCharacter() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);

        if (randomNumber == 0) {
            avatar.DetCalidadPersonajes(new Avatar.Aang());
            regularShow.DetCalidadPersonajes(new RegularShow.Mordecai());
        } else if (randomNumber == 1) {
            avatar.DetCalidadPersonajes(new Avatar.Katara());
            regularShow.DetCalidadPersonajes(new RegularShow.Rigby());
        } else if (randomNumber == 2) {
            avatar.DetCalidadPersonajes(new Avatar.PrincipeZuko());
            regularShow.DetCalidadPersonajes(new RegularShow.Musculoso());
        } else if (randomNumber == 3) {
            avatar.DetCalidadPersonajes(new Avatar.TophBeifong());
            regularShow.DetCalidadPersonajes(new RegularShow.Benson());
        } else if (randomNumber == 4) {
            avatar.DetCalidadPersonajes(new Avatar.Azula());
            regularShow.DetCalidadPersonajes(new RegularShow.Skips());
        } else if (randomNumber == 5) {
            avatar.DetCalidadPersonajes(new Avatar.Sokka());
            regularShow.DetCalidadPersonajes(new RegularShow.Fantasmin());
        } else if (randomNumber == 6) {
            avatar.DetCalidadPersonajes(new Avatar.TyLee());
            regularShow.DetCalidadPersonajes(new RegularShow.Margarita());
        } else if (randomNumber == 7) {
            avatar.DetCalidadPersonajes(new Avatar.Yue());
            regularShow.DetCalidadPersonajes(new RegularShow.MrMaellard());
        } else if (randomNumber == 8) {
            avatar.DetCalidadPersonajes(new Avatar.Appa());
            regularShow.DetCalidadPersonajes(new RegularShow.Papaleta());
        } else if (randomNumber == 9) {
            avatar.DetCalidadPersonajes(new Avatar.Suki());
            regularShow.DetCalidadPersonajes(new RegularShow.Starla());
        }
    }

    public void incrementCountersAndCheck(Queue currentQueue, Queue nextQueue, Queue previousQueue) {
        for (int i = 0; i < currentQueue.getLength(); i++) {
            Characters character = (Characters) currentQueue.dequeue().getElement();
            character.incrementCounter();
            if (character.counter >= 8 && previousQueue != null) {
                character.resetCounter();
                previousQueue.enqueue(character);
            } else {
                currentQueue.enqueue(character);
            }
        }
    }
}