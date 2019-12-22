/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Book;
import entity.History;
import entity.Shopper;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.BookFacade;
import session.HistoryFacade;
import session.ShopperFacade;




/**
 *
 * @author lenovo
 */
@WebServlet(name = "BookServlet", urlPatterns = {
    "/showLogin", 
    "/login",
    "/showBook",
    "/createBook",
    "/showShopper",
    "/createShopper",
    "/listBooks",
    "/listShoppers",
    "/showOrderBook",
    "/orderBook",
    "/showBuyBook",
    "/buyBook",
    
    
})
public class BookServlet extends HttpServlet {
    @EJB BookFacade bookFacade;
    @EJB ShopperFacade shopperFacade;
    @EJB HistoryFacade historyFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String path = request.getServletPath();
        switch (path) {
            case "/showLogin":
                request.getRequestDispatcher("/showLogin.jsp")
                        .forward(request, response);
                break;
            case "/login":
                String login = request.getParameter("login");
                String password = request.getParameter("password");
                if("Tatjana".equals(login) && "Oborina".equals(password)){
                    request.setAttribute("info", "Привет, "+login+"!");
                }else{
                    request.setAttribute("info", "Неправильный логин или пароль!");
                }
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                break;
            case "/showBook":
                request.getRequestDispatcher("/showBook.jsp")
                        .forward(request, response);
                break;
            case "/createBook":
                String title = request.getParameter("title");
                String author = request.getParameter("author");
                String genre = request.getParameter("genre");
                String year = request.getParameter("year");
                String price = request.getParameter("price");
                String quantity = request.getParameter("quantity");
                Book book = new Book (
                        title, 
                        author, 
                        genre, 
                        Integer.parseInt(year), 
                        Integer.parseInt(price), 
                        Integer.parseInt(quantity));
                bookFacade.create(book);
                request.setAttribute("info", "Книга добавлена");
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                break;
                case "/listBooks":
                List<Book> listBooks = bookFacade.findAll();
                request.setAttribute("listBooks", listBooks);
                request.getRequestDispatcher("/listBooks.jsp")
                        .forward(request, response);
                break;
            case "/showShopper":
                request.getRequestDispatcher("/showShopper.jsp")
                        .forward(request, response);
                break;
            case "/createShopper":
                String name = request.getParameter("name");
                String lastname = request.getParameter("lastname");
                String email = request.getParameter("email");
                String money = request.getParameter("money");
                Shopper shopper = new Shopper (
                        name,
                        lastname,
                        email,
                        Integer.parseInt(money)
                );
            shopperFacade.create(shopper);
            request.setAttribute("info", "Ваши данные зарегистрированы в базу данных нашего магазина. Приятной покупки");
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                break;
            case "/listShoppers":
                List<Shopper> listShoppers = shopperFacade.findAll();
                request.setAttribute("listShoppers", listShoppers);
                request.getRequestDispatcher("/listShoppers.jsp")
                        .forward(request, response);
                break;
            case "/showOrderBook":
                listBooks=bookFacade.findAll();
                listShoppers=shopperFacade.findAll();
                request.setAttribute("listBooks", listBooks);
                request.setAttribute("listShoppers", listShoppers);
                request.getRequestDispatcher("/showOrderBook.jsp")
                        .forward(request, response);
                break;
            case "/orderBook":
                String bookId = request.getParameter("bookId");
                String shopperId = request.getParameter("shopperId");
                book = bookFacade.find(Long.parseLong(bookId));
                shopper = shopperFacade.find(Long.parseLong(shopperId));
                History history = new History();
                history.setBook(book);
                history.setShopper(shopper);
                history.setDate(new Date());
                historyFacade.create(history);
                request.setAttribute("info",
                        "Книга \""
                                
                        +book.getTitle()
                        +"\" выбрана и добавлена в карзину покупателя: "
                        +shopper.getName()
                        +" "+shopper.getLastname()
                );
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                break;
            
                
           
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
