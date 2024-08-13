package br.com.zitrus.controller;

import br.com.zitrus.util.DatabaseConnectionUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test-connection")
public class TestConnectionServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5118834726821419031L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean isConnectionSuccessful = DatabaseConnectionUtil.testDatabaseConnection();
        response.setContentType("text/plain");
        response.getWriter().write(String.valueOf(isConnectionSuccessful));
    }
}