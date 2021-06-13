package main;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class managerMain extends JFrame{
   
   JTextArea jt;
   
   public managerMain() {
      jt=new JTextArea();
      
      add(jt);

      setBounds(0, 100, 300, 400); //x,y,w,h
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   
   public static void main(String[] args) {
      new managerMain();
   }
}