package javaPack1;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XmlTojava {
	
		public static void main(String [] args0) {
			
		
		    
		    try
		    {
		    	File file = new File("C:\\Users\\a07208trng_b4a.03.28\\Desktop\\wp\\file.xml");
		    	JAXBContext jaxbContext = JAXBContext.newInstance(emp.class);
		    	Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		    	
		    	emp e1 = (emp) unmarshaller.unmarshal(file);
		    	System.out.println(e1.getId()+ " "+ e1.getName() + " " + e1.getSalary());
		    	
		    	
		    }
		    catch(Exception e)
		    {
		    	System.out.println("abc");
		    }
		}

	}

