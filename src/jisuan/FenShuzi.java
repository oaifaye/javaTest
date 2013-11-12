package jisuan;

/**
 * 将六位数字的每一位打印
 * */
public class FenShuzi {

	public long[] suan(long l){
		long[] array = new long[6];
		long x;
		int i = 5;
		while(l!=0){
			x = l%10;
			l = l/10;
			array[i]=x;
			i--;
		}
		return array;
	}
	
	public static void main(String[] args) {
		FenShuzi fenShuzi = new FenShuzi();
		long[] s = fenShuzi.suan(598745);
		for(long i : s){
			System.out.println(i);
		}
		
	}
	
}
