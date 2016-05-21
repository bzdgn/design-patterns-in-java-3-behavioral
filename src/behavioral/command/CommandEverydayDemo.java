package behavioral.command;

public class CommandEverydayDemo {

	public static void main(String[] args) {
		Task task1 = new Task(10, 12);	// encapsulates request
		Task task2 = new Task(11, 13);
		
		PlusTask task3 = new PlusTask(10, 20);
		
		Thread thread1 = new Thread(task1);
		thread1.start();	// invoker
		
		Thread thread2 = new Thread(task2);
		thread2.start();
		
		Thread thread3 = new Thread(task3);
		thread3.start();
	}
	
}

class Task implements Runnable {
	int num1;
	int num2;
	
	public Task(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	public void run() {
		System.out.println(num1 * num2);
	}
}

class PlusTask implements Runnable {
	int num1;
	int num2;
	
	public PlusTask(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	public void run() {
		System.out.println("Plus Task : " + (num1 + num2));
	}
}