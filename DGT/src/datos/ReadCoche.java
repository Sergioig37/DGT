package datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import ayudasexternas.CocheCreator;
import objetos.Coche;

public class ReadCoche {

	public static void readFiles(String Fichero) {

		BufferedReader ficheroEntrada;
		ArrayList<Coche> coches = new ArrayList<Coche>();

		try {
			ficheroEntrada = new BufferedReader(new FileReader(Fichero));

			String matricula = ficheroEntrada.readLine();

			while (matricula != null) {

				String marca = ficheroEntrada.readLine();

				String modelo = ficheroEntrada.readLine();

				String color = ficheroEntrada.readLine();

				Coche coche = CocheCreator.crearCoche(matricula, marca, modelo, color);

				coches.add(coche);

				matricula = ficheroEntrada.readLine();

			}
			ficheroEntrada.close();
		} catch (Exception e) {
			System.out.println("Error, precios diferentes");
			e.printStackTrace();
		}
		
	}
}
