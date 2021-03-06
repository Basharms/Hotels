package com.maf.hotels;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.maf.hotels.model.AvailableHotelsData;
import com.maf.hotels.model.BestHotels;
import com.maf.hotels.model.CrazyHotels;
import com.maf.hotels.service.AvailableHotelsService;

/**
 * Servlet implementation class AvailableHotels
 */
@WebServlet("/AvailableHotels")
public class AvailableHotels extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AvailableHotels() {
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AvailableHotels.doPost()");
		AvailableHotelsService service  = new  AvailableHotelsService();
		String result = service.getAvailableHotels(request);
		
		// Send the response as json format
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(result);
		out.flush();
	}
	
	
}
