/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity.billing.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class Splash {
    public static void main(String[] args){
    frame f1=new frame();
    f1.setVisible(true);//show frame f1
    int i;
    int x=1;
    for(i=2;i<600;i+=4,x+=1){
        f1.setLocation(800-((i+x)/2),500-(i/2)); //figure variation
        f1.setSize(i+x,i);
        try{
            Thread.sleep(5);//ruk ruk ke padhne ke lia 10milisec
        }catch(Exception e){}
        
    }
}
}
class frame extends JFrame implements Runnable{
    Thread t1;
    frame(){
        super("Electricity billig Systems");
        setLayout(new FlowLayout());// noert east south west use karte hai agar grid hua to coloumn aur row
        ImageIcon c1=new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i1=c1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i1); 
        
        JLabel l1=new JLabel(i2);
        add(l1);
        t1=new Thread(this);//threading concept?
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);//jab pura frame khul gaya tab 7 sec delay.
            this.setVisible(false);
            Login l=new Login();
            l.setVisible(true);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        
        
    }
    