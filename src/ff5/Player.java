/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ff5;

import java.util.ArrayList;

/**
 *
 * @author marcus
 */
public class Player {
    
    protected int score;
    protected ArrayList<Card> onHand;
    protected String name;
    
    public Player(String name){
        
        this.name = name;
        onHand = new ArrayList();
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @return the onHand
     */
    public ArrayList<Card> getOnHand() {
        return onHand;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }
    
    public void drawCard(Card card){
        onHand.add(card);
    }
    
    public Card removeCard(int i){
        return onHand.remove(i);
    }
    
    public Card getCard(int i){
        return this.onHand.get(i);
    }
    
    public int getCardSize(){
        return this.onHand.size();
    }
    
}
