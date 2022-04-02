 
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.business.BusinessEJBLocal;
 


public class InitialTossServlet extends HttpServlet {

    @EJB
    private BusinessEJBLocal businessEJB;

     
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        int choice = (int)session.getAttribute("choice");
        
        int randomNum =  (int)businessEJB.generateRandomNum();
        
        int currentScore = (int)session.getAttribute("score");
        
        int numOfTosses = (int)session.getAttribute("numOfTosses");
                
        int newScore = (int)businessEJB.updateScore(currentScore, choice, randomNum);
        
        int newNumOfTosses = (int)businessEJB.udateNumOfTosses(numOfTosses);
        
        String result = (String)businessEJB.getResult(choice,randomNum);
        
        session.setAttribute("result", result);
        session.setAttribute("score", newScore);
        session.setAttribute("numOfTosses", newNumOfTosses);
        
        RequestDispatcher Disp = request.getRequestDispatcher("outcome.jsp");
        Disp.forward(request, response);
        
    }
  

}
