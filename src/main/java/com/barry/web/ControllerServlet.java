package com.barry.web;


import com.barry.metier.CreditMetier;
import com.barry.metier.impl.CreditMetierImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cs",urlPatterns = {"/controller","*.do"})
public class ControllerServlet extends HttpServlet {

    private CreditMetier metier;


    @Override
    public void init() throws ServletException {
        metier = new CreditMetierImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("creditModel", new CreditModel());
        req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double amount = Double.parseDouble(req.getParameter("amount"));
        Double rate = Double.parseDouble(req.getParameter("rate"));
        int duration = Integer.parseInt(req.getParameter("duration"));

        CreditModel model = new CreditModel();
        model.setAmount(amount);
        model.setRate(rate);
        model.setDuration(duration);
        model.setMonthlyPayment(metier.calculateMonthlyCredit(amount, rate, duration));
        req.setAttribute("creditModel", model);
        req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);
    }
}
