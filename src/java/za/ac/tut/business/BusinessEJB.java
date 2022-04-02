/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package za.ac.tut.business;

import java.util.Random;
import javax.ejb.Stateless;

/**
 *
 * @author tresorkl
 */
@Stateless
public class BusinessEJB implements BusinessEJBLocal {

    @Override
    public int updateScore(int currentScore, int choice, int randomNum) {
        int newScore = 0;
        
        if(choice==randomNum){
           newScore= currentScore+1;
        }
        
        return newScore;
    }

    @Override
    public int udateNumOfTosses(int currentNumOfTosses) {
        
        int newNumOfToss = 0;
        
        newNumOfToss = currentNumOfTosses+1;
        
        return newNumOfToss;
    }

    @Override
    public int generateRandomNum() {
         Random rn = new Random();
         int randomNum = rn.nextInt(2-1+1)+1;
         
        return randomNum;
    }

    @Override
    public String getResult(int choice,int randomNum ) {
        String result ="FAILED";
        
        if (choice == randomNum){
            result ="WON";
        }
        
        return result;
    }

    @Override
    public int determineServerScore(int playerScore, int totNumOfTosses) {
        int serverScore=0;
        
        serverScore = totNumOfTosses - playerScore;
        
        return serverScore;
    }
    
    

    
     
}
