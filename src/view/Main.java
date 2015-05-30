package view;

import Controller.FController;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Main extends JFrame{
	public Main() {
		
		setSize(344, 197);
		setVisible(true);
		setTitle("Five Famous Card Game");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnTwo = new JButton("Play");
		btnTwo.setBounds(111, 82, 103, 35);
		getContentPane().add(btnTwo);
		btnTwo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) 
            {
                FController control = new FController();
                control.setPlayers(2);
                Play2 play = new Play2(control);
                play.setTurn();
            	Thread th = new Thread(play);
                th.start();
            }
        }
		);
		
		JLabel lblNewLabel = new JLabel("Five Famous Card Game");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(67, 22, 211, 49);
		getContentPane().add(lblNewLabel);
	}
	
}
