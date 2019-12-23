package com.preparation.pandru;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Student extends Applet implements ActionListener {

  Label l1,l2,l3,l4,l5,l6;
  TextField t1,t2,t3,t4,t5;
  Button b1;
  String rno = "";

  public void init(){

    l1 = new Label("Enter Student details");
    l2 = new Label("Enter reg.no");
    t1 = new TextField(25);
    l3 = new Label("Enter Course name");
    t2 = new TextField(25);
    l4 = new Label("Enter semester");
    t3 = new TextField(25);
    l5 = new Label("Enter marks1");
    t4 = new TextField(25);
    l6 = new Label("Enter marks2");
    t5 = new TextField(25);
    b1 = new Button("view project");
    add(l1);
    add(l2);
    add(t1);
    add(l3);
    add(t2);
    add(l4);
    add(t3);
    add(l5);
    add(t4);
    add(l6);
    add(t5);
    add(b1);
    b1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
    try{
        if(e.getSource() == b1){
            int tot;
            rno = "reg no - "+t1.getText()+" course name - "+t2.getText()+" Semester "+t3.getText()+" Marks1 - "
                    +t4.getText()+"Marks2 - "+t5.getText();
            tot = Integer.parseInt(t4.getText())+Integer.parseInt(t5.getText());
            rno = rno+" total : "+tot;
            repaint();
        }
    }catch(NumberFormatException e1){
        showStatus("invalid number");
    }
  }

  public void paint(Graphics g){
   g.drawString(rno,170,220);
  }
}

