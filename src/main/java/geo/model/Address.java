package main.java.geo.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Address {

	private int address_id;
	private String address;
	private String estado;
	private int ciudad_id;
	
	public Address(int addres_id,String address,String estado,int ciudad_id) {
		this.address_id=addres_id;
		this.address=address;
		this.estado=estado;
		this.ciudad_id=ciudad_id;
	}

	public int getAddress_id() {
		return address_id;
	}

	public String getAddress() {
		return address;
	}

	public String getEstado() {
		return estado;
	}

	public int getCiudad_id() {
		return ciudad_id;
	}

	@Override
	public String toString() {
		return "Id de direccion: " + address_id + ", direccion: " + address + ", en el estado: " 
				+ estado + ", ciudad_id="
				+ ciudad_id + "\n";
	}
	
	
	
		
	
}
