/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String ageString = request.getParameter("age");
        
        if(ageString == null)
        {
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }
        if(ageString.trim().isEmpty())
        {
            request.setAttribute("errorMessage", "You must give your current age");
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }
        else
        {
            try
            {
                int ageInt = Integer.parseInt(ageString);
                request.setAttribute("successMessage", "your age next birthday will be " + ageInt);
            }
            catch(NumberFormatException e){}
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO
    }

}
