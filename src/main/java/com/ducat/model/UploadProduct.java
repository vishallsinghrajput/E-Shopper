package com.ducat.model;

import java.io.IOException;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/uproduct")
@MultipartConfig(fileSizeThreshold = 1000000000, maxFileSize = 1000000000000l, maxRequestSize = 1000000000)
public class UploadProduct extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String p_name = req.getParameter("p_name");
		String p_price = req.getParameter("p_price");
		String p_quantity = req.getParameter("p_quantity");

		Part images1 = req.getPart("p_image1");
		Part images2 = req.getPart("p_image2");
		Part images3 = req.getPart("p_image3");
		Part images4 = req.getPart("p_image4");

		String size1 = req.getParameter("p_size1");
		String size2 = req.getParameter("p_size2");
		String size3 = req.getParameter("p_size3");
		String size4 = req.getParameter("p_size4");

		String color1 = req.getParameter("p_color1");
		String color2 = req.getParameter("p_color2");
		String color3 = req.getParameter("p_color3");
		String color4 = req.getParameter("p_color4");

		String Description = req.getParameter("p_description");
		String info = req.getParameter("p_info");
		String category = req.getParameter("p_category");

		for (Part p : req.getParts()) {

			p.write("C:\\Users\\vishal singh\\eclipse-workspace\\E-shopper\\src\\main\\webapp\\upload_image\\" + images1);
			p.write("C:\\Users\\vishal singh\\eclipse-workspace\\E-shopper\\src\\main\\webapp\\upload_image\\" + images2);
			p.write("C:\\Users\\vishal singh\\eclipse-workspace\\E-shopper\\src\\main\\webapp\\upload_image\\" + images3);
			p.write("C:\\Users\\vishal singh\\eclipse-workspace\\E-shopper\\src\\main\\webapp\\upload_image\\" + images4);
		}

		PImages pImages = new PImages(images1.getSubmittedFileName().toString(),
				images2.getSubmittedFileName().toString(), images3.getSubmittedFileName().toString(),
				images4.getSubmittedFileName().toString());
		PSize pSize = new PSize(size1, size2, size3, size4);
		PColor pColor = new PColor(color1, color2, color3, color4);

		Products p = new Products(p_name, Float.parseFloat(p_price), Integer.parseInt(p_quantity), pImages, pSize,
				pColor, 0, Description, info, null, category);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin_unit");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();

	}
}