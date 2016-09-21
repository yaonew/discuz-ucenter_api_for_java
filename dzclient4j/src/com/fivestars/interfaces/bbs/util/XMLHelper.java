package com.fivestars.interfaces.bbs.util;

import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.InputSource;



/**
 * ================================================
 * Discuz! Ucenter API for JAVA
 * ================================================
 * XML工具类，处理UC Client接收到返回结果。
 * UC Client会收到UC Server返回的XML结果
 * 该类将XML中的数据提取成一个List按顺序读取即可。
 * 
 * 更多信息：http://code.google.com/p/discuz-ucenter-api-for-java/
 * 作者：梁平 (no_ten@163.com) 
 * 创建时间：2009-2-20
 */
public class XMLHelper {

	public static LinkedList<String> uc_unserialize(String input){
		
		LinkedList<String> result = new LinkedList<String>();
		
		
		 
		try {			
			 
			SAXReader saxReader = new SAXReader();
			Document document = saxReader.read(new InputSource(new StringReader(input)));
			Element root = document.getRootElement();
			List<Element> childList = root.elements();
			for(Element element : childList) {
				result.add(element.getText());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
