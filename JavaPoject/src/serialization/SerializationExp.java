package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExp {

	public static void main(String[] args) {
		try {
			SerializationExample1 sobj = new SerializationExample1(211, "Asim");
			//Creating stream and writing the object  
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(sobj);
			out.flush();
			out.close();
			System.out.println("Success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
