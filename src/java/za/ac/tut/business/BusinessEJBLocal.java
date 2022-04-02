/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package za.ac.tut.business;

import javax.ejb.Local;

/**
 *
 * @author tresorkl
 */
@Local
public interface BusinessEJBLocal {

    int updateScore(int currentScore, int choice, int randomNum);

    int udateNumOfTosses(int currentNumOfTosses);

    int generateRandomNum();

    String getResult(int choice,int randomNum);
    
    int determineServerScore(int playerScore,int totNumOfTosses);
    
}
