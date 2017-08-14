package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void mainn(String[] args) {
		Employee e = new Employee();
		e.setAddress("Phokka Kuan, Ambehta Peer");
		e.setName("Reyan Ali");
		e.setAaa("aaa");
		e.setDdd("ddd");
		
		try {
			FileOutputStream fileOut = new FileOutputStream("e:\\employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
	
	
	public static void main(String [] args)
	   {
	      Employee e = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream("e:\\employee.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Employee) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e.getName());
	      System.out.println("Address: " + e.getAddress());
	      System.out.println("SSN: " + e.getSSN());
	      System.out.println("Number: " + e.getNumber());
	      System.out.println("aaa: " + e.getAaa());
	      System.out.println("bbb: " + e.getBbb());
	    }
}
