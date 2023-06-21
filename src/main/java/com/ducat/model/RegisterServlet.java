package com.ducat.model;

import java.io.IOException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String city = req.getParameter("city");
		String country = req.getParameter("country");
		String password = req.getParameter("password");
		String mobile = req.getParameter("mobile");
		String label = req.getParameter("label");

		if (label.equals("admin")) {
			UserName uName = new UserName(fname, lname);
			AdminRegister rURegister = new AdminRegister(uName, email, gender, mobile, city, country, password);

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin_unit");
			EntityManager em = emf.createEntityManager();

			em.getTransaction().begin();
			em.persist(rURegister);
			em.getTransaction().commit();

			resp.sendRedirect("login.jsp");
		} else {

			UserName uName = new UserName(fname, lname);
			URegister rURegister = new URegister(uName, email, gender, city, country, password);

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit");
			EntityManager em = emf.createEntityManager();

			em.getTransaction().begin();
			em.persist(rURegister);
			em.getTransaction().commit();

			resp.sendRedirect("login.jsp");
		}

	}
}