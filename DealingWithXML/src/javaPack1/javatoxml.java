package javaPack1;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class javatoxml {
	public static void main(String [] args0) {
		
		emp e1= new emp();
		e1.setId(34);
		e1.setName("taniya");
	    e1.setSalary(35754.9);
	    
	    try
	    {
	    	File file = new File("C:\\Users\\a07208trng_b4a.03.28\\Desktop\\wp\\file.xml");
	    	JAXBContext jaxbContext = JAXBContext.newInstance(emp.class);
	    	Marshaller marshaller = jaxbContext.createMarshaller();
	    	
	    	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    	marshaller.marshal(e1, file);
	    	marshaller.marshal(e1,System.out);
	    	
	    	
	    }
	    catch(Exception e)
	    {
	    	System.out.println("abc");
	    }
	}

}
