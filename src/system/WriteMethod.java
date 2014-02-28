package system;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class WriteMethod {
	private String s;
	
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}

	private final static String LINE_SEPARATOR = System.getProperty("line.separator");
	public final String toString() {
		StringBuilder toStringBuilder = new StringBuilder("class name:  ")
				.append(this.getClass().getName());
		try {
			toStringBuilder.append(LINE_SEPARATOR);
			for (PropertyDescriptor p : Introspector.getBeanInfo(
					this.getClass()).getPropertyDescriptors()) {
				if (p.getWriteMethod() != null) {
					Method m = p.getReadMethod();
					Object value = m.invoke(this);
					toStringBuilder.append("fieldName: ").
									append(p.getName()).
									append(", value: ").
									append(value).
									append(LINE_SEPARATOR);
				}
			}
//			toStringBuilder.append("]");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toStringBuilder.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new WriteMethod().toString());
		String s="11";
		String s1="12";
		boolean w = false;
		boolean w1=false;
		if(w=w1){}
		System.out.println(s=s1);
		
		final char a='w';
		switch('e'){
			case a:
				System.out.println("a=1"); 
			case 'e':
				System.out.println("a=21"); 
			case 'a':
				System.out.println("a=22"); 
			break;
		}
	}

}
