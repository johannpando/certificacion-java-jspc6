package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.REPASAR;

/**
 * Cohesi�n se refiere al n�mero y la diversidad de tareas que una sola unidad
 * es responsable. Si cada unidad es responsable de una tarea l�gica �nica,
 * decimos que tiene alta cohesi�n.<br>
 * <br>
 * 
 * Cohesi�n se aplica a las clases y m�todos. Aqu� el m�todo takeOrderAndServe
 * () no se centra en una sola tarea, por lo que muestra la baja cohesi�n. Un
 * bien dise�ado hasta tendr�n la cohesi�n alta.<br>
 * <br>
 * Cohesion refers to the number and diversity of task that a single unit is
 * responsible for. If each unit is responsible for one single logical task, we
 * say it has high cohesion.
 * 
 * Cohesion applies to classes and methods. Here the takeOrderAndServe() method
 * is not focused on a single task, so it shows low cohesion. A well designed
 * until will have high cohesion.
 * 
 * @author jpandode
 * 
 */
public class CohesionCoupling {

	void takeOrders() {

	}

	void serverFood() {

	}

	void takeOrdersAndServe() {
		takeOrders();
		serverFood();
	}
}
