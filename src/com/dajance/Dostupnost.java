package com.dajance;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

public class Dostupnost extends HttpServlet  {
	
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		ArrayList<Integer> slobodniDatumi1 = new ArrayList<Integer>();
		ArrayList<Integer> zauzetiDatumi = new ArrayList<Integer>();
		
		
		
		String dol = req.getParameter("dolazak");
		String odl = req.getParameter("odlazak");
		String noviDatumDol= dol.substring(6, 10)  + dol.substring(0, 2) +  dol.substring(3, 5);
		String noviDatumOdl = odl.substring(6, 10)  + odl.substring(0, 2) +  odl.substring(3, 5);
		//System.out.println(noviDatumDol);
		//System.out.println(noviDatumOdl);
		String izbor = req.getParameter("izbor");
		System.out.println(izbor);
		
		if (izbor.equalsIgnoreCase("mali")) {
		
		
		int dolazakZaProvjeru = Integer.parseInt(noviDatumDol);
		int odlazakZaProvjeru = Integer.parseInt(noviDatumOdl);
		
		KonekcijaUBazu prva = new KonekcijaUBazu();
		try {
			prva.slobodniDatumi(slobodniDatumi1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BookingService provjera = new BookingService();
		
		provjera.provjeraDostupnisti(dolazakZaProvjeru, odlazakZaProvjeru, slobodniDatumi1, zauzetiDatumi);
		
		for (int k : slobodniDatumi1) {
			System.out.println("Slobodni datumi su: " + k); 
			
		}
		
		
		System.out.println("");
		System.out.println("");
		
		for (int k : zauzetiDatumi) {
			System.out.println("Zauzetii datumi su: " + k); 
			
		}
		}
		
		/*VelikiApRezQuery jedan = new VelikiApRezQuery();
		if (izbor.equalsIgnoreCase("veliki")){
			
		
		try {
			System.out.println (jedan.provjeriDostupnostVelikiAp(noviDatumDol, noviDatumOdl));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		
		else {
			try {
				System.out.println (jedan.provjeriDostupnostMaliAp(noviDatumDol, noviDatumOdl));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
	
		
		
	res.sendRedirect("services.html");
	}

}
