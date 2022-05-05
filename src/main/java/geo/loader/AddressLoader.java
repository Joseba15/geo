package main.java.geo.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import main.java.geo.model.Address;

public class AddressLoader {
	
	public List<Address>cargarDirecciones(){
		List<Address> direcciones=new ArrayList<>();
		
		
		try{
			File file = new File("./files/address.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String linea;
		
			br.readLine();
			linea=br.readLine();
			while (linea!=null){
				
				
				String[] info= linea.split(",");
				//String[] datosFecha= info[0].split("/");
				
				
					if (info.length>=5) {
						direcciones.add(new Address(Integer.valueOf(info[0]),info[1],info[3],Integer.valueOf(info[4])));
						
					}
					
				
				
				linea=br.readLine();
			}
			
			
			br.close();
			fr.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
			
		return direcciones;
		
	}
	
	
}
