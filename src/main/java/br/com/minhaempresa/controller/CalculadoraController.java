package br.com.minhaempresa.controller;
import br.com.minhaempresa.service.CalculadoraService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/calculadora")
public class CalculadoraController  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double operandoA = Double.valueOf(req.getParameter("operandoA"));
        double operandoB = Double.valueOf(req.getParameter("operandoB"));
        int operador = Integer.valueOf(req.getParameter("operador"));
        double resultado = 0;

        CalculadoraService calculadoraService = new CalculadoraService();
        resultado = calculadoraService.calcular(operandoA, operandoB, operador);

    }
}
