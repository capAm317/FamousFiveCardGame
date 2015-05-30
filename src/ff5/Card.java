/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ff5;

/**
 *
 * @author marcus
 */
public class Card {
    
    private String types;
    private int number;
    private String file;
    
    public Card(String types, int number, String file){
        
        this.types = types;
        this.number = number;
        this.file = file;
        
    }

    /**
     * @return the types
     */
    public String getType() {
        return types;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }
    
    /**
     * @return the file
     */
    public String getFile() {
        return file;
    }

    public String toString()
    {
    	return types + " " + number;
    }
}
