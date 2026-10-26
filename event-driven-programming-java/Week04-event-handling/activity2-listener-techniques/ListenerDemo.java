import javax.swing.*; 
import java.awt.*;
 import java.awt.event.ActionEvent; 
 import java.awt.event.ActionListener; 
public class ListenerDemo {      
// ============================================================   //   
// // TECHNIQUE 1: A NAMED CLASS (reusable, but verbose)     // ============================================================     static class NamedClassListener implements ActionListener {         @Override         public void actionPerformed(ActionEvent e) {             System.out.println("Style 1: Named class listener fired!");         }     }      public static void main(String[] args) {         SwingUtilities.invokeLater(ListenerDemo::createAndShow);     }      private static void createAndShow() { 