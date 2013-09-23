package daili;
/**
 * 此处使用代理类来完成中间代理的工作，屏蔽实现代理的细节
 * */
public class Proxy implements NetWork{
	    private NetWork netWork;
	 
	    Proxy(NetWork netWork){
	        this.netWork = netWork;
	    }
	 
	    public void browser(){
	        checkName();
	        this.netWork.browser();
	    }
	 
	    private void checkName(){
	        System.out.println("准备");
	    }
}
