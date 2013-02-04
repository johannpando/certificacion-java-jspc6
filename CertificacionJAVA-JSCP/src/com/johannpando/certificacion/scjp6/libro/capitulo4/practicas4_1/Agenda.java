package com.johannpando.certificacion.scjp6.libro.capitulo4.practicas4_1;

import java.util.Enumeration;
import java.util.Hashtable;

public class Agenda {
	
	
	private Hashtable<String, Persona> tp = new Hashtable<String, Persona>();
	
	/**
	 * Método encargado de añadir a la hashTable tp, el nombre, el dni y el teléfono a una nueva persona
	 * @param nom
	 * @param dni
	 * @param tel
	 * @return
	 */
	public boolean agregar(String nom, String dni, String tel){

		//Buscamos en el hashtable si no existe una llave (dni) para insertar a la persona 
		if(!tp.containsKey(dni)){
			Persona p = new Persona();
			p.setDni(dni);
			p.setNombre(nom);
			p.setTelefono(tel);
			tp.put(dni, p);
			return true;
		} else {//de lo contrario devolvemos que la operación ha fallado, return false.
			return false;
		}
	}
	
	/**
	 * Método encargado de eliminar del hashTable tp por la llave indicada, dni.
	 * @param dni
	 * @return operacionCorrecta variable booleana, por defecto false
	 */
	public boolean eliminar(String dni){
	
		boolean operacionCorrecta = false;
		
		//Si la clave se encuentra, se elimina a la persona
		if(tp.containsKey(dni)){
			tp.remove(dni);
			operacionCorrecta = true;
		} else {//de lo contrario, la operación no ha sido satisfactoria
			return operacionCorrecta;
		}
		
		return operacionCorrecta;
	}
	
	public Persona recuperar(String dni){
		Persona p = null;
		
		if(tp.containsKey(dni)){
			p = tp.get(dni);
		}
		
		return p;
	}
	
	/**
	 * Método que devuelve todas las llaves del hashTable <code>tp</code>
	 * @return tp.keys();
	 */
	public Enumeration<String> total(){
		return tp.keys();
	}

}
