import java.util.Scanner;
import java.util.Random;

class RandomNum extends Thread {
	int num;
	public void run() {
		Random rand = new Random();
		while (true) {
			num = rand.nextInt(100);
			if(num % 2 == 0) {
				SquareThread squareThread = new SquareThread(num);
				squareThread.start();
			} 
			else {
				CubeThread cubeThread = new CubeThread(num);
				cubeThread.start();
			}
			try {
				sleep(1000);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class SquareThread extends Thread {
	int num, square;
	SquareThread(int num) {
		this.num = num;
	}
	public void run() {
		square = num * num;
		System.out.println(num + " is even, Square: " + square);
	}
}

class CubeThread extends Thread {
	int num, cube;
	CubeThread(int num) {
		this.num = num;
	}
	public void run() {
		cube = num * num * num;
		System.out.println(num + " is odd, Cube: " + cube);
	}
}

public class Multi_Threading {
	public static void main(String args[]) {
		RandomNum randomThread = new RandomNum();
		randomThread.start();
	}
}