/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ff5.Card;
import ff5.Player;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author marcus
 */
public class FController {
    
        private ArrayList<Card> deck = new ArrayList();
        private ArrayList<Card> discard = new ArrayList();
        private ArrayList<String> types = new ArrayList();
        private ArrayList<Player> players = new ArrayList();
        private ArrayList<Card> happycards = new ArrayList();
        private ArrayList<Card> adventure1 = new ArrayList();;
        private ArrayList<Card> adventure2 = new ArrayList();;
        private ArrayList<Card> adventure3 = new ArrayList();;
        private ArrayList<Card> adventure4 = new ArrayList();;
        
        int starter;
        boolean end = false;
        boolean start = true;
        String filepath = "C:\\Users\\marcus\\Documents\\NetBeansProjects\\FF5\\src\\cards";
        
        public FController(){
            
            types.add("Adventure1");
            types.add("Adventure2");
            types.add("Adventure3");
            types.add("Adventure4");
            types.add("General DangerCard");
            types.add("DangerCard");
            types.add("AllSafe");

            Card card = new Card("Adventure1", 1, filepath + File.separator + "Y1.jpg");
            deck.add(card);
            card = new Card("Adventure1", 2, filepath + File.separator + "Y2.jpg");
            deck.add(card);
            card = new Card("Adventure1", 3, filepath + File.separator + "Y3.jpg");
            deck.add(card);
            card = new Card("Adventure1", 4, filepath + File.separator + "Y4.jpg");
            deck.add(card);
            card = new Card("Adventure1", 5, filepath + File.separator + "Y5.jpg");
            deck.add(card);
            card = new Card("Adventure1", 6, filepath + File.separator + "Y6.jpg");
            deck.add(card);
            card = new Card("Adventure1", 7, filepath + File.separator + "Y7.jpg");
            deck.add(card);
            card = new Card("Adventure1", 8, filepath + File.separator + "Y8.jpg");
            deck.add(card);
            Card dc = new Card("DangerCard", 1, filepath + File.separator + "YD.jpg");
            deck.add(dc);
            card = new Card("Adventure2", 1, filepath + File.separator + "B1.jpg");
            deck.add(card);
            card = new Card("Adventure2", 2, filepath + File.separator + "B2.jpg");
            deck.add(card);
            card = new Card("Adventure2", 3, filepath + File.separator + "B3.jpg");
            deck.add(card);
            card = new Card("Adventure2", 4, filepath + File.separator + "B4.jpg");
            deck.add(card);
            card = new Card("Adventure2", 5, filepath + File.separator + "B5.jpg");
            deck.add(card);
            card = new Card("Adventure2", 6, filepath + File.separator + "B6.jpg");
            deck.add(card);
            card = new Card("Adventure2", 7, filepath + File.separator + "B7.jpg");
            deck.add(card);
            card = new Card("Adventure2", 8, filepath + File.separator + "B8.jpg");
            deck.add(card);
            dc = new Card("DangerCard", 2, filepath + File.separator + "BD.jpg");
            deck.add(dc);
            /*card = new Card("Adventure3", 1, filepath + File.separator + "V1.jpg");
            deck.add(card);
            card = new Card("Adventure3", 2, filepath + File.separator + "V2.jpg");
            deck.add(card);
            card = new Card("Adventure3", 3, filepath + File.separator + "V3.jpg");
            deck.add(card);
            card = new Card("Adventure3", 4, filepath + File.separator + "V4.jpg");
            deck.add(card);
            card = new Card("Adventure3", 5, filepath + File.separator + "V5.jpg");
            deck.add(card);
            card = new Card("Adventure3", 6, filepath + File.separator + "V6.jpg");
            deck.add(card);
            card = new Card("Adventure3", 7, filepath + File.separator + "V7.jpg");
            deck.add(card);
            card = new Card("Adventure3", 8, filepath + File.separator + "V8.jpg");
            deck.add(card);
            dc = new Card("DangerCard", 3, filepath + File.separator + "VD.jpg");
            deck.add(dc);
            card = new Card("Adventure4", 1, filepath + File.separator + "P1.jpg");
            deck.add(card);
            card = new Card("Adventure4", 2, filepath + File.separator + "P2.jpg");
            deck.add(card);
            card = new Card("Adventure4", 3, filepath + File.separator + "P3.jpg");
            deck.add(card);
            card = new Card("Adventure4", 4, filepath + File.separator + "P4.jpg");
            deck.add(card);
            card = new Card("Adventure4", 5, filepath + File.separator + "P5.jpg");
            deck.add(card);
            card = new Card("Adventure4", 6, filepath + File.separator + "P6.jpg");
            deck.add(card);
            card = new Card("Adventure4", 7, filepath + File.separator + "P7.jpg");
            deck.add(card);
            card = new Card("Adventure4", 8, filepath + File.separator + "P8.jpg");
            deck.add(card);
            dc = new Card("DangerCard", 4, filepath + File.separator + "PD.jpg");
            deck.add(dc);*/

            for(int x = 0; x < 2; x++){
                Card generaldc = new Card(types.get(4), x+1, filepath + File.separator + "GD.jpg");
                deck.add(generaldc);
            }

            for(int y = 0; y < 4; y++){
                Card generaldc = new Card(types.get(6), y+1, filepath + File.separator + "AS.jpg");
                deck.add(generaldc);
            }

            for(int d = 0; d < deck.size(); d++){
                if(deck.get(d).getType().startsWith("Adventure")){
                    if(deck.get(d).getNumber() == 8)
                        happycards.add(deck.remove(d));
                }
            }

            shuffleDeck(happycards);
            shuffleDeck(happycards);
            shuffleDeck(happycards);
            shuffleDeck(happycards);
            
        }
        
