/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tresorkl
 */
public class StartSessionServlet extends HttpServlet {

    

     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String choiceStr = request.getParameter("guess");
        
        
        int choice = Integer.parseInt(choiceStr);
        int numOfTosses =0;
        int score =0;
        initialiseSession(session,choice,numOfTosses,score);
        
        
        response.sendRedirect("InitialTossServlet.do");
        
    }

    public void initialiseSession(HttpSession session,int choice,int score, int numOfTosses){
       
        session.setAttribute("choice", choice);
        
        session.setAttribute("score", score);
       
        session.setAttribute("numOfTosses", numOfTosses);
       
        
    }

}
