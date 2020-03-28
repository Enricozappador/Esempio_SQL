package it.polito.tdp.esempio_SQL.model;

public class Station {
	
	private int id; 
	private String name; 
	private int dockcount; 
	private String landmark;
	
	
	public Station(int id, String name, int dockcount, String landmark) {
		super();
		this.id = id;
		this.name = name;
		this.dockcount = dockcount;
		this.landmark = landmark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDockcount() {
		return dockcount;
	}
	public void setDockcount(int dockcount) {
		this.dockcount = dockcount;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	} 
	

}
