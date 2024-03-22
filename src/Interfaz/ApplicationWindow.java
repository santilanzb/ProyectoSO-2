/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Clases.Administrator;
import Clases.Characters;
import java.awt.Image;
import javax.swing.ImageIcon;
import Clases.AI;

/**
 *
 * @author santi
 */
public class ApplicationWindow extends javax.swing.JFrame {
    private Administrator administrator;
    /**
     * Creates new form ApplicationWindow
     */
    public ApplicationWindow() {
        initComponents();
        
        setLocationRelativeTo(null);
        AI ai = new AI(this);
        jTextField1.setText(ai.Acciones());
        //jTextArea2.setText(Integer.toString(ai.getWinnerRS()));
        //jTextArea4.setText(Integer.toString(ai.getWinnerA()));
        administrator = new Administrator(ai, this);
        avatarList.setModel(administrator.getAvatarListModel());
        regularShowList.setModel(administrator.getRegularShowListModel());
        
        
        new Thread(administrator).start();
    }
    
    public void updateCharacterInfo(Characters character1, Characters character2) {
    // Update text areas with character info
    character1InfoTextArea.setText(character1.toString()); 
    character2InfoTextArea.setText(character2.toString());

    // Update image labels with character photos
    ImageIcon imageIcon1 = new ImageIcon(new ImageIcon(character1.getPhoto()).getImage().getScaledInstance(character1ImageLabel.getWidth(), character1ImageLabel.getHeight(), Image.SCALE_DEFAULT));
    character1ImageLabel.setIcon(imageIcon1);

    ImageIcon imageIcon2 = new ImageIcon(new ImageIcon(character2.getPhoto()).getImage().getScaledInstance(character2ImageLabel.getWidth(), character2ImageLabel.getHeight(), Image.SCALE_DEFAULT));
    character2ImageLabel.setIcon(imageIcon2);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        regularShowList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        avatarList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        character1ImageLabel = new javax.swing.JLabel();
        character2ImageLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        character1InfoTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        character2InfoTextArea = new javax.swing.JTextArea();
        jSlider2 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regularShowList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        regularShowList.setName("regularShowList"); // NOI18N
        jScrollPane1.setViewportView(regularShowList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 560, 249, 93));

        avatarList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        avatarList.setName("avatarList"); // NOI18N
        jScrollPane2.setViewportView(avatarList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 249, 95));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Regular");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, 270, 60));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Avatar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 230, -1));

        jLabel3.setFont(new java.awt.Font("Engravers MT", 0, 75)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fight");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 370, 80));
        getContentPane().add(character1ImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 130, 100));
        getContentPane().add(character2ImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 135, 130, 100));

        character1InfoTextArea.setColumns(20);
        character1InfoTextArea.setRows(5);
        jScrollPane3.setViewportView(character1InfoTextArea);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 130, 180));

        character2InfoTextArea.setColumns(20);
        character2InfoTextArea.setRows(5);
        jScrollPane4.setViewportView(character2InfoTextArea);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 130, 180));

        jSlider2.setMaximum(17);
        jSlider2.setMinimum(3);
        jSlider2.setMinorTickSpacing(7);
        jSlider2.setPaintTicks(true);
        jSlider2.setValue(10);
        jSlider2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jSlider2ComponentAdded(evt);
            }
        });
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });
        getContentPane().add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("10");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 80, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 190, -1));

        jLabel6.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Show");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 510, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Timer");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 600, 70, 50));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane6.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 70, 50));

        jLabel9.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Wins");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, -1, -1));

        jLabel8.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Wins");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1200px-Campo_de_batalla_día_SSB4.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jSlider2ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider2ComponentAdded

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
       jLabel4.setText(Integer.toString(jSlider2.getValue()));
       int x = jSlider2.getValue();
       x = x * 1000;
       administrator.setTime(x);
    }//GEN-LAST:event_jSlider2StateChanged

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ApplicationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicationWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> avatarList;
    private javax.swing.JLabel character1ImageLabel;
    private javax.swing.JTextArea character1InfoTextArea;
    private javax.swing.JLabel character2ImageLabel;
    private javax.swing.JTextArea character2InfoTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> regularShowList;
    // End of variables declaration//GEN-END:variables
}
