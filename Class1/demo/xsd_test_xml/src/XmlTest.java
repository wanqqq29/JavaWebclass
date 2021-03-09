import java.io.IOException;

import org.xml.sax.SAXException;


public class XmlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidateXML validateXML = new ValidateXML();
		boolean bol = false;
		try {
			bol = validateXML.Validatexml("D:\\test\\test2.xsd", "D:\\test\\test3.xml");
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the xml is passed by xsd test? : "+ bol);

	}

}