    public void setPlayers(int noPlay){

        if(noPlay != 4){
            starter = 6;
        }
        else{
            starter = 5;
        }

        for(int j = 0; j < noPlay; j++){
            String playr = "Player";
            int dex = j + 1;
            playr += dex;
            players.add(new Player(playr));
        }

        for(Player pl: players){
            System.out.println(pl.getName());
        }

        for(int p = 0; p < players.size(); p++){
            players.get(p).drawCard(happycards.remove(0));
        }

        for(int x1 = 0; x1 < happycards.size(); x1++){
            deck.add(happycards.remove(x1));
        }

        shuffleDeck(deck);
        shuffleDeck(deck);
        shuffleDeck(deck);

        for(int x2 = 0; x2 < starter; x2++){
            for(int x3 = 0; x3 < players.size(); x3++){
                players.get(x3).drawCard(deck.remove(0));
            }
        }
    }

    public static void shuffleDeck(ArrayList<Card> a) {
        int n = a.size();
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
          int change = i + random.nextInt(n - i);
          swap(a, i, change);
        }
    }

    private static void swap(ArrayList<Card> a, int i, int change) {
        Card helper = a.get(i);
        a.set(i, a.get(change));
        a.set(change, helper);
    }

    public Card getTopOfDeck(){
        return deck.remove(deck.size() - 1);
    }

    public Player getPlayer1(){
        return players.get(0);
    }

    public Player getPlayer2(){
        return players.get(1);
    }
        
    public boolean addToAdventure1(Card playCard){
        return adventure1.add(playCard);
    }
    
    public Card getAdventure1Top(){
        if(!adventure1.isEmpty())
            return adventure1.get(adventure1.size() - 1);
        return null;
    }
    
    public boolean addToAdventure2(Card playCard){
        return adventure2.add(playCard);
    }
    
    public Card getAdventure2Top(){
        if(!adventure2.isEmpty())
            return adventure2.get(adventure2.size() - 1);
        return null;
    }
    
    public boolean addToAdventure3(Card playCard){
        return adventure3.add(playCard);
    }
    
    public Card getAdventure3Top(){
        if(!adventure3.isEmpty())
            return adventure3.get(adventure3.size() - 1);
        return null;
    }
    
    public boolean addToAdventure4(Card playCard){
        return adventure4.add(playCard);
    }
    
    public Card getAdventure4Top(){
        if(!adventure4.isEmpty())
            return adventure4.get(adventure4.size() - 1);
        return null;
    }

    /**
     * @return the deck
     */
    public ArrayList<Card> getDeck() {
        return deck;
    }

    /**
     * @return the discard
     */
    public ArrayList<Card> getDiscard() {
        return discard;
    }
    
    public int getDiscardSize(){
        return discard.size();
    }
    
    public Card removeDiscard(int i){
        return discard.remove(i);
    }
    
    public int getDeckSize(){
        return deck.size();
    }
    
    /**
     * @return the adventure1
     */
    public ArrayList<Card> getAdventure1() {
        return adventure1;
    }

    /**
     * @return the adventure2
     */
    public ArrayList<Card> getAdventure2() {
        return adventure2;
    }

    /**
     * @return the adventure3
     */
    public ArrayList<Card> getAdventure3() {
        return adventure3;
    }

    /**
     * @return the adventure4
     */
    public ArrayList<Card> getAdventure4() {
        return adventure4;
    }
    
    public void addToDiscard(Card cr){
        discard.add(cr);
    }
    
    public void showDiscards(){
        discard.size();
        for(Card cf: discard){
            System.out.println(cf.getNumber() + " " + cf.getType());
        }
    }
    
    public void transferDiscardToDeck(){
        for(int l = 0; l < discard.size(); l++){
            deck.add(discard.remove(0));
        }
        
        shuffleDeck(deck);
    }
    public float getPlayedCardsAdventure1()
    {
            float playedCards = ((adventure1.size() + 1) * 2);
            System.out.println("PlayedCards1 = " + playedCards);
            return playedCards;
    }

    public float getPlayedCardsAdventure2()
    {
            float playedCards = ((adventure2.size() + 1) * 2);
            System.out.println("PlayedCards2 = " + playedCards);
            return playedCards;
    }
