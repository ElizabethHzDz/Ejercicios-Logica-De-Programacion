package ejercicioDiez;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Diez {

	public static void main(String[] args) {
  

		HashMap diccionario = new HashMap <String, String> ();
		
		//Creamos el diccionario 
		diccionario.put("china", "China");
		diccionario.put("india", "India");
		diccionario.put("iran", "Iran");
		diccionario.put("japon", "Japan");
		diccionario.put("arabia saudita", "Saudi Arabia");
		diccionario.put("corea del sur", "South Korea");
		diccionario.put("australia", "Australia");
		diccionario.put("nueva zelanda", "New Zealand");
		diccionario.put("fiyi", "Fiji");
		diccionario.put("argentina", "Argentina");
		diccionario.put("brasil", "Brazil");
		diccionario.put("chile", "Chile");
		diccionario.put("colombia", "Colombia");
		diccionario.put("venezuela", "Venezuela");
		diccionario.put("perú", "Peru");
		diccionario.put("canadá", "Canada");
		diccionario.put("cuba", "Cuba");
		diccionario.put("mexico", "Mexico");
		diccionario.put("estados unidos", "United States");
		diccionario.put("republica dominicana", "Dominican Republic");
		diccionario.put("belice", "belize");
		diccionario.put("nicaragua", "Nicaragua");
		diccionario.put("guatemala", "Guatemala");
		diccionario.put("dinamarca", "Denmark");
		diccionario.put("francia", "France");
		diccionario.put("alemania", "Germany");
		diccionario.put("italia", "Italy");
		diccionario.put("rusia", "Russia");
		diccionario.put("españa", "Spain");
		diccionario.put("reino Unido", "United Kingdom");
		diccionario.put("egipto", "Egypt");
		diccionario.put("marruecos", "Morocco");
		diccionario.put("sudáfrica", "South Africa");
		diccionario.put("camerún", "Cameroon");
		diccionario.put("nigeria", "Nigeria");
		
		System.out.println("***** Bienvenido, este programa te ayuda a practicar las traducciones del diccionario Español - Ingles *****");
		
		System.out.println("\n Introduce el nombre del país en inglés\n");
		
		//Ingresamos la entrada del usuario
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {

			List<String> valuesList = new ArrayList<String>(diccionario.keySet());
			int randomIndex = new Random().nextInt(valuesList.size());
			String randomValue = valuesList.get(randomIndex);
			System.out.println(randomValue);

			String palabra = entrada.nextLine();
		}
		
		
		entrada.close();
		
		
		
		
	}
}
		