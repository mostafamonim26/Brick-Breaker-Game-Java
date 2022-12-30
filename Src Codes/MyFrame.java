
package brickbreaker;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame implements ActionListener{
    
    JButton easy;
    JButton hard;
    JButton text;
    JLabel label;
    
    MyFrame(){
        
        label = new JLabel();
        label.setText("**Welcome to Bricks Breaker Game**");
        label.setBounds(170, 10, 350, 50);
        label.setFont(new Font("Comic Sans",Font.BOLD,20));
                
        
        text = new JButton();
        text.setBounds(70, 120, 500, 50);
        text.addActionListener(this);
        text.setText("Please Choose a Level to play the Game.");
        text.setFocusable(false);
        text.setFont(new Font("Comic Sans",Font.BOLD,20));
        text.setForeground(Color.YELLOW);
        text.setBackground(Color.gray);
        text.setBorder(BorderFactory.createEtchedBorder());
        
        easy = new JButton();
        easy.setBounds(190, 250,100, 50);
        easy.addActionListener(this);
        easy.setText("EASY");
        easy.setFocusable(false);
        easy.setFont(new Font("Comic Sans",Font.BOLD,20));
        easy.setForeground(Color.green);
        easy.setBackground(Color.black);
        
        
        hard = new JButton();
        hard.setBounds(340, 250,100, 50);
        hard.addActionListener(this);
        hard.setText("HARD");
        hard.setFocusable(false);
        hard.setFont(new Font("Comic Sans",Font.BOLD,20));
        hard.setForeground(Color.RED);
        hard.setBackground(Color.black);
        
        JFrame obj = new JFrame();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setLayout(null);
        obj.setSize(500,500);
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle ("Bricks Breaker Game");
        obj.setVisible(true);
        
        obj.add(label);
        obj.add(text);
        obj.add(easy);
        obj.add(hard);
          
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==easy){
            
            JFrame obj = new JFrame();
            Gameplay gamePlay = new Gameplay();
            obj.setBounds(10, 10, 700, 600);
            obj.setTitle ("Bricks-Breaker (Level: EASY)");
            obj.setResizable(false);
            obj.setVisible(true);
            obj.add(gamePlay);
            
        }
        if(e.getSource()==hard){
            
            JFrame obj = new JFrame();
            Gameplay2 gamePlay = new Gameplay2();
            obj.setBounds(10, 10, 700, 600);
            obj.setTitle ("Bricks-Breaker (Level: HARD)");
            obj.setResizable(false);
            obj.setVisible(true);           
            obj.add(gamePlay);}
        }
    }
    
