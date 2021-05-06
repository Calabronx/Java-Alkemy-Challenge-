package com.university.University.modelo;

public class Location {
	private String id;
	private String dni;
	private Location locations;
	
	public Location(String id, String dni) {
		super();
		this.id = id;
		this.dni = dni;
	}
	public String getId() {
		return id;
	}
	public String getDni() {
		return dni;
	}
	public Location getLocations() {
		return locations;
	}
	
}
