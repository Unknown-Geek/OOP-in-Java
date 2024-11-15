import java.util.Scanner;

class SharedResource {
	synchronized void printNum(int num) {
		System.out.println();
		for (int i = 1; i < 6 ; i++) {
			System.out.println(num * i);
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread extends Thread {
	int num;
	SharedResource sharedResource;
	MyThread(SharedResource sharedResource, int num) {
		this.num = num;
		this.sharedResource = sharedResource;
	}
	public void run() {
		sharedResource.printNum(num);
	}
}

public class Thread_Sync {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		SharedResource s = new SharedResource();
		MyThread thread1 = new MyThread(s, 5);
		MyThread thread2 = new MyThread(s, 8);
		thread1.start();
		thread2.start();
	}
}