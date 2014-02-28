package threadTest.SingleThreadedExecution.ex1;

public class Gate {
    private int num = 0;
    private String add;
    private String name;
    
    void pass(String name ,String add){
    	this.add = add;
    	this.name=name;
    	check();
    }
    
    public void check(){
    	if(add.equals(name)){
    		//System.out.println(num++ + name + add);
    	}else{
    		System.out.println("*****BROKEN*****" + num++ + name + add);
    	}
    }
    
}

