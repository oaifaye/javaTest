package threadTest.SingleThreadedExecution.ex1;

public class Main {
    public static void main(String[] args) {
    	Gate g = new Gate();
    	new UserThread(g,"a","a").start();
    	new UserThread(g,"b","b").start();
    	new UserThread(g,"c","c").start();
    	new UserThread(g,"d","d").start();
    }
}
