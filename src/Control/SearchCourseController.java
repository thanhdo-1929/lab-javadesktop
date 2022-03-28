/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import GUI.SearchCourse;
import Model.Course;
import javax.swing.JOptionPane;

public class SearchCourseController extends javax.swing.JDialog {

    SearchCourse sc;

    public SearchCourseController(MainScreenController parent) {
        
        sc = new SearchCourse(parent.ms, false);
        sc.setVisible(true);

        sc.getBtnSearch().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String code = sc.getTxtCode().getText();
                Course c = parent.searchCourse(code);
                if (c == null) {
                    JOptionPane.showMessageDialog(rootPane, "Code is not exist !");
                } else {
                    sc.getLblName().setText(c.getName());
                    sc.getLblCredit().setText(c.getCredit() + "");
                }
            }
        });
    }

}
