import java.util.Scanner;

class oddThread extends Thread {
	int num;
	oddThread(int num) {
		this.num = num;
	}
	public void run() {
		System.out.println(num);		
	}
}

class evenThread extends Thread {
	int num;
	evenThread(int num) {
		this.num = num;
	}
	public void run() {
		System.out.println(num);		
	}
}

public class Two_Threads {
	public static void main(String args[]) {
		System.out.println("Odd Numbers :");
		for(int num = 0; num <= 100 ; num++) {
			if(num % 2 != 0) {
				oddThread thread1 = new oddThread(num);
				thread1.start();
			}
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("\nEven Numbers :");
		for(int num = 0; num <= 100 ; num++) {
			if(num % 2 == 0) {
				evenThread thread2 = new evenThread(num);
				thread2.start();
			}
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}