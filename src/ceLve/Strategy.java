package ceLve;

public class Strategy {

	IStrategy iStrategy;

	public Strategy(IStrategy iStrategy) {
		this.iStrategy = iStrategy;
	}
	
	public void operate(){
		iStrategy.doSomeThing();
	}
}
