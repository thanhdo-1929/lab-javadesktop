/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import GUI.ComboboxDemo;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author __ntnc__
 */
public class ComboboxController {

    ComboboxDemo cd;
    ImageIcon iconBird = new ImageIcon(getClass().getResource("/Image/bird.jpg"));

    public ComboboxController() throws IOException {
        cd = new ComboboxDemo();
        cd.setVisible(true);
        cd.getCbxAnimal().setSelectedIndex(4);
        cd.getLblImage().setIcon(new ImageIcon(getClass().getResource("/Image/pig.jpg")));
        cd.getCbxAnimal().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switch (cd.getCbxAnimal().getSelectedIndex()) {
                    case 0:
                        cd.getLblImage().setIcon(iconBird);
                        break;
                    case 1:
                        cd.getLblImage().setIcon(new ImageIcon(getClass().getResource("/Image/cat.jpg")));
                        break;
                    case 2:
                        cd.getLblImage().setIcon(new ImageIcon(getClass().getResource("/Image/dog.jpg")));
                        break;
                    case 3:
                        cd.getLblImage().setIcon(new ImageIcon(getClass().getResource("/Image/rabbit.jpg")));
                        break;
                    case 4:
                        cd.getLblImage().setIcon(new ImageIcon(getClass().getResource("/Image/pig.jpg")));
                        break;
                }
            }
        });
    }

}
