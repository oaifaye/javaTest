package zhujie.zhujie1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation1 {

	public int i = 0;
	
	public String m1() default "1";
}
