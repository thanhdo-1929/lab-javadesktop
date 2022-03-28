/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import GUI.ListCourse;

/**
 *
 * @author __ntnc__
 */
public class ListCourseController extends javax.swing.JDialog {
    
    ListCourse lc;
    
    public ListCourseController(MainScreenController parent) {
        lc = new ListCourse(parent.ms, false);
        lc.setVisible(true);
        
        String course = parent.getCourses();
        lc.getTxtCourses().setText(course);
    }  
}
