import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class ObjectTOXml {

	public static void main(String[] args) throws Exception {
JAXBContext obj=JAXBContext.newInstance(Employee.class);
Marshaller marobj=obj.createMarshaller();
marobj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Employee emp=new Employee(101, "himanshu", 50000);
		marobj.marshal(emp, new FileOutputStream("G:\\employee.xml"));
	}
}
