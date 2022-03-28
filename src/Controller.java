
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author __ntnc__
 */
public class Controller {

    Screen s;
    private int prevX, prevY;
    private Graphics graphicForDrawing;
    private Graphics graphicForControl;
    private int color = -1;

    public Controller() {
        s = new Screen();
        s.setVisible(true);

        graphicForDrawing = s.getPanelDraw().getGraphics();
        graphicForControl = s.getPanelControl().getGraphics();
        s.getLblBlack().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBorder();
                //drawBorder(s.getLblBlack());
                graphicForControl.setColor(Color.white);
                graphicForControl.drawRect(s.getLblBlack().getX(), s.getLblBlack().getY(), s.getLblBlack().getWidth(), s.getLblBlack().getHeight());
                //graphicForControl.drawRect(3, 4, prevX, prevX);
                color = 0;
            }
        });

        s.getLblRed().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBorder();
                drawBorder(s.getLblRed());
                color = 1;
            }
        });

        s.getLblGreen().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBorder();
                drawBorder(s.getLblGreen());
                color = 2;
            }
        });

        s.getLblBlue().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBorder();
                drawBorder(s.getLblBlue());
                color = 3;
            }
        });

        s.getLblCyan().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBorder();
                drawBorder(s.getLblCyan());
                color = 4;
            }
        });

        s.getLblMagenta().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBorder();
                drawBorder(s.getLblMagenta());
                color = 5;
            }
        });

        s.getLblYellow().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBorder();
                drawBorder(s.getLblYellow());
                color = 6;
            }
        });

        s.getLblClear().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s.getPanelDraw().repaint();
            }
        });

        // when user dragging mouse
        s.getPanelDraw().addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                int x = evt.getX();   // x-coordinate of mouse.
                int y = evt.getY();   // y-coordinate of mouse.
                graphicForDrawing.drawLine(prevX, prevY, x, y);  // Draw the line.
                prevX = x;  // Get ready for the next line segment in the curve.
                prevY = y;
            }
        });

        s.getPanelDraw().addMouseListener(new java.awt.event.MouseAdapter() {
            //when user pressed
            public void mousePressed(java.awt.event.MouseEvent evt) {
                int x = evt.getX();   // x-coordinate where the user clicked.
                int y = evt.getY();   // y-coordinate where the user clicked.
                int width = s.getPanelDraw().getWidth();    // Width of the panel.
                int height = s.getPanelDraw().getHeight();  // Height of the panel.
                if (x > 0 && x < width && y > 0 && y < height) {
                    prevX = x;
                    prevY = y;
                    setUpDrawingGraphics();
                }
            }

//            public void mouseReleased(java.awt.event.MouseEvent evt) {
//                graphicForDrawing.dispose();
//                graphicForDrawing = null;
//            }
        });
    }

    public void drawBorder(JLabel label) {
        Border border = BorderFactory.createLineBorder(Color.white, 2);
        label.setBorder(border);
        
    }

    public void clearBorder() {
        s.getLblBlack().setBorder(null);
        s.getLblRed().setBorder(null);
        s.getLblBlue().setBorder(null);
        s.getLblCyan().setBorder(null);
        s.getLblMagenta().setBorder(null);
        s.getLblYellow().setBorder(null);
        s.getLblGreen().setBorder(null);
    }

    private void setUpDrawingGraphics() {
        //graphicForDrawing = s.getPanelDraw().getGraphics();
        switch (color) {
            case 0:
                graphicForDrawing.setColor(Color.BLACK);
                break;
            case 1:
                graphicForDrawing.setColor(Color.RED);
                break;
            case 2:
                graphicForDrawing.setColor(Color.GREEN);
                break;
            case 3:
                graphicForDrawing.setColor(Color.BLUE);
                break;
            case 4:
                graphicForDrawing.setColor(Color.CYAN);
                break;
            case 5:
                graphicForDrawing.setColor(Color.MAGENTA);
                break;
            case 6:
                graphicForDrawing.setColor(Color.YELLOW);
                break;
        }
    } // end setUpDrawingGraphics()
}
