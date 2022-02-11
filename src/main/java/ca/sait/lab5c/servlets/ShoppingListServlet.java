package ca.sait.lab5c.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kingston
 */
public class ShoppingListServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String name = (String) session.getAttribute("name");

        if (name == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }

        //getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        // getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        

        if (action != null && action.equals("add")) {
            String item = request.getParameter("item");
            
            
        } else {
            String name = request.getParameter("name");
            HttpSession session = request.getSession();
            ArrayList<String> items = new ArrayList<>();

            session.setAttribute("name", name);
            session.setAttribute("items", items);

            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);

        }
    }

}