/*
    public float getPlayedCardsAdventure3()
    {
            float playedCards = ((adventure3.size() + 1) * 2);
            System.out.println(playedCards);
            return playedCards;
    }

    public float getPlayedCardsAdventure4()
    {
            float playedCards = ((adventure4.size() + 1) * 2);
            System.out.println(playedCards);
            return playedCards;
    }
*/
    public float getBase()
    {
            float base = ((getPlayedCardsAdventure1() + getOnHandNumAdventure1()) / 24) + ((getPlayedCardsAdventure2() + getOnHandNumAdventure2()) / 24);
            return base;
    }
// + ((getPlayedCardsAdventure3() + getOnHandNumAdventure3()) / 24) + ((getPlayedCardsAdventure4() + getOnHandNumAdventure4()) / 24)
    public float getAdventure1Prob()
    {
            
            float base = getBase();
            System.out.println("BASE = " + base);
            float adventure1Size = ((adventure1.size() + 1) * 2);
            float onHandAdventure1 = getOnHandNumAdventure1();
            float adventure1Prob = ((adventure1Size + onHandAdventure1) / 24) / base;
            System.out.println("Adventure Prob 1 = " + adventure1Prob);
            return adventure1Prob;
    }

    public float getAdventure2Prob()
    {
            //System.out.println(getBase());
            float base = getBase();
            System.out.println("BASE = " + base);
            float adventure2Size = ((adventure2.size() + 1) * 2);
            float onHandAdventure2 = getOnHandNumAdventure2();
            float adventure2Prob = ((adventure2Size + onHandAdventure2) / 24) / base;
            System.out.println("Adventure Prob 2 = " + adventure2Prob);
            return adventure2Prob;
    }
/*
    public float getAdventure3Prob()
    {
            System.out.println(getBase());
            float base = getBase();
            float adventure3Prob = ((((adventure3.size() + 1) * 2) + getOnHandNumAdventure3()) / 24) / base;

            return adventure3Prob;
    }

    public float getAdventure4Prob()
    {
            System.out.println(getBase());
            float base = getBase();
            float adventure4Prob = ((((adventure4.size() + 1) * 2) + getOnHandNumAdventure4()) / 24) / base;

            return adventure4Prob;
    }
*/


    public int getOnHandNumAdventure1()
    {
            int numCards = 0;
            ArrayList<Card> cr = players.get(0).getOnHand();
            for(int i = 0; i < cr.size(); i++)
            {
                    if(cr.get(i).getType().equals("Adventure1"))
                            numCards++;
            }
            System.out.println("NUM CARDS1 = " + numCards);
            return numCards;
    }

    public int getOnHandNumAdventure2()
    {
            int numCards = 0;
            ArrayList<Card> cr = players.get(0).getOnHand();
            for(int i = 0; i < cr.size(); i++)
            {
                    if(cr.get(i).getType().equals("Adventure2"))
                            numCards++;
            }
            System.out.println("NUM CARDS2 = " + numCards);
            return numCards;
    }
/*
    public int getOnHandNumAdventure3()
    {
            int numCards = 0;
            ArrayList<Card> cr = players.get(0).getOnHand();
            for(int i = 0; i < cr.size(); i++)
            {
                    if(cr.get(i).getType().equals("Adventure3"))
                            numCards++;
            }
            System.out.println(numCards);
            return numCards;
    }

    public int getOnHandNumAdventure4()
    {
           int numCards = 0;
            ArrayList<Card> cr = players.get(0).getOnHand();
            for(int i = 0; i < cr.size(); i++)
            {
                    if(cr.get(i).getType().equals("Adventure4"))
                            numCards++;
            }
            System.out.println(numCards);
            return numCards;
    }
*/
}
