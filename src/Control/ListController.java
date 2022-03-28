/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import GUI.ListDemo;
import javax.swing.ImageIcon;

/**
 *
 * @author __ntnc__
 */
public class ListController {

    ListDemo ld;
//    ImageIcon iconBird = new ImageIcon("D:\\ImageIcon\\bird.jpg");
//    ImageIcon iconCat = new ImageIcon("D:\\ImageIcon\\cat.jpg");
//    ImageIcon iconDog = new ImageIcon("D:\\ImageIcon\\dog.jpg");
//    ImageIcon iconRabbit = new ImageIcon("D:\\ImageIcon\\rabbit.jpg");
//    ImageIcon iconPig = new ImageIcon("D:\\ImageIcon\\pig.jpg");

    public ListController() {
        ld = new ListDemo();
        ld.setVisible(true);
        ld.getListAnimal().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switch (ld.getListAnimal().getSelectedIndex()) {
                    case 0:
                        ld.getLblImage().setIcon(new ImageIcon(getClass().getResource("/Image/bird.jpg")));
                        break;
                    case 1:
                        ld.getLblImage().setIcon(new ImageIcon(getClass().getResource("/Image/cat.jpg")));
                        break;
                    case 2:
                        ld.getLblImage().setIcon(new ImageIcon(getClass().getResource("/Image/dog.jpg")));
                        break;
                    case 3:
                        ld.getLblImage().setIcon(new ImageIcon(getClass().getResource("/Image/rabbit.jpg")));
                        break;
                    case 4:
                        ld.getLblImage().setIcon(new ImageIcon(getClass().getResource("/Image/pig.jpg")));
                        break;
                }
            }
        });
    }

}
