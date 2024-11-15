class Thread_Priority extends Thread {
	public void run() {
		System.out.println("Program to implement thread priorities");
	}
	
	public static void main(String args[]) {
		Thread_Priority t1 = new Thread_Priority();
		System.out.println("Priority of the thread : " + t1.getPriority());
		t1.setPriority(7);
		System.out.println("Priority of the thread : " + t1.getPriority());
		Thread_Priority t2 = new Thread_Priority();
		t2.setName("MaxThread");
		System.out.println("The Name of the Thread : " + t2.getName());
		System.out.println("Currently executing thread : " + Thread.currentThread().getName());
	}
}