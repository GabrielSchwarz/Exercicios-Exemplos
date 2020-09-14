/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import javax.swing.*;
import java.awt.event.*;
public class Exercicio1 implements ActionListener{

    JTextField tf1, tf2, tf3;
    JButton b1;
    
    Exercicio1(){
    JFrame f = new JFrame("Exercicio 1");
    tf1= new JTextField();
    tf1.setBounds(50,50,150,20);
    tf2= new JTextField();
    tf2.setBounds(50,100,150,20);
    tf3= new JTextField();
    tf3.setBounds(50,150,150,20);
    
    b1 = new JButton("Divisão");
    b1.setBounds(50,200,200,50);
    
    
    b1.addActionListener(this);
    f.add(tf1);
    f.add(tf2);
    f.add(tf3);
    f.add(b1);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s1 =  tf1.getText();
        String s2 =  tf2.getText();
        
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        
        if(b == 0){
            tf2.setText("Valor inválido");
            c = a / 1;
        }
        else
        if(e.getSource() == b1) {
            c = a / b;
        }
       
        String result = String.valueOf(c);
        tf3.setText(result);
    }
        
    
    public static void main(String[] args) {
        new Exercicio1();
    }
    
}