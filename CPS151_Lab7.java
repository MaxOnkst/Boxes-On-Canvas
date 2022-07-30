/*
 * CPS151_Lab7.java
 */

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;
import labproject7.Box;

/**
 * CPS 151, Section 03
 * Spring 2020 semester
 * 
 * Lab Project 7: Boxes (Graphical Object Classes)
 *
 * @author *** Replace with your name ***
 */

public class CPS151_Lab7 extends javax.swing.JFrame
        implements ActionListener
{
    private ArrayList<Box> Stuff;    // generic list of objects
    
    private Timer timer;
    private static final int DELAY = 3000; // 3 seconds

    /**
     * Creates new form Thing_Form
     */
    public CPS151_Lab7() {
        initComponents();
        
        // create the generic stuff ArrayList
        Stuff = new ArrayList();
        
        // create a timer for this Form
        // with the given delay
        timer = new Timer(DELAY, this);
        
        // start the timer
        timer.start();
    } // end constructor

    /**
     * method is called each time the form is repainted
     * 
     * @param graphics the Form's Graphics object
     */
    @Override
    public void paint(Graphics graphics) {
        // draw the window title, menu, buttons
        super.paint(graphics);
        
        // get the Graphics context for the canvas
        Graphics canvas = canvasPanel.getGraphics();
        
        /*** ADD CODE TO DRAW ON THE canvas AFTER THIS LINE ***/
        for(Box obj: Stuff){
            obj.draw(canvas);
        }
    } // end paint method
    
    /**
     * method is called each time mouse is clicked in the form
     * 
     * add code that does something with the click, like make things...
     * 
     * @param xCoord x-coordinate of the click
     * @param yCoord y-coordinate of the click
     */
    public void mouseClickedAt(int xCoord, int yCoord)
    {
        /*** ADD CODE TO REACT TO USER MOUSE CLICK AFTER THIS LINE ***/
        Random rand = new Random();
        Stuff.add(new Box(xCoord, yCoord,rand.nextInt(40)+10, rand.nextInt(40)+10));
    } // end mouseClickedAt method
        
    /*************************************************************
     *                                                           *
     * WARNING: DO NOT ADD OR MODIFY ANY CODE BELOW THIS LINE!!! *
     *                                                           *
     *************************************************************/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        canvasPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graphical Objects");

        canvasPanel.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                canvasPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout canvasPanelLayout = new javax.swing.GroupLayout(canvasPanel);
        canvasPanel.setLayout(canvasPanelLayout);
        canvasPanelLayout.setHorizontalGroup(
            canvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 999, Short.MAX_VALUE)
        );
        canvasPanelLayout.setVerticalGroup(
            canvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );

        getContentPane().add(canvasPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1015, 775));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void canvasPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasPanelMouseClicked
        mouseClickedAt(evt.getX(), evt.getY());
    }//GEN-LAST:event_canvasPanelMouseClicked

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
            java.util.logging.Logger.getLogger(CPS151_Lab7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CPS151_Lab7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CPS151_Lab7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CPS151_Lab7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CPS151_Lab7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel canvasPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        repaint();
    }
}