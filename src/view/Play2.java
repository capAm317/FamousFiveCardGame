package view;

import Controller.FController;
import ff5.Card;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JSplitPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JPanel;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import javax.swing.border.EtchedBorder;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Play2 extends JFrame implements Runnable{
    
    private FController control;
    private  ArrayList<CardPanel> p1;
    private PopUpMenu menu;
    private int startAgain = 0;
    private int startAgain2 = 0;
    private int lastTurn = 0;
    private int turn = 0;
    private int aiTurn = 0;
    private int playerTurn = 0;
    private int end = 0;
    private boolean refresh = false;
    private DeckPanel Adv1;
    private DeckPanel Adv2;
    private DeckPanel Adv3;
    private DeckPanel Adv4;
    private DeckPanel Discard;
    private JLabel Adv1Perc;
    private JLabel Adv2Perc;
    private JLabel Adv3Perc;
    private JLabel Adv4Perc;
    
    public Play2(FController control) {
        
        
        this.control = control;
        this.menu = new PopUpMenu();
        menu.setPlaylistener(new PlayListener());
        menu.setDiscardListener(new DiscardListener());
        //this.control.setPlayers(2);

        //setting up the frame
        setSize(923, 579);
        setVisible(true);
        setTitle("Five Famous Card Game");
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        p1 = new ArrayList();


        //Setting player1's frame
        JPanel Player1 = new JPanel();
        Player1.setBounds(0, 404, 660, 148);
        getContentPane().add(Player1);
        Player1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Player 1"));
        Player1.setLayout(null);

        CardPanel panel = new CardPanel(menu, 0);
        panel.setBounds(24, 31, 62, 90);
        Player1.add(panel);
        p1.add(panel);

        CardPanel panel_1 = new CardPanel(menu, 1);
        panel_1.setBounds(104, 30, 62, 90);
        Player1.add(panel_1);
        p1.add(panel_1);

        CardPanel panel_2 = new CardPanel(menu, 2);
        panel_2.setBounds(184, 30, 62, 90);
        Player1.add(panel_2);
        p1.add(panel_2);

        CardPanel panel_3 = new CardPanel(menu, 3);
        panel_3.setBounds(262, 30, 62, 90);
        Player1.add(panel_3);
        p1.add(panel_3);

        CardPanel panel_4 = new CardPanel(menu, 4);
        panel_4.setBounds(343, 30, 62, 90);
        Player1.add(panel_4);
        p1.add(panel_4);

        CardPanel panel_5 = new CardPanel(menu, 5);
        panel_5.setBounds(425, 30, 62, 90);
        Player1.add(panel_5);
        p1.add(panel_5);

        CardPanel panel_6 = new CardPanel(menu, 6);
        panel_6.setBounds(504, 31, 62, 90);
        Player1.add(panel_6);
        p1.add(panel_6);

        CardPanel panel_7 = new CardPanel(menu, 7);
        panel_7.setBounds(582, 30, 62, 90);
        Player1.add(panel_7);
        p1.add(panel_7);
        
        System.out.println(p1.size());
        
        //control.getPlayer1().drawCard(control.getTopOfDeck());
        
        setCardsInPanel();

        JPanel Player2 = new JPanel();
        Player2.setBounds(0, 0, 917, 148);
        getContentPane().add(Player2);
        Player2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Player 2"));
        Player2.setLayout(null);

        JPanel panel_8 = new JPanel();
        //panel_8.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
        panel_8.setBounds(60, 31, 62, 90);
        this.setBack(panel_8);
        Player2.add(panel_8);

        JPanel panel_9 = new JPanel();
        //panel_9.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
        panel_9.setBounds(166, 31, 62, 90);
        this.setBack(panel_9);
        Player2.add(panel_9);

        JPanel panel_10 = new JPanel();
        //panel_10.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
        panel_10.setBounds(267, 31, 62, 90);
        this.setBack(panel_10);
        Player2.add(panel_10);

        JPanel panel_11 = new JPanel();
        //panel_11.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
        panel_11.setBounds(374, 31, 62, 90);
        this.setBack(panel_11);
        Player2.add(panel_11);

        JPanel panel_12 = new JPanel();
        //panel_12.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
        panel_12.setBounds(483, 31, 62, 90);
        this.setBack(panel_12);
        Player2.add(panel_12);

        JPanel panel_13 = new JPanel();
        //panel_13.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
        panel_13.setBounds(590, 31, 62, 90);
        this.setBack(panel_13);
        Player2.add(panel_13);

        JPanel panel_14 = new JPanel();
        //panel_14.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
        panel_14.setBounds(692, 31, 62, 90);
        this.setBack(panel_14);
        Player2.add(panel_14);

        JPanel panel_15 = new JPanel();
        //panel_15.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
        panel_15.setBounds(793, 31, 62, 90);
        this.setBack(panel_15);
        Player2.add(panel_15);

        DeckPanel Deck = new DeckPanel();
        Deck.setBounds(20, 208, 113, 148);
        this.setBack(Deck);
        getContentPane().add(Deck);
        //Deck.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));

        Discard = new DeckPanel();
        Discard.setBounds(170, 208, 113, 148);
        //this.setBack(Discard);
        getContentPane().add(Discard);
        //Discard.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Discard"));

        Adv1 = new DeckPanel();
        Adv1.setBounds(323, 208, 113, 148);
        getContentPane().add(Adv1);
        //Adv1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Treasure Island"));

        Adv2 = new DeckPanel();
        Adv2.setBounds(474, 208, 113, 148);
        getContentPane().add(Adv2);
        //Adv2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Smuggler's Top"));

        Adv3 = new DeckPanel();
        Adv3.setBounds(621, 208, 113, 148);
        getContentPane().add(Adv3);
        //Adv3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Caravan"));

        Adv4 = new DeckPanel();
        Adv4.setBounds(769, 208, 113, 148);
        getContentPane().add(Adv4);
        
        JLabel lblDiscard = new JLabel("Discard");
        lblDiscard.setBounds(170, 183, 46, 14);
        getContentPane().add(lblDiscard);
        
        JLabel lblNewLabel = new JLabel("Five on a Treasure Island");
        lblNewLabel.setBounds(317, 367, 136, 14);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel(" Five Go to Smuggler's Top");
        lblNewLabel_1.setBounds(466, 183, 155, 14);
        getContentPane().add(lblNewLabel_1);
        
        JLabel lblDeck = new JLabel("Deck");
        lblDeck.setBounds(20, 183, 46, 14);
        getContentPane().add(lblDeck);
        
        JLabel lblNewLabel_2 = new JLabel("Five Get Into Trouble");
        lblNewLabel_2.setBounds(769, 183, 124, 14);
        getContentPane().add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel(" Five Go Off in a Caravan");
        lblNewLabel_3.setBounds(616, 367, 136, 14);
        getContentPane().add(lblNewLabel_3);
        
                //Statistics Frame
                JPanel Statistics = new JPanel();
                Statistics.setBounds(657, 404, 260, 148);
                getContentPane().add(Statistics);
                Statistics.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Statistics"));
                Statistics.setLayout(null);
                
                JLabel lblNewLabel_4 = new JLabel("Adventure 1...");
                lblNewLabel_4.setBounds(18, 33, 142, 14);
                Statistics.add(lblNewLabel_4);
                
                Adv1Perc = new JLabel("21%");
                Adv1Perc.setHorizontalAlignment(SwingConstants.TRAILING);
                Adv1Perc.setBounds(180, 33, 50, 14);
                Statistics.add(Adv1Perc);
                
                JLabel lblFiveGoTo = new JLabel("Adventure 2...");
                lblFiveGoTo.setBounds(18, 58, 142, 14);
                Statistics.add(lblFiveGoTo);
                
                Adv2Perc = new JLabel("21%");
                Adv2Perc.setHorizontalAlignment(SwingConstants.TRAILING);
                Adv2Perc.setBounds(180, 58, 50, 14);
                Statistics.add(Adv2Perc);
                
                JLabel lblFiveGoOff = new JLabel("Adventure 3...");
                lblFiveGoOff.setBounds(18, 83, 142, 14);
                Statistics.add(lblFiveGoOff);
                
                Adv3Perc = new JLabel("21%");
                Adv3Perc.setHorizontalAlignment(SwingConstants.TRAILING);
                Adv3Perc.setBounds(180, 83, 50, 14);
                Statistics.add(Adv3Perc);
                
                JLabel lblFiveGetInto = new JLabel("Adventure 4...");
                lblFiveGetInto.setBounds(18, 108, 142, 14);
                Statistics.add(lblFiveGetInto);
                
                Adv4Perc = new JLabel("21%");
                Adv4Perc.setHorizontalAlignment(SwingConstants.TRAILING);
                Adv4Perc.setBounds(180, 108, 50, 14);
                Statistics.add(Adv4Perc);
        //Adv4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY), "Get Into Trouble"));
        //this.run();
        this.setDeckPanels();
        this.setPercentages();
    }
    
    public void setPercentages(){
        Adv1Perc.setText(Float.toString(control.getAdventure1Prob()));
        Adv2Perc.setText(Float.toString(control.getAdventure2Prob()));
        //Adv3Perc.setText(Float.toString(control.getAdventure3Prob()));
        //Adv4Perc.setText(Float.toString(control.getAdventure4Prob()));
    }
    
    public void setTurn(){
        Random rand = new Random();
        playerTurn = rand.nextInt(2);
        if(playerTurn == 0){
            aiTurn = 1;
        }
        else if(playerTurn == 1){
            aiTurn = 0;
        }
        System.out.println("Player: " + playerTurn);
        System.out.println("AI: " + aiTurn);
        
    }
    
    public void setCardsInPanel(){
        ArrayList<Card> onhand = new ArrayList();
        onhand = control.getPlayer1().getOnHand();
        int i;
        for( i = 0; i < onhand.size(); i++){
            p1.get(i).setCard(onhand.get(i));
            p1.get(i).setImage(onhand.get(i).getFile());  //sets the file path to show the image
        }
        
        for(int j = i; j < 8; j++)
        {
        	p1.get(j).removeImage();
        }
    }
    
    public void setDeckPanels(){
        Adv1.setDeck(control.getAdventure1());
        Adv1.setImage();
        Adv2.setDeck(control.getAdventure1());
        Adv2.setImage();
        Adv3.setDeck(control.getAdventure1());
        Adv3.setImage();
        Adv4.setDeck(control.getAdventure1());
        Adv4.setImage();
        Discard.setDeck(control.getDiscard());
        Discard.setImage();
    }
    
    public void setBack(JPanel panel){
        BufferedImage originalImage;
        try {
                originalImage = ImageIO.read(new File("C:\\Users\\marcus\\Documents\\NetBeansProjects\\FF5\\src\\cards\\back.jpg"));
                Image scaledImage = originalImage.getScaledInstance(panel.getWidth() ,panel.getHeight() - 5,Image.SCALE_SMOOTH);
                JLabel picLabel = new JLabel(new ImageIcon(scaledImage));
                panel.add(picLabel);
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
    }

    @Override
    public void run() {

        do{
            
            if(turn == aiTurn){
                // FOR AI
                System.out.println("AI turn");
                
                lastTurn = aiTurn;
                turn = 2;
                
                if(startAgain2 == 0){
                    Object[] obj={"Deck","Discard"}; //Object[] options,
                    Object[] nums = {1, 2, 3};
                    int choice = JOptionPane.showOptionDialog(null, //Component parentComponent
                                       "Player 2: \tDraw From\nDeck or Discard?", //Object message,
                                       "Choose an option", //String title
                                       JOptionPane.YES_NO_OPTION, //int optionType
                                       JOptionPane.INFORMATION_MESSAGE,
                                       null, //Icon icon,
                                       obj,
                                       null);//Object initialValue 
                    //System.out.println(choice);
                    if(choice == 1){

                        if(control.getDiscardSize() != 0){
                            int num = JOptionPane.showOptionDialog(null, //Component parentComponent
                                       "Which number?", //Object message,
                                       "Choose an option", //String title
                                       JOptionPane.YES_NO_OPTION, //int optionType
                                       JOptionPane.INFORMATION_MESSAGE,
                                       null, //Icon icon,
                                       nums,
                                       null);

                            if(num == 0 && control.getDiscardSize() >= 1){
                                control.getPlayer2().drawCard(control.removeDiscard(control.getDiscardSize() - 1));
                                startAgain = 1;
                            }
                            else if(num == 1 && control.getDiscardSize() >= 2){
                                control.getPlayer2().drawCard(control.removeDiscard(control.getDiscardSize() - 2));
                                startAgain = 1;
                            }
                            else if(num == 2 && control.getDiscardSize() >= 3){
                                control.getPlayer2().drawCard(control.removeDiscard(control.getDiscardSize() - 3));
                                startAgain = 1;
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "No card available here");
                                startAgain = 0;
                            }


                        }
                        else{
                            startAgain = 0;
                        }
                    }
                    else if(choice == 0){
                        control.getPlayer2().drawCard(control.getTopOfDeck());
                        System.out.println(control.getPlayer2().getCardSize());
                        startAgain = 1;
                    }
                }
                    ArrayList<Card> list = control.getPlayer2().getOnHand();
                
                int b = control.getPlayer2().getCardSize();
                Object[] cards = list.toArray();
                
                int card = JOptionPane.showOptionDialog(null, //Component parentComponent
                        "Player 2: Choose a card", //Object message,
                        "Choose an option", //String title
                        JOptionPane.YES_NO_OPTION, //int optionType
                        JOptionPane.INFORMATION_MESSAGE,
                        null, //Icon icon,
                        cards,
                        null);
                
                Object[] cho = {"Play", "Discard"};
                int pick = JOptionPane.showOptionDialog(null, //Component parentComponent
                        "Player 2: Play or Discard?", //Object message,
                        "Choose an option", //String title
                        JOptionPane.YES_NO_OPTION, //int optionType
                        JOptionPane.INFORMATION_MESSAGE,
                        null, //Icon icon,
                        cho,
                        null);
                  
                
                if(pick == 0)
                {
                	System.out.println("Play" + card);
                     Card cr = control.getPlayer2().getCard(card);
                     
                     switch (cr.getType()) {
                         case "Adventure1":
                             if(control.getAdventure1Top() == null && cr.getNumber() > 1){
                                 JOptionPane.showMessageDialog(null, "Must Place Adventure Card No. 1");
                             }
                             else if(control.getAdventure1Top() == null && cr.getNumber() == 1){
                                 control.addToAdventure1(control.getPlayer2().removeCard(card));
                                 System.out.println("Added Adventure 1");
                                 Adv1.setDeck(control.getAdventure1());
                                 Adv1.setImage();
                                 setCardsInPanel();
                                 revalidate();
                                 repaint();
                                 lastTurn = aiTurn;
                                 turn = 2;
                             }
                             else if(control.getAdventure1Top().getType().equals("General DangerCard")){
                                 JOptionPane.showMessageDialog(null, "There is a General Danger Card");
                             }
                             else if(control.getAdventure1Top().getType().equals("DangerCard")){
                                 JOptionPane.showMessageDialog(null, "There is a Danger Card");
                             }
                             else if(control.getAdventure1Top().getNumber() != cr.getNumber() - 1){
                                 int r = control.getAdventure2Top().getNumber() + 1;
                                 JOptionPane.showMessageDialog(null, "Must put Card No: " + r );
                             }
                             else {
                                     
                                 control.addToAdventure1(control.getPlayer2().removeCard(card));
                                 System.out.println("Added Adventure 1 (2nd)");
                                 Adv1.setDeck(control.getAdventure1());
                                 Adv1.setImage();
                                 setCardsInPanel();
                                 revalidate();
                                 repaint();
                                 lastTurn = aiTurn;
                                 turn = 2;
                             }
                             
                             break;
                         case "Adventure2":
                             if(control.getAdventure2Top() == null && cr.getNumber() > 1){
                                 JOptionPane.showMessageDialog(null, "Must Place Adventure Card No. 1");
                             }
                             else if(control.getAdventure2Top() == null && cr.getNumber() == 1){
                                 control.addToAdventure2(control.getPlayer2().removeCard(card));
                                 System.out.println("Added Adventure 2");
                                 Adv2.setDeck(control.getAdventure2());
                                 Adv2.setImage();
                                 setCardsInPanel();
                                 revalidate();
                                 repaint();
                                 lastTurn = aiTurn;
                                 turn = 2;
                             }
                             else if(control.getAdventure2Top().getType().equals("General DangerCard")){
                                 JOptionPane.showMessageDialog(null, "There is a General Danger Card");
                             }
                             else if(control.getAdventure2Top().getType().equals("DangerCard")){
                                 JOptionPane.showMessageDialog(null, "There is a Danger Card");
                             }
                             else if(control.getAdventure2Top().getNumber() != cr.getNumber() - 1){
                                 int r = control.getAdventure2Top().getNumber() + 1;
                                 JOptionPane.showMessageDialog(null, "Must put Card No: " + r );
                             }
                             else{
                                     
                                 control.addToAdventure2(control.getPlayer2().removeCard(card));
                                 System.out.println("Added Adventure 2 (2nd)");
                                 Adv2.setDeck(control.getAdventure2());
                                 Adv2.setImage();
                                 setCardsInPanel();
                                 revalidate();
                                 repaint();
                                 lastTurn = aiTurn;
                                 turn = 2;
                             }
                             
                             break;
                         case "Adventure3":
                             if(control.getAdventure3Top() == null && cr.getNumber() > 1){
                                 JOptionPane.showMessageDialog(null, "Must Place Adventure Card No. 1");
                             }
                             else if(control.getAdventure3Top() == null && cr.getNumber() == 1){
                                 control.addToAdventure3(control.getPlayer2().removeCard(card));
                                 System.out.println("Added Adventure 3");
                                 Adv3.setDeck(control.getAdventure3());
                                 Adv3.setImage();
                                 setCardsInPanel();
                                 revalidate();
                                 repaint();
                                 lastTurn = aiTurn;
                                 turn = 2;
                             }
                             else if(control.getAdventure3Top().getType().equals("General DangerCard")){
                                 JOptionPane.showMessageDialog(null, "There is a General Danger Card");
                             }
                             else if(control.getAdventure3Top().getType().equals("DangerCard")){
                                 JOptionPane.showMessageDialog(null, "There is a Danger Card");
                             }
                             else if(control.getAdventure3Top().getNumber() != cr.getNumber() - 1){
                                 int r = control.getAdventure3Top().getNumber() + 1;
                                 JOptionPane.showMessageDialog(null, "Must put Card No: " + r );
                             }
                             else {
                                     
                                 control.addToAdventure3(control.getPlayer2().removeCard(card));
                                 System.out.println("Added Adventure 3 (2nd)");
                                 Adv3.setDeck(control.getAdventure3());
                                 Adv3.setImage();
                                 setCardsInPanel();
                                 revalidate();
                                 repaint();
                                 lastTurn = aiTurn;
                                 turn = 2;
                             }
                             
                             break;
                         case "Adventure4":
                             if(control.getAdventure4Top() == null && cr.getNumber() > 1){
                                 JOptionPane.showMessageDialog(null, "Must Place Adventure Card No. 1");
                             }
                             else if(control.getAdventure4Top() == null && cr.getNumber() == 1){
                                 control.addToAdventure4(control.getPlayer2().removeCard(card));
                                 System.out.println("Added Adventure 4");
                                 Adv4.setDeck(control.getAdventure4());
                                 Adv4.setImage();
                                 setCardsInPanel();
                                 revalidate();
                                 repaint();
                                 lastTurn = aiTurn;
                                 turn = 2;
                             }
                             else if(control.getAdventure4Top().getType().equals("General DangerCard")){
                                 JOptionPane.showMessageDialog(null, "There is a General Danger Card");
                             }
                             else if(control.getAdventure4Top().getType().equals("DangerCard")){
                                 JOptionPane.showMessageDialog(null, "There is a Danger Card");
                             }
                             else if(control.getAdventure4Top().getNumber() != cr.getNumber() - 1){
                                 int r = control.getAdventure4Top().getNumber() + 1;
                                 JOptionPane.showMessageDialog(null, "Must put Card No: " + r );
                             }
                             else {
                                     
                                 control.addToAdventure4(control.getPlayer2().removeCard(card));
                                 System.out.println("Added Adventure 4 (2nd)");
                                 Adv4.setDeck(control.getAdventure4());
                                 Adv4.setImage();
                                 setCardsInPanel();
                                 revalidate();
                                 repaint();
                                 lastTurn = aiTurn;
                                 turn = 2;
                             }
                             
                             
                             break;
                             
                         case "DangerCard":
                             if(cr.getNumber() == 1){
                                 control.addToAdventure1(control.getPlayer2().removeCard(card));
                                 System.out.println("Added Adventure 4 (2nd)");
                                 Adv1.setDeck(control.getAdventure1());
                                 Adv1.setImage();
                             }
                             else if(cr.getNumber() == 2){
                                 control.addToAdventure2(control.getPlayer2().removeCard(card));
                                 System.out.println("Added Adventure 2 (2nd)");
                                 Adv2.setDeck(control.getAdventure2());
                                 Adv2.setImage();
                             }
                             else if(cr.getNumber() == 3){
                                 control.addToAdventure3(control.getPlayer2().removeCard(card));
                                 System.out.println("Added Adventure 3 (2nd)");
                                 Adv3.setDeck(control.getAdventure3());
                                 Adv3.setImage();
                             }
                             else if(cr.getNumber() == 4){
                                 control.addToAdventure4(control.getPlayer2().removeCard(card));
                                 System.out.println("Added Adventure 4 (2nd)");
                                 Adv4.setDeck(control.getAdventure4());
                                 Adv4.setImage();
                             }
                             
                             setCardsInPanel();
                             revalidate();
                             repaint();
                             lastTurn = aiTurn;
                             turn = 2;
                             
                             break;
                         case "General DangerCard": 
                             Object[] nums = {1, 2, 3, 4};
                    int choice = -1;
                    do{
                    choice = JOptionPane.showOptionDialog(null, //Component parentComponent
                                   "\tWhich Adventure?", //Object message,
                                   "Choose an option", //String title
                                   JOptionPane.YES_NO_OPTION, //int optionType
                                   JOptionPane.INFORMATION_MESSAGE,
                                   null, //Icon icon,
                                   nums,
                                   null);
                    }while(choice == -1);
                    
                    if(choice == 0){
                        
                        if(!control.getAdventure1Top().getType().equals("DangerCard")&& !control.getAdventure1Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure1(control.getPlayer2().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 1 (2nd)");
                            Adv1.setDeck(control.getAdventure1());
                            Adv1.setImage();
                        }
                        
                    }
                    else if(choice == 1){
                        if(!control.getAdventure2Top().getType().equals("Adventure1")&& !control.getAdventure2Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure2(control.getPlayer2().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 2 (2nd)");
                            Adv2.setDeck(control.getAdventure2());
                            Adv2.setImage();
                        }
                    }
                    else if(choice == 2){
                        if(!control.getAdventure3Top().getType().equals("DangerCard")&& !control.getAdventure3Top().getType().equals("General DangerCard")){
                        
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure3(control.getPlayer2().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 4 (2nd)");
                            Adv3.setDeck(control.getAdventure3());
                            Adv3.setImage();
                        }
                    }
                    else if(choice == 3){
                        if(!control.getAdventure4Top().getType().equals("DangerCard")&& !control.getAdventure4Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure4(control.getPlayer2().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 4 (2nd)");
                            Adv4.setDeck(control.getAdventure4());
                            Adv4.setImage();
                        }
                    }
                    
                    
                    break;
                case "AllSafe":
                    Object[] nums1 = {1, 2, 3, 4};
                    int choice2 = -1;
                    do{
                        choice2 = JOptionPane.showOptionDialog(null, //Component parentComponent
                                   "\tWhich Adventure", //Object message,
                                   "Choose an option", //String title
                                   JOptionPane.YES_NO_OPTION, //int optionType
                                   JOptionPane.INFORMATION_MESSAGE,
                                   null, //Icon icon,
                                   nums1,
                                   null);
                    }while(choice2 == -1);
                    
                    if(choice2 == 0){
                        
                        if(control.getAdventure1Top().getType().equals("DangerCard")|| control.getAdventure1Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure1(control.getPlayer2().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 1 (2nd)");
                            Adv1.setDeck(control.getAdventure1());
                            Adv1.setImage();
                        }
                        
                    }
                    else if(choice2 == 1){
                        if(control.getAdventure2Top().getType().equals("DangerCard")|| control.getAdventure2Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure2(control.getPlayer2().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 2 (2nd)");
                            Adv2.setDeck(control.getAdventure2());
                            Adv2.setImage();
                        }
                    }
                    else if(choice2 == 2){
                        if(control.getAdventure3Top().getType().equals("DangerCard")|| control.getAdventure3Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure3(control.getPlayer2().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 3 (2nd)");
                            Adv3.setDeck(control.getAdventure3());
                            Adv3.setImage();
                        }
                    }
                    else if(choice2 == 3){
                        if(control.getAdventure4Top().getType().equals("DangerCard")|| control.getAdventure4Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure4(control.getPlayer2().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 4 (2nd)");
                            Adv4.setDeck(control.getAdventure4());
                            Adv4.setImage();
                        }
                    }
                    
                    break;
          
                     }
         
                }
                else
                {
                    System.out.println("Discard" + card);
                    Card cr = control.getPlayer2().removeCard(card);
                    control.addToDiscard(cr);
                    Discard.setDeck(control.getDiscard());
                    Discard.setImage();
                    setCardsInPanel();
                    revalidate();
                    repaint();
                    lastTurn = aiTurn;
                    turn = 2;
                }
                this.setCardsInPanel();
                this.revalidate();
                this.repaint();
                
                
            }
            else if(startAgain == 0 && turn == playerTurn){
                Object[] obj={"Deck","Discard"}; //Object[] options,
                Object[] nums = {1, 2, 3};
                int choice = JOptionPane.showOptionDialog(null, //Component parentComponent
                                   "\tDraw From\nDeck or Discard?", //Object message,
                                   "Choose an option", //String title
                                   JOptionPane.YES_NO_OPTION, //int optionType
                                   JOptionPane.INFORMATION_MESSAGE,
                                   null, //Icon icon,
                                   obj,
                                   null);//Object initialValue 
                //System.out.println(choice);
                if(choice == 1){
                    
                    if(control.getDiscardSize() != 0){
                        int num = JOptionPane.showOptionDialog(null, //Component parentComponent
                                   "Which number?", //Object message,
                                   "Choose an option", //String title
                                   JOptionPane.YES_NO_OPTION, //int optionType
                                   JOptionPane.INFORMATION_MESSAGE,
                                   null, //Icon icon,
                                   nums,
                                   null);
                        
                        if(num == 0 && control.getDiscardSize() >= 1){
                            control.getPlayer1().drawCard(control.removeDiscard(control.getDiscardSize() - 1));
                            startAgain = 1;
                        }
                        else if(num == 1 && control.getDiscardSize() >= 2){
                            control.getPlayer1().drawCard(control.removeDiscard(control.getDiscardSize() - 2));
                            startAgain = 1;
                        }
                        else if(num == 2 && control.getDiscardSize() >= 3){
                            control.getPlayer1().drawCard(control.removeDiscard(control.getDiscardSize() - 3));
                            startAgain = 1;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "No card available here");
                            startAgain = 0;
                        }
                        
                        
                    }
                    else{
                        startAgain = 0;
                    }
                }
                else if(choice == 0){
                    control.getPlayer1().drawCard(control.getTopOfDeck());
                    System.out.println(control.getPlayer1().getCardSize());
                    startAgain = 1;
                }
                
                this.setCardsInPanel();
                this.revalidate();
                this.repaint();
                
                
            }
            
            
            else if(turn == 2){
                // FOR CHECKING
                System.out.println("CHECK MUNA HA");
                
                if(control.getDeckSize() == 0){
                    if(control.getDiscardSize() != 0){
                        control.transferDiscardToDeck();
                    }
                    else{
                        startAgain = -1;
                    }
                }
                
                if(control.getAdventure1Top() != null && control.getAdventure1Top().getNumber() == 8){
                    end = 1;
                    if(lastTurn == playerTurn){
                        JOptionPane.showMessageDialog(null , control.getPlayer1().getName() + " Wins");
                        
                    }
                    else if(lastTurn == aiTurn){
                        JOptionPane.showMessageDialog(null , control.getPlayer2().getName() + " Wins");
                    }
                }
                if(control.getAdventure2Top() != null && control.getAdventure2Top().getNumber() == 8){
                    end = 1;
                    if(lastTurn == playerTurn){
                        JOptionPane.showMessageDialog(null , control.getPlayer1().getName() + " Wins");
                        
                    }
                    else if(lastTurn == aiTurn){
                        JOptionPane.showMessageDialog(null , control.getPlayer2().getName() + " Wins");
                    }
                }
                if(control.getAdventure3Top() != null && control.getAdventure3Top().getNumber() == 8){
                    end = 1;
                    if(lastTurn == playerTurn){
                        JOptionPane.showMessageDialog(null , control.getPlayer1().getName() + " Wins");
                        
                    }
                    else if(lastTurn == aiTurn){
                        JOptionPane.showMessageDialog(null , control.getPlayer2().getName() + " Wins");
                    }
                }
                if(control.getAdventure4Top() != null && control.getAdventure4Top().getNumber() == 8){
                    end = 1;
                    if(lastTurn == playerTurn){
                        JOptionPane.showMessageDialog(null , control.getPlayer1().getName() + " Wins");
                        
                    }
                    else if(lastTurn == aiTurn){
                        JOptionPane.showMessageDialog(null , control.getPlayer2().getName() + " Wins");
                    }
                }
                
                if(lastTurn == playerTurn){
                    
                    turn = aiTurn;
                }
                else if(lastTurn == aiTurn){
                    startAgain = 0;
                    turn = playerTurn;
                }
                
                setPercentages();
                repaint();
                revalidate();
            }
            
        }while(end != 1);
    }

    class PlayListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            System.out.println("Play" + menu.getIndex());
            Card cr = control.getPlayer1().getCard(menu.getIndex());
            
            switch (cr.getType()) {
                case "Adventure1":
                    if(control.getAdventure1Top() == null && cr.getNumber() > 1){
                        JOptionPane.showMessageDialog(null, "Must Place Adventure Card No. 1");
                    }
                    else if(control.getAdventure1Top() == null && cr.getNumber() == 1){
                        control.addToAdventure1(control.getPlayer1().removeCard(menu.getIndex()));
                        System.out.println("Added Adventure 1");
                        Adv1.setDeck(control.getAdventure1());
                        Adv1.setImage();
                        setCardsInPanel();
                        revalidate();
                        repaint();
                        lastTurn = playerTurn;
                        turn = 2;
                    }
                    else if(control.getAdventure1Top().getType().equals("General DangerCard")){
                        JOptionPane.showMessageDialog(null, "There is a General Danger Card");
                    }
                    else if(control.getAdventure1Top().getType().equals("DangerCard")){
                        JOptionPane.showMessageDialog(null, "There is a Danger Card");
                    }
                    else if(control.getAdventure1Top().getNumber() != cr.getNumber() - 1){
                        int r = control.getAdventure2Top().getNumber() + 1;
                        JOptionPane.showMessageDialog(null, "Must put Card No: " + r );
                    }
                    else {
                            
                        control.addToAdventure1(control.getPlayer1().removeCard(menu.getIndex()));
                        System.out.println("Added Adventure 1 (2nd)");
                        Adv1.setDeck(control.getAdventure1());
                        Adv1.setImage();
                        setCardsInPanel();
                        revalidate();
                        repaint();
                        lastTurn = playerTurn;
                        turn = 2;
                    }
                    
                    break;
                case "Adventure2":
                    if(control.getAdventure2Top() == null && cr.getNumber() > 1){
                        JOptionPane.showMessageDialog(null, "Must Place Adventure Card No. 1");
                    }
                    else if(control.getAdventure2Top() == null && cr.getNumber() == 1){
                        control.addToAdventure2(control.getPlayer1().removeCard(menu.getIndex()));
                        System.out.println("Added Adventure 2");
                        Adv2.setDeck(control.getAdventure2());
                        Adv2.setImage();
                        setCardsInPanel();
                        revalidate();
                        repaint();
                        lastTurn = playerTurn;
                        turn = 2;
                    }
                    else if(control.getAdventure2Top().getType().equals("General DangerCard")){
                        JOptionPane.showMessageDialog(null, "There is a General Danger Card");
                    }
                    else if(control.getAdventure2Top().getType().equals("DangerCard")){
                        JOptionPane.showMessageDialog(null, "There is a Danger Card");
                    }
                    else if(control.getAdventure2Top().getNumber() != cr.getNumber() - 1){
                        int r = control.getAdventure2Top().getNumber() + 1;
                        JOptionPane.showMessageDialog(null, "Must put Card No: " + r );
                    }
                    else{
                            
                        control.addToAdventure2(control.getPlayer1().removeCard(menu.getIndex()));
                        System.out.println("Added Adventure 2 (2nd)");
                        Adv2.setDeck(control.getAdventure2());
                        Adv2.setImage();
                        setCardsInPanel();
                        revalidate();
                        repaint();
                        lastTurn = playerTurn;
                        turn = 2;
                    }
                    
                    break;
                case "Adventure3":
                    if(control.getAdventure3Top() == null && cr.getNumber() > 1){
                        JOptionPane.showMessageDialog(null, "Must Place Adventure Card No. 1");
                    }
                    else if(control.getAdventure3Top() == null && cr.getNumber() == 1){
                        control.addToAdventure3(control.getPlayer1().removeCard(menu.getIndex()));
                        System.out.println("Added Adventure 3");
                        Adv3.setDeck(control.getAdventure3());
                        Adv3.setImage();
                        setCardsInPanel();
                        revalidate();
                        repaint();
                        lastTurn = playerTurn;
                        turn = 2;
                    }
                    else if(control.getAdventure3Top().getType().equals("General DangerCard")){
                        JOptionPane.showMessageDialog(null, "There is a General Danger Card");
                    }
                    else if(control.getAdventure3Top().getType().equals("DangerCard")){
                        JOptionPane.showMessageDialog(null, "There is a Danger Card");
                    }
                    else if(control.getAdventure3Top().getNumber() != cr.getNumber() - 1){
                        int r = control.getAdventure3Top().getNumber() + 1;
                        JOptionPane.showMessageDialog(null, "Must put Card No: " + r );
                    }
                    else {
                            
                        control.addToAdventure3(control.getPlayer1().removeCard(menu.getIndex()));
                        System.out.println("Added Adventure 3 (2nd)");
                        Adv3.setDeck(control.getAdventure3());
                        Adv3.setImage();
                        setCardsInPanel();
                        revalidate();
                        repaint();
                        lastTurn = playerTurn;
                        turn = 2;
                    }
                    
                    break;
                case "Adventure4":
                    if(control.getAdventure4Top() == null && cr.getNumber() > 1){
                        JOptionPane.showMessageDialog(null, "Must Place Adventure Card No. 1");
                    }
                    else if(control.getAdventure4Top() == null && cr.getNumber() == 1){
                        control.addToAdventure4(control.getPlayer1().removeCard(menu.getIndex()));
                        System.out.println("Added Adventure 4");
                        Adv4.setDeck(control.getAdventure4());
                        Adv4.setImage();
                        setCardsInPanel();
                        revalidate();
                        repaint();
                        lastTurn = playerTurn;
                        turn = 2;
                    }
                    else if(control.getAdventure4Top().getType().equals("General DangerCard")){
                        JOptionPane.showMessageDialog(null, "There is a General Danger Card");
                    }
                    else if(control.getAdventure4Top().getType().equals("DangerCard")){
                        JOptionPane.showMessageDialog(null, "There is a Danger Card");
                    }
                    else if(control.getAdventure4Top().getNumber() != cr.getNumber() - 1){
                        int r = control.getAdventure4Top().getNumber() + 1;
                        JOptionPane.showMessageDialog(null, "Must put Card No: " + r );
                    }
                    else {
                            
                        control.addToAdventure4(control.getPlayer1().removeCard(menu.getIndex()));
                        System.out.println("Added Adventure 4 (2nd)");
                        Adv4.setDeck(control.getAdventure4());
                        Adv4.setImage();
                        setCardsInPanel();
                        revalidate();
                        repaint();
                        lastTurn = playerTurn;
                        turn = 2;
                    }
                    
                    
                    break;
                    
                case "DangerCard":
                    if(cr.getNumber() == 1){
                        control.addToAdventure1(control.getPlayer1().removeCard(menu.getIndex()));
                        System.out.println("Added Adventure 4 (2nd)");
                        Adv1.setDeck(control.getAdventure1());
                        Adv1.setImage();
                    }
                    else if(cr.getNumber() == 2){
                        control.addToAdventure2(control.getPlayer1().removeCard(menu.getIndex()));
                        System.out.println("Added Adventure 2 (2nd)");
                        Adv2.setDeck(control.getAdventure2());
                        Adv2.setImage();
                    }
                    else if(cr.getNumber() == 3){
                        control.addToAdventure3(control.getPlayer1().removeCard(menu.getIndex()));
                        System.out.println("Added Adventure 3 (2nd)");
                        Adv3.setDeck(control.getAdventure3());
                        Adv3.setImage();
                    }
                    else if(cr.getNumber() == 4){
                        control.addToAdventure4(control.getPlayer1().removeCard(menu.getIndex()));
                        System.out.println("Added Adventure 4 (2nd)");
                        Adv4.setDeck(control.getAdventure4());
                        Adv4.setImage();
                    }
                    
                    setCardsInPanel();
                    revalidate();
                    repaint();
                    lastTurn = playerTurn;
                    turn = 2;
                    
                    break;
                case "General DangerCard":
                    
                    Object[] nums = {1, 2, 3, 4};
                    int choice = -1;
                    do{
                    choice = JOptionPane.showOptionDialog(null, //Component parentComponent
                                   "\tWhich Adventure?", //Object message,
                                   "Choose an option", //String title
                                   JOptionPane.YES_NO_OPTION, //int optionType
                                   JOptionPane.INFORMATION_MESSAGE,
                                   null, //Icon icon,
                                   nums,
                                   null);
                    }while(choice == -1);
                    
                    if(choice == 0){
                        
                        if(!control.getAdventure1Top().getType().equals("DangerCard")&& !control.getAdventure1Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure1(control.getPlayer1().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 1 (2nd)");
                            Adv1.setDeck(control.getAdventure1());
                            Adv1.setImage();
                        }
                        
                    }
                    else if(choice == 1){
                        if(!control.getAdventure2Top().getType().equals("Adventure1")&& !control.getAdventure2Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure2(control.getPlayer1().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 2 (2nd)");
                            Adv2.setDeck(control.getAdventure2());
                            Adv2.setImage();
                        }
                    }
                    else if(choice == 2){
                        if(!control.getAdventure3Top().getType().equals("DangerCard")&& !control.getAdventure3Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure3(control.getPlayer1().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 4 (2nd)");
                            Adv3.setDeck(control.getAdventure3());
                            Adv3.setImage();
                        }
                    }
                    else if(choice == 3){
                        if(!control.getAdventure4Top().getType().equals("DangerCard")&& !control.getAdventure4Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure4(control.getPlayer1().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 4 (2nd)");
                            Adv4.setDeck(control.getAdventure4());
                            Adv4.setImage();
                        }
                    }
                    
                    
                    break;
                case "AllSafe":
                    Object[] nums1 = {1, 2, 3, 4};
                    int choice2 = -1;
                    do{
                        choice2 = JOptionPane.showOptionDialog(null, //Component parentComponent
                                   "\tWhich Adventure", //Object message,
                                   "Choose an option", //String title
                                   JOptionPane.YES_NO_OPTION, //int optionType
                                   JOptionPane.INFORMATION_MESSAGE,
                                   null, //Icon icon,
                                   nums1,
                                   null);
                    }while(choice2 == -1);
                    
                    if(choice2 == 0){
                        
                        if(control.getAdventure1Top().getType().equals("DangerCard")|| control.getAdventure1Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure1(control.getPlayer1().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 1 (2nd)");
                            Adv1.setDeck(control.getAdventure1());
                            Adv1.setImage();
                        }
                        
                    }
                    else if(choice2 == 1){
                        if(control.getAdventure2Top().getType().equals("DangerCard")|| control.getAdventure2Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure2(control.getPlayer1().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 2 (2nd)");
                            Adv2.setDeck(control.getAdventure2());
                            Adv2.setImage();
                        }
                    }
                    else if(choice2 == 2){
                        if(control.getAdventure3Top().getType().equals("DangerCard")|| control.getAdventure3Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure3(control.getPlayer1().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 3 (2nd)");
                            Adv3.setDeck(control.getAdventure3());
                            Adv3.setImage();
                        }
                    }
                    else if(choice2 == 3){
                        if(control.getAdventure4Top().getType().equals("DangerCard")|| control.getAdventure4Top().getType().equals("General DangerCard")){
                            JOptionPane.showMessageDialog(null, "There is no Danger Card on Top");
                        }
                        else{
                            control.addToAdventure4(control.getPlayer1().removeCard(menu.getIndex()));
                            System.out.println("Added Adventure 4 (2nd)");
                            Adv4.setDeck(control.getAdventure4());
                            Adv4.setImage();
                        }
                    }
                    
                    break;
                
                    
                        
            }
            
            
            
        }

    }

    class DiscardListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Discard" + menu.getIndex());
            Card cr = control.getPlayer1().removeCard(menu.getIndex());
            control.addToDiscard(cr);
            Discard.setDeck(control.getDiscard());
            Discard.setImage();
            setCardsInPanel();
            revalidate();
            repaint();
            lastTurn = playerTurn;
            turn = 2;
        }
    
    }
}



