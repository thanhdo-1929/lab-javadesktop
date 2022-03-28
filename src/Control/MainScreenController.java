
package Control;
import GUI.MainScreen;
import Model.Course;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainScreenController {
    MainScreen ms;
    ArrayList<Course> courses = new ArrayList<>();
    public MainScreenController() {
        ms = new MainScreen();
        ms.setVisible(true);
        ms.getBtnAdd().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCourseController ac = new AddCourseController(MainScreenController.this);
            }
        });
        ms.getBtnDisplay().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListCourseController lc = new ListCourseController(MainScreenController.this);
            }
        });
        ms.getBtnSearch().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCourseController sc = new SearchCourseController(MainScreenController.this);
            }
        });
        ms.getBtnExit().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });
    }
    public String getCourses() {
        String courseName = "";
        for (int i = 0; i < courses.size(); i++) {
            for (int j = 0; j < courses.size(); j++) {
                if (courses.get(i).getCredit() < courses.get(j).getCredit()) {
                    Course temp = courses.get(i);
                    courses.set(i, courses.get(j));
                    courses.set(j, temp);
                }
            }
        }
        for (int i = 0; i < courses.size(); i++) {
            courseName += courses.get(i).toString() + "\n";
        }
        return courseName;
    }

    public boolean isExisted(String code) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    public void addCourse(Course c, String code) {
        if (isExisted(code)) {
            JOptionPane.showMessageDialog(ms, "This code already exist!");
        } else {
            courses.add(c);
        }
        for (int i = 0; i < courses.size(); i++) {
            String name = courses.get(i).getName();
            // to lower case all
            name = name.toLowerCase();
            // replace all unnessary space
            name = name.trim().replaceAll(" +", " ");
            // to upper case all the first word
            String words[] = name.split(" ");
            String finalName = "";
            for (String w : words) {
                String first = w.substring(0, 1);
                String afterfirst = w.substring(1);
                finalName += first.toUpperCase() + afterfirst + " ";
            }
            name = finalName.trim();
            courses.get(i).setName(name);
        }
    }

    public Course searchCourse(String code) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCode().equals(code)) {
                return courses.get(i);
            }
        }
        return null;
    }
}
