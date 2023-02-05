package part2;

import java.io.*; // The section 7 objectives
					//focus on classes from
					//java.io

public class WriterIO {
	public static void main(String[] args) {
		try {
			boolean newFile = false;
			File file = new File("FileWriter1.txt");
			
			System.out.println(file.exists());
			newFile = file.createNewFile();
			System.out.println(newFile);
			System.out.println(file.exists());
		}
		catch(IOException e) {
			
		}
	}
}