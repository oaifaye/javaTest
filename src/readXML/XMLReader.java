package readXML;

import org.w3c.dom.*;   
import javax.xml.parsers.*;   
import java.io.*;   

public class XMLReader {
	 
	// Document可以看作是XML在内存中的一个镜像,那么一旦获取这个Document 就意味着可以通过对   
	// 内存的操作来实现对XML的操作,首先第一步获取XML相关的Document   
	private Document doc = null;   
	 
	public void init(String xmlFile) throws Exception {   
		// 很明显该类是一个单例,先获取产生DocumentBuilder工厂   
		// 的工厂,在通过这个工厂产生一个DocumentBuilder,   
		// DocumentBuilder就是用来产生Document的   
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();   
		DocumentBuilder db = dbf.newDocumentBuilder();   
		// 这个Document就是一个XML文件在内存中的镜像   
		doc = db.parse(new File(xmlFile));   
	}   
	 
	// 该方法负责把XML文件的内容显示出来   
	public void viewXML(String xmlFile) throws Exception {   
		this.init(xmlFile);   
		// 在xml文件里,只有一个根元素,先把根元素拿出来看看   
		Element element = doc.getDocumentElement();   
		System.out.println("根元素为:" + element.getTagName());   
	 
		NodeList nodeList = doc.getElementsByTagName("person");   
		System.out.println("book节点链的长度:" + nodeList.getLength());   
	 
		Node fatherNode = nodeList.item(0);   
		System.out.println("父节点为:" + fatherNode.getNodeName());   
	 
		// 把父节点的属性拿出来   
		NamedNodeMap attributes = fatherNode.getAttributes();   
	 
		for (int i = 0; i < attributes.getLength(); i++) {   
			Node attribute = attributes.item(i);   
			System.out.println("book的属性名为:" + attribute.getNodeName()   
					+ " 相对应的属性值为:" + attribute.getNodeValue());   
		}   
	 
		NodeList childNodes = fatherNode.getChildNodes();   
		System.out.println(childNodes.getLength());   
		for (int j = 0; j < childNodes.getLength(); j++) {   
			Node childNode = childNodes.item(j);   
			// 如果这个节点属于Element ,再进行取值   
			if (childNode instanceof Element) {   
				// System.out.println("子节点名为:"+childNode.getNodeName()+"相对应的值为"+childNode.getFirstChild().getNodeValue());   
				System.out.println("子节点名为:" + childNode.getNodeName()   
						+ "相对应的值为" + childNode.getFirstChild().getNodeValue());   
			}   
		}   
	}   
	 
	public static void main(String[] args) throws Exception {   
		XMLReader parse = new XMLReader();   
	 
		// 我的XML文件   
		parse.viewXML("src/readXML/person.xml");
	}   
}
