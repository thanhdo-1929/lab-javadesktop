/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import GUI.AddCourse;
import GUI.MainScreen;
import Model.Course;
import javax.swing.JOptionPane;

/**
 *
 * @author __ntnc__
 */
public class AddCourseController extends javax.swing.JDialog {

    AddCourse ac;

    public AddCourseController(MainScreenController parent) {
        
        ac = new AddCourse(parent.ms, false);
        ac.setVisible(true);

        ac.getBtnClear().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac.getTxtCode().setText("");
                ac.getTxtCredit().setText("");
                ac.getTxtName().setText("");
            }
        });

        ac.getBtnAdd().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String regex = "[0-9]+";
                if (ac.getTxtCode().getText().equals("") || ac.getTxtCredit().getText().equals("") 
                        || ac.getTxtName().getText().equals("")) {
                    JOptionPane.showMessageDialog(ac, "Code, name and credit cannot be empty !");
                } else if (!ac.getTxtCredit().getText().matches(regex)) {
                    JOptionPane.showMessageDialog(ac, "Credit cannot contain word !");
                } else if (Integer.parseInt(ac.getTxtCredit().getText()) < 0 || (Integer.parseInt(ac.getTxtCredit().getText()) > 33)) {
                    JOptionPane.showMessageDialog(ac, "Credit must be a positive number and less than or equals to 33 !");
                } else {
                    String code = ac.getTxtCode().getText();
                    String name = ac.getTxtName().getText();
                    int credit = Integer.parseInt(ac.getTxtCredit().getText());
                    Course c = new Course(code, name, credit);
                    parent.addCourse(c, code);
                }
            }
        });
    }

}
