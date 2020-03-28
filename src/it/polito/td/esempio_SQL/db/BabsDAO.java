package it.polito.td.esempio_SQL.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.esempio_SQL.model.Station;

public class BabsDAO {

	public List<Station> listStation(){
		
		List<Station> result = new ArrayList<>();
		
		String sql = "SELECT station_id, name, dockcount, landmark FROM station ORDER BY name" ; 
String jdbcURL = "jdbc:mysql://localhost/babs?user=root&password=Enrico17";
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL);
			
			PreparedStatement st = conn.prepareStatement(sql) ;
			
			//st.setString(1, "Palo Alto");
			ResultSet res = st.executeQuery(); 
			
			while (res.next()) {
				Station s = new Station(res.getInt("station_id"), res.getString("name"),
						res.getInt("dockcount"), res.getString("landmark"));
				result.add(s);
			}
			
			st.close();
			
			conn.close(); 
			
			return result; 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} 
		
		return null; 
		
	}
	
}
