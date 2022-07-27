package com.jobRotation.Questao3;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;
import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;  
import org.w3c.dom.Element;  



//FIXME Não tenho ideia de como resolver

public class Questao3 {
	public static void main(String[] args) {
		
		try {
			File file = new File("D:\\Programas\\Repositorios\\QuestoesJobRotationSP\\JobRotationTeste\\src\\com\\jobRotation\\Questao3\\dados.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);  
			doc.getDocumentElement().normalize();
			NodeList nl = doc.getElementsByTagName("row");
			
			int valorMenor = 0;
			int valorMaior = 0;
			int atual = 0;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//
	}
}

