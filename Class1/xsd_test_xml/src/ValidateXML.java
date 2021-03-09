import java.io.File; 
import java.io.IOException;

import javax.xml.transform.Source; 
import javax.xml.transform.stream.StreamSource; 
import javax.xml.validation.Schema; 
import javax.xml.validation.SchemaFactory; 
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class ValidateXML {
	
	public ValidateXML() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean Validatexml(String xsdpath,String xmlpath) throws SAXException,IOException{
		   //����schema����
		   SchemaFactory schemaFactory=SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		   //������֤�ĵ��ļ��������ô��ļ���������װ���ļ�����schema��֤
		   File schemaFile=new File(xsdpath);
		   //����schema������������֤�ĵ��ļ���������Schema����
		   Schema schema=schemaFactory.newSchema(schemaFile);
		   //ͨ��Schema��������ڴ�Schema����֤��������schenaFile������֤
		   Validator validator=schema.newValidator();
		   //�õ���֤������Դ
		   Source source=new StreamSource(xmlpath);
		   //��ʼ��֤���ɹ����success!!!��ʧ�����fail
		   try{
		    
		    validator.validate(source); 
		    
		   }catch(Exception ex){
		    
		    ex.printStackTrace();
		    return false;
		    
		   }
		         return true;
		 }
}
