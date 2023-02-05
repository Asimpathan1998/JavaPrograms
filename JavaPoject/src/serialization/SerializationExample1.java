package serialization;

import java.io.Serializable;

public class SerializationExample1 implements Serializable{
	int id;
	String name;
	
	public SerializationExample1(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
