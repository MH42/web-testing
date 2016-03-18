package utilities;

//FROM http://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.FileWriter;


public class ReadXML {

	public static void main(String argv[]) throws SAXException, IOException, ParserConfigurationException {

		String file = "java20160318-153039";
		readXML(file);


	}	

	public static void readXML(String file) throws ParserConfigurationException, SAXException, IOException{	
		File fXmlFile = new File(System.getProperty("user.dir")+File.separator  + file + ".xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();

		System.out.println("name,time,error,failure \n");

		NodeList nList = doc.getElementsByTagName("testsuite");

		int z = 0;
		int x = 0;
		int i = 0;
		
		String outputFile = System.getProperty("user.dir")+File.separator + file + ".csv";
		FileWriter writer = new FileWriter(outputFile);
		writer.append("name,time,error,failure");
		writer.append('\n');
		
		for (i = 0; i < nList.getLength(); i++) {

			Node nNode = nList.item(i);

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;

				System.out.print(eElement.getAttribute("name"));
				writer.append(eElement.getAttribute("name"));
				writer.append(',');
				System.out.print("\t" + eElement.getAttribute("time"));
				writer.append(eElement.getAttribute("time"));
				writer.append(',');				
				if(	(eElement.getElementsByTagName("error")).getLength() > 0){
					z++;
					System.out.print("\t1");
					writer.append("1");
				} else
					System.out.print("\t0");
					writer.append("0");

				
				writer.append(',');	
				
				if(	(eElement.getElementsByTagName("failure")).getLength() > 0){
					x++;
					System.out.println("\t1");
					writer.append("1");
				} else
					System.out.println("\t0");	
					writer.append("0");
				
				 writer.append('\n');

			}
		}
		System.out.println(z + " " + x + " " + i);
	    writer.flush();
	    writer.close();
	}	




}

