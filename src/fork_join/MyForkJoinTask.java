package fork_join;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class MyForkJoinTask<V> extends ForkJoinTask<V> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private V value;
    
    private boolean success = false;
    
    @Override
    public V getRawResult() {
        return value;
    }

    @Override
    protected void setRawResult(V value) {
        this.value = value;
    }

    @Override
    protected boolean exec() {
        System.out.println("exec");
        return this.success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean isSuccess) {
        this.success = isSuccess;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
    	 final ForkJoinPool forkJoinPool = new ForkJoinPool();  
         final MyForkJoinTask<String> task = new MyForkJoinTask<String>();  
           
         task.setSuccess(true); // 是否在此任务运行完毕后结束阻塞  
         ForkJoinTask<String> result = forkJoinPool.submit(task);  
         result.get(); // 如果exec
	}
    
}
