package com.dajance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class KonekcijaUBazu {

	Connection con;
	
	public KonekcijaUBazu() {
		
		String url = "jdbc:mysql://localhost:3306/dajanova_baza?useUnicode=true&characterEncoding=utf8&serverTimezone=" + TimeZone.getDefault().getID();
	    String uname = "root";
	    String pass = "";
	    
	    
	                   
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			 con = DriverManager.getConnection(url,uname,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void unosUBazuSlobodanDatum (int datum) throws SQLException {
		
		String query= "insert into maliap (slobodnidatumi) values(?)";

		
	    PreparedStatement st = con.prepareStatement(query);
	    st.setString(1, Integer.toString(datum));
	   
	     int count = st.executeUpdate();
	     st.close();
         con.close();
	}
	
	
	
	public void unosUBazuZauzetDatum (int datum) throws SQLException {
		
		String query= "select into maliap (zauzetidatumi) values(?)";

		
	    PreparedStatement st = con.prepareStatement(query);
	    st.setString(1, Integer.toString(datum));
	   
	     int count = st.executeUpdate();
	     st.close();
         con.close();
	}
	
		public void slobodniDatumi (ArrayList<Integer> lista) throws SQLException {
			
			
			String query= "select slobodnidatumi, cijena from maliap";

			
			 Statement st = con.createStatement();
	         		        
	         ResultSet rs = st.executeQuery(query);
	         
	         while (rs.next()) {
	        	 
	        	 lista.put(rs.getInt("slobodnidatumi"), rs.getInt("cijena"));
	         }
	         
	         
		     st.close();
	         con.close();
			
	}
		
		
			public void zauzetiDatumi (ArrayList<Integer> lista) throws SQLException {
			
			
			String query= "select zauzetidatumi from maliap";

			
			 Statement st = con.createStatement();
	         
		     ResultSet rs = st.executeQuery(query);
	         
	         while (rs.next()) {
	        	 
	        	 lista.add(Integer.parseInt("zauzetidatumi"));
	         }
	         
	         st.close();
	         con.close();
				}
			
			public void slobodniDatumiVelikiAp (Map<Integer, Integer> lista) throws SQLException {
				
				
				String query= "select slobodnidatumi, cijena from velikiap";

				
				 Statement st = con.createStatement();
		         		        
		         ResultSet rs = st.executeQuery(query);
		         
		         while (rs.next()) {
		        	 
		        	 lista.put(rs.getInt("slobodnidatumi"), rs.getInt("cijena"));
		         }
		         
		         
			     st.close();
		         con.close();
				
		}
	
	}

