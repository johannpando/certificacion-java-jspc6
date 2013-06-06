package com.johannpando.certificacion.scjp6.whizlabs.TestIII.Runnable;

//Which of the following lines will not compile? Select two choices.

class MyClass implements Runnable {
	public void run() {
	}
}

class Test {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(); // 1
		Thread t2 = new Thread(new MyClass()); // 2
		Thread t3 = new Thread(new MyClass(), "Thread3"); // 3
		Thread t4 = new Thread("Thread4"); // 4
		// Thread t5 = new Thread("Thread5", 5); // 5
		// Thread t6 = new Thread("Thread6", new MyClass()); // 6

		/**
		 * The valid Thread constructors are: Thread() Thread(Runnable target)
		 * Thread(Runnable target,String name) Thread(String name)
		 * Thread(ThreadGroup group,Runnable target) Thread(ThreadGroup
		 * group,Runnable target,String name) Thread(ThreadGroup group,String
		 * name) Choices E and F are thus invalid, whereas all the others are
		 * valid constructor calls.
		 */
	}
}