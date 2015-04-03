package zhujie.zhujie1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException {
		Vo vo = new Vo();
		Class<? extends Vo> c = vo.getClass();
		Method method = c.getMethod("method1");
		Annotation1 a1 = method.getAnnotation(Annotation1.class);
		System.out.println(a1.m1());;
		
		Field filed = c.getField("s");
		Annotation1 a2 = filed.getAnnotation(Annotation1.class);
		System.out.println(a2.m1());
	}
	
}
