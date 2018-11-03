/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.session.Laundry;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dipta
 */
public class LaundryKel11Servlet extends HttpServlet {

    @EJB
    private Laundry laundry;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws 
        ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
        
        try {            
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<out.println(\"<head>\");>");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
            out.println("<meta name=\"description\" content=\"\">");
            out.println("<meta name=\"author\" content=\"\">");
            out.println("<title>Skip The Laundry</title>");
            out.println("<link href=\"style/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">");
            out.println("<link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900,900i\" rel=\"stylesheet\">");
            out.println("<link href=\"https://fonts.googleapis.com/css?family=Merriweather:300,300i,400,400i,700,700i,900,900i\" rel=\"stylesheet\">");
            out.println("<link href=\"style/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">");
            out.println("<link href=\"css/coming-soon.min.css\" rel=\"stylesheet\">");
            out.println("</head>");
            out.println("</head>");
            out.println("<body");
            
            out.println("<div class=\"overlay\"></div>");
            out.println("<video playsinline=\"playsinline\" autoplay=\"autoplay\" muted=\"muted\" loop=\"loop\">");
            out.println("<source src=\"mp4/bg2.mp4\" type=\"video/mp4\">");
            out.println("</video>");
            
            String bayar = request.getParameter("bayar");
            
            if ((bayar != null) && (bayar.length() > 0)) {
                double d = Double.parseDouble(bayar);
                if (request.getParameter("Hitung") != null){
                    String total = laundry.total_harga(d);
                    out.println("<div class=\"masthead\">");
                    out.println("<div class=\"masthead-bg\"></div>");
                    out.println("<div class=\"container h-100\">");
                    out.println("<div class=\"row h-100\">");
                    out.println("<div class=\"col-12 my-auto\">");
                    out.println("<div class=\"masthead-content text-white py-5 py-md-0\">");
                    out.println("<h1 class=\"mb-3\">Terimakasih</h1>");
                    out.println("<p class=\"mb-5\">Silahkan melakukan transaksi sebesar \n" +
"                   <strong>Rp. "+total+" </strong></p>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</div>");
                    
                }  
                
                
            } else {
                out.println("<div class=\"masthead\">");
                out.println("<div class=\"masthead-bg\"></div>");
                out.println("<div class=\"container h-100\">");
                out.println("<div class=\"row h-100\">");
                out.println("<div class=\"col-12 my-auto\">");
                out.println("<div class=\"masthead-content text-white py-5 py-md-0\">");
                out.println("<h1 class=\"mb-3\">Skip The Laundry</h1>");
                out.println("<p class=\"mb-5\">Kami akan membantu anda untuk menghitung harga yang perlu anda bayarkan, hanya dengan \n" +
"                <strong>Rp 4.500/kg </strong>pakaian anda kembali bersih dan wangi!</p>");
                out.println("<form method=\"get\">");
                out.println("<p><input type=\"text\" name=\"bayar\" size=\"20\"></p>");              
                out.println("<input type=\"submit\" name=\"Hitung\" value=\"Hitung!\">");
                out.println("</form>");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
            }
        
        } finally {
            out.println("</body>");
            out.println("</html>");
            out.close();
        }               
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
