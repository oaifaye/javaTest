package listener;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Listener {
	private Object wait_object = new Object();
	Queue<String> list = new LinkedBlockingQueue<String>();
	private Runnable run = new Runnable() {
		public void run() {
			while (!list.isEmpty()) {
				System.out.println("do something");
			}
			synchronized (wait_object) {
				System.out.println("睡着。。。");
				try {
					wait_object.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("醒来。。。");
			}
		}
	};

	public void wakeUp() {
		list.add("object");
		synchronized (wait_object) {
			wait_object.notifyAll();
		}
	}

	public void start() {
		new Thread(run).start();
	}

}
