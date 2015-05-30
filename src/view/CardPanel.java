/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import ff5.Card;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author marcus
 */
public class CardPanel extends JPanel{
    
    private Card card = null;
    private PopClickListener listener = new PopClickListener();
    private PopUpMenu menu;
    private int index;
    private JLabel picLabel = new JLabel();
    
    public CardPanel(PopUpMenu menu, int index){
        this.menu = menu;
        this.index = index;
        //this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
	this.addMouseListener(listener);
        this.listener.setMenu(menu);
    }

    /**
     * @return the card
     */
    public Card getCard() {
        return card;
    }

    /**
     * @param card the card to set
     */
    public void setCard(Card card) {
        this.listener.setVal(card.getNumber(), card.getType(), index);
        this.card = card;
    }
    
	
    /*To set image*/
    public void setImage(String file)
	{
		BufferedImage originalImage;
		try {
			originalImage = ImageIO.read(new File(file));
			Image scaledImage = originalImage.getScaledInstance(this.getWidth(),this.getHeight() - 5,Image.SCALE_SMOOTH);
			picLabel.setIcon(new ImageIcon(scaledImage));
			this.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    public void removeImage()
    {
    	picLabel.setIcon(null);
    	card = null;
        this.listener.removeVal();
    }
}


class PopClickListener extends MouseAdapter{
    
    private int val = 0;
    private String cardType;
    private int id;
    private PopUpMenu menu;
    
    public PopClickListener(){
        this.id = -1;
    }
    
    public PopClickListener(int id){
        this.id = id;
    }

    public void mousePressed(MouseEvent e){
    }

    public void mouseReleased(MouseEvent e){
        if (e.isPopupTrigger())
            doPop(e);
    }
    
    public void setMenu(PopUpMenu menu){
        this.menu = menu;
    }

    private void doPop(MouseEvent e){
        menu.setIndex(val);
        menu.show(e.getComponent(), e.getX(), e.getY());
        System.out.println(e.getButton() + " " + e.getID() + " " + id + " " + cardType);
    }
    
    public void setVal(int i, String cr, int index){
        this.val = index;
        this.id = i;
        this.cardType = cr;
    }
    
    public void removeVal()
    {
    	id = -1;
    	cardType = null;
    } 
}
