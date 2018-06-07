package pwr.controller;

import pwr.businesslogic.Calculator;
import pwr.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet (name = "/ShopController", urlPatterns = {"/ShopController"})
public class ShopController extends HttpServlet {

    private Product product1, product2, product3, product4;
    private List<Product> products;
    private double sum, avg;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        products = new ArrayList<>();

        if (!request.getParameter("p1").isEmpty() && !request.getParameter("price1").isEmpty()) {
            product1 = new Product(request.getParameter("p1"), Double.parseDouble(request.getParameter("price1")));
            products.add(product1);
            if (!request.getParameter("p2").isEmpty() && !request.getParameter("price3").isEmpty()) {
                product2 = new Product(request.getParameter("p2"), Double.parseDouble(request.getParameter("price2")));
                products.add(product2);
                if (!request.getParameter("p3").isEmpty() && !request.getParameter("price3").isEmpty()) {
                    product3 = new Product(request.getParameter("p3"), Double.parseDouble(request.getParameter("price3")));
                    products.add(product3);
                    if (!request.getParameter("p4").isEmpty() && !request.getParameter("price4").isEmpty()) {
                        product4 = new Product(request.getParameter("p4"), Double.parseDouble(request.getParameter("price4")));
                        products.add(product4);
                    }
                }
            }
        }

        if (!products.isEmpty()) {
            sum = Calculator.calculateSum(products);
            avg = Calculator.calculateAVG(products);

            request.setAttribute("products", products);
            request.setAttribute("sum", String.valueOf(sum));
            request.setAttribute("avg", String.valueOf(avg));

            String url = "/summary.jsp";

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("error.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
