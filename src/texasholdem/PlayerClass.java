/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package texasholdem;

/**
 *
 * @author pardoje_cis21035
 */
public class PlayerClass {
    class Player{
        String Name;
        Card Hand[2];
        int Chips;
        boolean isDealer;
    }
    
    
    public void giveAnte (int Ant){
        
    }
    
    public void fold (){
        
    }
    
    public void check (){
        
    }
    
    public void raise (int Chips){
        
    }
    
    public void flipCard (Card rev[2]){
        
    }
    
   
    
    class Dealer{
        String Name;
   
     void collectAnte (Player plays[]){
         
     }   
     
     void shuffleDeck (){
         
     }
     
     void dealPlayerCards (){
         
     }
     
     void dealSharedCards (){
         
     }
     
     void checkHands (){
         
     }
     
 
    }
    
    class Human{
        
        void changeDifficulty(String newDiff){
        
        }
        
    }
    
    class Computer {
        String Difficulty;
        
        void makeMove (String move){
            
        }
    }
}
