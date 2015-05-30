/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import ff5.Card;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author marcus
 */
public class DeckPanel extends JPanel{
    
    private ArrayList<Card> cards;
    private String filepath;
    private JLabel picLabel = new JLabel();
    
    public DeckPanel(){
        cards = new ArrayList();
    }
    
    public void setDeck(ArrayList<Card> cards){
        this.cards = cards;
    }
    
    /*To set image*/
    public void setImage(){
        
        if(this.cards.isEmpty()){
            filepath = "C:\\Users\\marcus\\Documents\\NetBeansProjects\\FF5\\src\\cards\\back.jpg";
        }
        else{
            filepath = cards.get(cards.size()- 1).getFile();
            System.out.println(filepath);
        }
        
        BufferedImage originalImage;
        try {
        		
        		originalImage = ImageIO.read(new File(filepath));
                Image scaledImage = originalImage.getScaledInstance(this.getWidth(),this.getHeight() - 5,Image.SCALE_SMOOTH);
                picLabel.setIcon(new ImageIcon(scaledImage));
                this.add(picLabel);
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
    }
    
}
