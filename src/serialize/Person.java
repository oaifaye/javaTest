package serialize;

/**
 1.关于序列化：
 1.如果序列化对象包括枚举类型，那么序列化和反序列化是同一个对象，而其他数据类型序列化和反序列化是不同的对象（详看群共享源码）
 2.有枚举的反序列后会造成数据值不匹配（未测，尽量不要让枚举参与序列化，类似webservice这样的中间件，已解决了这个问题）
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @ClassName Person
 * @Description TODO
 * @author Administrator@tfkj.com
 * @date 2013-11-4
 */
public class Person implements Serializable {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return "Name:" + name + "; Age:" + age;
	}

	private static void writeObject(Object obj, String filePath) {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(obj);
			os.flush();
			fos.flush();
			os.close();
			fos.close();
			System.out.println("序列化成功。");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static Object readObject(String filePath) {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream is = new ObjectInputStream(fis);

			Object temp = is.readObject();

			fis.close();
			is.close();

			if (temp != null) {
				System.out.println("反序列化成功。");
				return temp;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

	private static Person serializeTest1() {
		Person person = new Person();
		person.setName("Zhang San");
		person.setAge(30);
		System.out.println(person);
		writeObject(person, "d:\\person.obj");
		return person;
	}

	private static Person deserializeTest1() {
		Person temp = (Person) readObject("d:\\person.obj");

		if (temp != null) {
			System.out.println(temp);
		}
		return temp;
	}

	public static void main(String args[]) {
		Person kk = serializeTest1();
		Person pp = deserializeTest1();
		System.out.println("序列号前Person==" + kk);
		System.out.println("序列号前Person==" + pp);

		if (kk == pp) {
			System.out.println("same");
		} else {
			System.out.println("diff");
		}
	}
}
