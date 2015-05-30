/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author marcus
 */
class PopUpMenu extends JPopupMenu {
    JMenuItem anItem;
    JMenuItem anItem2;
    private int index;
    
    public PopUpMenu(){
        anItem = new JMenuItem("Play");
        //anItem.addActionListener();
        add(anItem);
        
        anItem2 = new JMenuItem("Discard");
        //anItem.addActionListener();
        add(anItem2);
    }
    
    public void setIndex(int dex){
        index = dex;
    }
    
    public int getIndex(){
        return index;
    }
        
    public void setPlaylistener(ActionListener e){
        anItem.addActionListener(e);
    }
    
    public void setDiscardListener(ActionListener e){
        anItem2.addActionListener(e);
    }
}