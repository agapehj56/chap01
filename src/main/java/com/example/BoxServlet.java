package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/box")
public class BoxServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<div style= 'width: 100px; "
								+ "height: 100px;"
								+ "border: 2px solid black;"
								+ "background-color: red;"
								+ "border-radius : 10px 10px 0 0;'>"
								+ "<h1 style ='text-align : center;'> Box </div>");
	}
}
