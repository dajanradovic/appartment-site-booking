package com.dajance;

import java.io.IOException;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class IspisDostupnihDatumaVelikiAp extends HttpServlet {
	
public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//ArrayList<Integer> slobodniDatumi = new ArrayList<Integer>();
		//ArrayList<Integer> zauzetiDatumi = new ArrayList<Integer>();
		Map <Integer, Integer> slobodniDatumiVelikiAp = new HashMap();
		
		
		/*String dol = req.getParameter("dolazak");
		String odl = req.getParameter("odlazak");
		String noviDatumDol= dol.substring(6, 10)  + dol.substring(0, 2) +  dol.substring(3, 5);
		String noviDatumOdl = odl.substring(6, 10)  + odl.substring(0, 2) +  odl.substring(3, 5);
		//System.out.println(noviDatumDol);
		//System.out.println(noviDatumOdl);
		String izbor = req.getParameter("izbor");
		System.out.println(izbor);
		
		if (izbor.equalsIgnoreCase("mali")) {
		
		
		int dolazakZaProvjeru = Integer.parseInt(noviDatumDol);
		int odlazakZaProvjeru = Integer.parseInt(noviDatumOdl);*/
		
		KonekcijaUBazu prva = new KonekcijaUBazu();
		try {
			prva.slobodniDatumiVelikiAp(slobodniDatumiVelikiAp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*BookingService provjera = new BookingService();
		
		provjera.provjeraDostupnisti(dolazakZaProvjeru, odlazakZaProvjeru, slobodniDatumi, zauzetiDatumi);
		
		for (int k : slobodniDatumi) {
			System.out.println("Slobodni datumi su: " + k); 
			
		}
		*/
		
		//System.out.println("");
	
		
		//for (int k : zauzetiDatumi) {
		//	System.out.println("Zauzetii datumi su: " + k); 
			
		
		
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
		
		
		//String dajan = "dajan";
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		StringWriter stringWriter = new StringWriter();
		objectMapper.writeValue(stringWriter, slobodniDatumiVelikiAp );
		
		System.out.println("groupsList JSON is\n"+stringWriter);
		res.setContentType("application/json");
		res.setCharacterEncoding("UTF-8");
	    
	    objectMapper.writeValue(res.getOutputStream(), stringWriter);
	    //res.sendRedirect("services.html");
		stringWriter.toString();
		
}
}