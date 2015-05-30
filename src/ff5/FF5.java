/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ff5;

import java.util.*;
import view.Main;

/**
 *
 * @author marcus
 */
public class FF5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Main m = new Main();
        
//        ArrayList<Card> deck = new ArrayList();
//        ArrayList<Card> discard = new ArrayList();
//        ArrayList<String> types = new ArrayList();
//        ArrayList<Player> players = new ArrayList();
//        ArrayList<Card> happycards = new ArrayList();
//        Field field = new Field();
//        
//        int starter;
//        boolean end = false;
//        boolean start = true;
//        
//        types.add("Adventure1");
//        types.add("Adventure2");
//        types.add("Adventure3");
//        types.add("Adventure4");
//        types.add("General DangerCard");
//        types.add("DangerCard");
//        types.add("AllSafe");
//        
//        for(int i = 0; i < 4; i++){
//            String type = types.get(i);
//            for(int j = 1; j <= 8; j++){
//                Card card = new Card(type, j);
//                deck.add(card);
//            }
//            
//            Card dc = new Card(types.get(5), i+1);
//            
//            deck.add(dc);
//        }
//        
//        for(int x = 0; x < 2; x++){
//            Card generaldc = new Card(types.get(4), x+1);
//            deck.add(generaldc);
//        }
//        
//        for(int y = 0; y < 6; y++){
//            Card generaldc = new Card(types.get(6), y+1);
//            deck.add(generaldc);
//        }
//        
//        for(int d = 0; d < deck.size(); d++){
//            if(deck.get(d).getType().startsWith("Adventure")){
//                if(deck.get(d).getNumber() == 8)
//                    happycards.add(deck.remove(d));
//            }
//        }
//        
//        shuffleDeck(happycards);
//        shuffleDeck(happycards);
//        shuffleDeck(happycards);
//        shuffleDeck(happycards);
//        
//        for(Card cr: happycards){
//            System.out.println(cr.getType()+ "   " + cr.getNumber());
//        }
//        System.out.println("");
//        
//        Scanner sc = new Scanner(System.in);
//        int noPlay = 0;
//        do{
//            System.out.println("How Many Players? 2- 4 only: ");
//            noPlay= sc.nextInt();
//        }while(noPlay < 2 || noPlay > 4);
//        
//        if(noPlay != 4){
//            starter = 6;
//        }
//        else{
//            starter = 5;
//        }
//        
//        for(int j = 0; j < noPlay; j++){
//            String playr = "Player";
//            int dex = j + 1;
//            playr += dex;
//            players.add(new Player(playr));
//        }
//        
//        for(int p = 0; p < players.size(); p++){
//            players.get(p).drawCard(happycards.remove(0));
//        }
//        
//        for(int x1 = 0; x1 < happycards.size(); x1++){
//            deck.add(happycards.remove(x1));
//        }
//        
//        shuffleDeck(deck);
//        shuffleDeck(deck);
//        shuffleDeck(deck);
//        
//        System.out.println();
//        
//        //for(Card card1: deck){
//        //    System.out.println(card1.getType()+ "   " + card1.getNumber());
//        //}
//        
//        for(int x2 = 0; x2 < starter; x2++){
//            for(int x3 = 0; x3 < players.size(); x3++){
//                players.get(x3).drawCard(deck.remove(0));
//            }
//        }
//        
//        System.out.println("");
//        
//        shufflePlayer(players);
//        
//        int turn = 0;
//        Player currPlayr;
//        
//        do{
//            if(turn == players.size() - 1){
//                turn = 0;
//                //end = true;
//            }
//            currPlayr = players.remove(0);
//            System.out.println(currPlayr.getName());
//            
//            currPlayr.drawCard(deck.remove(0));
//            
//            int move = 0;
//            do{ 
//                
//                System.out.println(field.getAdventure1Top().getType() + " " + field.getAdventure1Top().getNumber());
//                System.out.println(field.getAdventure2Top().getType() + " " + field.getAdventure2Top().getNumber());
//                System.out.println(field.getAdventure3Top().getType() + " " + field.getAdventure3Top().getNumber());
//                System.out.println(field.getAdventure4Top().getType() + " " + field.getAdventure4Top().getNumber());
//                
//                System.out.println("Choose your move:\n[1]Play a Card\n[2]Discard a Card");
//                move = sc.nextInt();
//                int cChoice = 0;
//                do{
//                    for(int cr3 = 0; cr3 < currPlayr.getOnHand().size(); cr3++){
//                        System.out.println(currPlayr.getOnHand().get(cr3).getType() + " " + currPlayr.getOnHand().get(cr3).getNumber());
//                    }
//                    cChoice = sc.nextInt();
//                }while(move < 1 || cChoice > currPlayr.getOnHand().size());
//                
//                cChoice -= 1;
//                
//                if(move == 1){
//                    Card crr = currPlayr.removeCard(cChoice);
//                    if(crr.getType().equals(deck))
//                }
//                
//            }while(move < 1 || move > 2);
//            
//            turn++;
//            players.add(currPlayr);
//
//        }while(end == false);
        
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
  
   public static void shufflePlayer(ArrayList<Player> a) {
    int n = a.size();
    Random random = new Random();
    random.nextInt();
    for (int i = 0; i < n; i++) {
      int change = i + random.nextInt(n - i);
      swapP(a, i, change);
    }
  }

  private static void swapP(ArrayList<Player> a, int i, int change) {
    Player helper = a.get(i);
    a.set(i, a.get(change));
    a.set(change, helper);
  }
    
}
