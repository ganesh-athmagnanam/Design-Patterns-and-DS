package codingpractice;

// print odd and even number using 2 threads until 10
public class PrintOddAndEvenThreads {
	 int count=1;
	public synchronized void printOdd() {
		while(count<10) {
			while(count%2==0) {
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}
			try {
				Thread.sleep(1000);
				System.out.println(count);
				++count;
			} catch (InterruptedException e) {
			}
			notify();
		}
	}

	public synchronized void printEven() {
		while(count<10) {
			while(count%2!=0) {
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}
			try {
				Thread.sleep(1000);
				System.out.println(count);
				++count;
			} catch (InterruptedException e) {
			}
			notify();
		}
	}

	public static void main(String[] args) {
		PrintOddAndEvenThreads print=new PrintOddAndEvenThreads();
		Thread odd = new Thread(new Runnable() {
			@Override
			public void run() {
				print.printOdd();
			}
		});
		Thread even = new Thread(new Runnable() {

			@Override
			public void run() {
				print.printEven();
			}
		});
		odd.start();
		even.start();
	}

}
