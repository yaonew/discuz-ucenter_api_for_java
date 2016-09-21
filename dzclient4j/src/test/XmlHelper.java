package test;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlHelper {

	public static void main(String ... args) throws Exception {
		
//		SAXReader saxReader = new SAXReader();
//
//        Document document = saxReader.read(new File("d:/students.xml"));
//
//        // 获取根元素
//        Element root = document.getRootElement();
//        System.out.println("Root: " + root.getName());
//
//        // 获取所有子元素
//        List<Element> childList = root.elements();
//        System.out.println("total child count: " + childList.size());
//
//        // 获取特定名称的子元素
//        List<Element> childList2 = root.elements("hello");
//        System.out.println("hello child: " + childList2.size());
//
//        // 获取名字为指定名称的第一个子元素
//        Element firstWorldElement = root.element("world");
//        // 输出其属性
//        System.out.println("first World Attr: "
//                + firstWorldElement.attribute(0).getName() + "="
//                + firstWorldElement.attributeValue("name"));
//
//        System.out.println("迭代输出-----------------------");
//        // 迭代输出
//        for (Iterator iter = root.elementIterator(); iter.hasNext();)
//        {
//            Element e = (Element) iter.next();
//            System.out.println(e.attributeValue("name"));
//
//        }
		test();
	}
	
	public static void test() throws DocumentException {
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File("d:/root.xml"));
		Element root = document.getRootElement();
		List<Element> childList = root.elements();
		for(Element element : childList) {
			System.out.println(element.getText());
		}
	}
}
