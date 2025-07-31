package travel.management.systemm;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    public void run() {
        try {
             for (int i=1; i<=101; i++) {
                 int max = bar.getMaximum();
                 int value = bar.getValue();
                 
                 if(value < max) {
                     bar.setValue(bar.getValue() + 1);
                 }else {
                     setVisible(false);
                     new Dashboard(username);
                 }
                 Thread.sleep(40);
                 
             }  
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    Loading(String username) {
        this.username = username;
        t = new Thread(this);
        setBounds(500, 200, 650, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Travel and Tourism Application");
        text.setBounds(50, 20, 600, 40);
        text.setForeground(Color.DARK_GRAY);
        text.setFont(new Font("Raleway", Font.BOLD, 35));
        add(text);
        
        bar = new JProgressBar();
        bar.setBounds(150, 100, 300, 35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel Loading = new JLabel("Loading, please wait...");
        Loading.setBounds(220, 130, 180, 30);
        Loading.setForeground(Color.red);
        Loading.setFont(new Font("Raleway", Font.BOLD, 17));
        add(Loading);
        
         JLabel lblusername = new JLabel("Welcome" + username);
        lblusername.setBounds(20, 310, 400, 40);
        lblusername.setForeground(Color.black);
        lblusername.setFont(new Font("Raleway", Font.BOLD, 20));
        add(lblusername);
        
        t.start();
        setVisible(true);
                
        
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
      new Loading("");  
    }
}
