/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import javax.swing.*;
import java.awt.event.*;
public class Exercicio2 implements ActionListener{

    JTextField tf1, tf2, tf3, tf4, tf5, tf6;
    JButton b1;
    
    Exercicio2(){
    JFrame f = new JFrame("Exercicio 2");
    tf1= new JTextField();
    tf1.setBounds(50,50,150,20);
    
    tf2= new JTextField();
    tf2.setBounds(50,100,150,20);
    
    tf3= new JTextField();
    tf3.setBounds(50,150,150,20);
    
    tf4= new JTextField();
    tf4.setBounds(50,200,150,20);
    
    tf5= new JTextField();
    tf5.setBounds(50,250,150,20);
    
    tf6= new JTextField();
    tf6.setBounds(50,300,150,20);
    
    b1 = new JButton("Média");
    b1.setBounds(50,350,200,50);
    
    
    b1.addActionListener(this);
    f.add(tf1);
    f.add(tf2);
    f.add(tf3);
    f.add(tf4);
    f.add(tf5);
    f.add(tf6);
    f.add(b1);
    f.setSize(600,600);
    f.setLayout(null);
    f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s1 =  tf1.getText();
        String s2 =  tf2.getText();
        String s3 =  tf3.getText();
        String s4 =  tf4.getText();
        
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int d = Integer.parseInt(s4);
        int r = 0;
        
        if(e.getSource() == b1) {
            r = (a + b + c + d) / 4;
            if (r >= 6){
        String result = String.valueOf(r);
        tf5.setText(result);
        tf6.setText("Aprovado");
            }else {
                String result = String.valueOf(r);
            tf5.setText(result);
            tf6.setText("Reprovado");
            }
        }
    }
        
    
    public static void main(String[] args) {
        new Exercicio2();
    }
    
}
