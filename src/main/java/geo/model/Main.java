package main.java.geo.model;

import main.java.geo.loader.AddressLoader;

public class Main {

	public static void main(String[] args) {

		AddressLoader al = new AddressLoader();
		System.out.println(al.cargarDirecciones());
		
	}

}
