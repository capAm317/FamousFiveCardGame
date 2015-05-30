package view;

import Controller.FController;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class Play4 extends JFrame{
	public Play4(FController control) {
		
		setSize(1122, 700);
		setVisible(true);
		setTitle("Five Famous Card Game");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel Player1 = new JPanel();
		Player1.setBounds(148, 523, 822, 148);
		getContentPane().add(Player1);
		Player1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Player 1"));
		Player1.setLayout(null);
		
		JPanel Statistics = new JPanel();
		Statistics.setBounds(627, 11, 185, 126);
		Player1.add(Statistics);
		Statistics.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Statistics"));
		Statistics.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel.setBounds(30, 36, 62, 90);
		Player1.add(panel);
		panel.addMouseListener(new PopClickListener());
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_1.setBounds(102, 36, 62, 90);
		Player1.add(panel_1);
		panel_1.addMouseListener(new PopClickListener());
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_2.setBounds(174, 36, 62, 90);
		Player1.add(panel_2);
		panel_2.addMouseListener(new PopClickListener());
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_3.setBounds(247, 36, 62, 90);
		Player1.add(panel_3);
		panel_3.addMouseListener(new PopClickListener());
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_4.setBounds(319, 36, 62, 90);
		Player1.add(panel_4);
		panel_4.addMouseListener(new PopClickListener());
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_5.setBounds(391, 36, 62, 90);
		Player1.add(panel_5);
		panel_5.addMouseListener(new PopClickListener());
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_6.setBounds(464, 36, 62, 90);
		Player1.add(panel_6);
		panel_6.addMouseListener(new PopClickListener());
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_7.setBounds(537, 36, 62, 90);
		Player1.add(panel_7);
		panel_7.addMouseListener(new PopClickListener());
		
		JPanel Player2 = new JPanel();
		Player2.setBounds(148, 0, 822, 148);
		getContentPane().add(Player2);
		Player2.setLayout(null);
		Player2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Player 2"));
		Player2.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_8.setBounds(84, 32, 62, 90);
		Player2.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_9.setBounds(167, 32, 62, 90);
		Player2.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_10.setBounds(251, 32, 62, 90);
		Player2.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_11.setBounds(337, 32, 62, 90);
		Player2.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_12.setBounds(424, 32, 62, 90);
		Player2.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_13.setBounds(508, 32, 62, 90);
		Player2.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_14.setBounds(593, 32, 62, 90);
		Player2.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_15.setBounds(682, 32, 62, 90);
		Player2.add(panel_15);
		
		JPanel Player3 = new JPanel();
		Player3.setBounds(968, 0, 148, 671);
		getContentPane().add(Player3);
		Player3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Player 3"));
		Player3.setLayout(null);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_16.setBounds(31, 27, 90, 62);
		Player3.add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_17.setBounds(31, 107, 90, 62);
		Player3.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_18.setBounds(31, 188, 90, 62);
		Player3.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_19.setBounds(31, 272, 90, 62);
		Player3.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_20.setBounds(31, 356, 90, 62);
		Player3.add(panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_21.setBounds(31, 598, 90, 62);
		Player3.add(panel_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_22.setBounds(31, 441, 90, 62);
		Player3.add(panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_23.setBounds(31, 522, 90, 62);
		Player3.add(panel_23);
		
		JPanel Player4 = new JPanel();
		Player4.setBounds(0, 0, 148, 671);
		getContentPane().add(Player4);
		Player4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Player 4"));
		Player4.setLayout(null);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_24.setBounds(30, 27, 90, 62);
		Player4.add(panel_24);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_25.setBounds(30, 107, 90, 62);
		Player4.add(panel_25);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_26.setBounds(30, 188, 90, 62);
		Player4.add(panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_27.setBounds(30, 272, 90, 62);
		Player4.add(panel_27);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_28.setBounds(30, 356, 90, 62);
		Player4.add(panel_28);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_29.setBounds(30, 598, 90, 62);
		Player4.add(panel_29);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_30.setBounds(30, 441, 90, 62);
		Player4.add(panel_30);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		panel_31.setBounds(30, 522, 90, 62);
		Player4.add(panel_31);
		
		JPanel Deck = new JPanel();
		Deck.setBounds(171, 261, 113, 148);
		getContentPane().add(Deck);
		Deck.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		
		JPanel Discard = new JPanel();
		Discard.setBounds(298, 261, 113, 148);
		getContentPane().add(Discard);
		Discard.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Discard"));
		
		JPanel Adv1 = new JPanel();
		Adv1.setBounds(429, 261, 113, 148);
		getContentPane().add(Adv1);
		Adv1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Treasure Island"));
		
		JPanel Adv2 = new JPanel();
		Adv2.setBounds(563, 261, 113, 148);
		getContentPane().add(Adv2);
		Adv2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Smuggler's Top"));
		
		JPanel Adv3 = new JPanel();
		Adv3.setBounds(696, 261, 113, 148);
		getContentPane().add(Adv3);
		Adv3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Caravan"));
		
		JPanel Adv4 = new JPanel();
		Adv4.setBounds(834, 261, 113, 148);
		getContentPane().add(Adv4);
		Adv4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Get Into Trouble"));
	}
}
