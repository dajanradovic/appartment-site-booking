package com.dajance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimeZone;

public class VelikiApRezQuery {
	
	
	
	String query = "select dolazak, odlazak from velikiap where  ?  >= dolazak and ? <odlazak and ? > dolazak and ? <= odlazak";
	String query2 = "select dolazak, odlazak from maliapslobodnitermini where  ?  >= dolazak and ? <odlazak and ? > dolazak and ? <= odlazak" ; 
	//String query3 = "select dolazak, odlazak from maliapslobodnitermini where ? > dolazak and ? <= odlazak";
	
	public String provjeriDostupnostVelikiAp (String dol, String odl) throws ClassNotFoundException, SQLException {
		

		String url = "jdbc:mysql://localhost:3306/dajanova_baza?useUnicode=true&characterEncoding=utf8&serverTimezone=" + TimeZone.getDefault().getID();
	    String uname = "root";
	    String pass = "";
	    
	                   
	    
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url,uname,pass);
	    
	     PreparedStatement st = con.prepareStatement(query);
	     st.setString(1, dol);
	     st.setString(2, dol);
	     st.setString(3, odl);
	     st.setString(4, odl);
	     
	     
	     ResultSet rs = st.executeQuery();
	     System.out.println("Ide skroz u bazu velikiap");
	     
 
	     
	     if (rs.next()) {
	   
	     
	     	
	     				
	     		String a =  "Datumi su zauzeti";
	     		con.close();
	     		
	     
	     		return a;
	     }
	     
	     	else {
	     		
	     		
	    	    
	     		
	     		
	     		String b= "Datumi su slobodni";
	     						con.close();
	     						return b;}
	     
	     
	     
	    
		
			
			
		
		
	}
	
	
public String provjeriDostupnostMaliAp (String dol, String odl) throws ClassNotFoundException, SQLException {
		

		String url = "jdbc:mysql://localhost:3306/dajanova_baza?useUnicode=true&characterEncoding=utf8&serverTimezone=" + TimeZone.getDefault().getID();
	    String uname = "root";
	    String pass = "";
	    
	                   
	    
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url,uname,pass);
	    
	     PreparedStatement st = con.prepareStatement(query2);
	     st.setString(1, dol);
	     st.setString(2, dol);
	     st.setString(3, odl);
	     st.setString(4, odl);
	     ResultSet rs = st.executeQuery();
	     System.out.println("Ide skroz u bazu maliap");
	     
	     boolean c = rs.first();
	     
	     if (!c) {
	    // c=rs.getString("dolazak");
	   //  d=rs.getString("odlazak");
	     
	     	
	     				
	     		String a =  "Datumi su zauzeti";
	     		con.close();
	     
	     		return a;
	     }
	     
	     	else {
	     		
	     		
	    	    
	     		
	     		
	     		String b= "Datumi su slobodni";
	     						con.close();
	     						return b;}
	     
	   
	 
		
	}
   
}
