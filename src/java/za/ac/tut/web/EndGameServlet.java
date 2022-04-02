/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
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

/**
 *
 * @author tresorkl
 */
public class EndGameServlet extends HttpServlet {

    @EJB
    private BusinessEJBLocal businessEJB;

     

     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        int playerScore = (int)session.getAttribute("score");
        int totNumOfTosses = (int)session.getAttribute("numOfTosses");
        
        int serverScore = businessEJB.determineServerScore(playerScore, totNumOfTosses);
        
        session.setAttribute("serverScore", serverScore);
        
        RequestDispatcher Disp = request.getRequestDispatcher("summary.jsp");
        Disp.forward(request, response);
    }

    

}
