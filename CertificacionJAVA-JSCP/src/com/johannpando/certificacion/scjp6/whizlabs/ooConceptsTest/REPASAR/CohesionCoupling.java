package com.johannpando.certificacion.scjp6.whizlabs.ooConceptsTest.REPASAR;

/**
 * Cohesión se refiere al número y la diversidad de tareas que una sola unidad
 * es responsable. Si cada unidad es responsable de una tarea lógica única,
 * decimos que tiene alta cohesión.<br>
 * <br>
 * 
 * Cohesión se aplica a las clases y métodos. Aquí el método takeOrderAndServe
 * () no se centra en una sola tarea, por lo que muestra la baja cohesión. Un
 * bien diseñado hasta tendrán la cohesión alta.<br>
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
