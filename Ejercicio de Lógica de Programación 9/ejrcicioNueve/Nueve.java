package ejrcicioNueve;

import java.util.HashMap;
import java.util.Scanner;

public class Nueve {

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
		diccionario.put("peru", "Peru");
		diccionario.put("canada", "Canada");
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
		diccionario.put("sudafrica", "South Africa");
		diccionario.put("camerun", "Cameroon");
		diccionario.put("nigeria", "Nigeria");
		
		
		System.out.println("***** Bienvenido al diccionario de paises español-ingles *****");
		
		System.out.println("\n Introduce el nombre del país que quieras traducir");
		
		//Ingresamos la entrada del usuario
		Scanner entrada = new Scanner(System.in);
		
		//Usamos lowerCase para evitar errores si el usuario ingresa su entrada en mayusculas
		String pais= entrada.nextLine().toLowerCase();
		
		entrada.close();
		
	
			try {
				//Utilizamos el metodo GET para recuperar el valor asignado por la clave guardada en pais
				// como el valor es un objeto, usamos to.string para volverlo String y poder mostrarlo
				String valor = diccionario.get(pais).toString();
				
				System.out.println("En ingles el pais es: " +  diccionario.get(pais).toString());
				
				//Si la palabra no existe capatamos el error con un catch
			} catch (NullPointerException e) {
				
				System.out.println("Lo sentimos, no contamos con la traduccion. Intenta con otro pais");
			}
			

	}

}
