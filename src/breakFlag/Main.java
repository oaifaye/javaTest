package breakFlag;

public class Main {

	/**标号，结束制定层循环*/
	public static void main(String[] args) {
		System.out.println(new Main().a());
		
		flag:
			for(int i = 0 ; i < 10 ;i++){
				for(int j = 0; j < 10 ; j++){
					if(j==2){
						continue flag;
					}
					System.out.println("内");
					//System.out.println(i);
				}
				//System.out.println("外");
			}
	}
	
	int a(){
		try{
			System.out.println(" 1");
			  //System.exit(0);

		}finally{
		return 2;
		}
		}

}
