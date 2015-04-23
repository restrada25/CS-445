import java.util.ArrayList;
import java.util.Collection;
import java.io.*;

public class Main {
	
	public static void saveClubState(Club c) throws IOException {
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;
		try {
			fout = new FileOutputStream("~/john-smith.ser", true);
			oos = new ObjectOutputStream(fout);
			oos.writeObject(c);
		} catch (IOException e) {
		        e.printStackTrace();
		} finally {
			if(oos != null) {
				oos.close();
			} 
		}
	}
	
	public static Club restoreClubState(Club c) throws IOException {
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("~/john-smith.ser");
			ois = new ObjectInputStream(fis);
			c = (Club)ois.readObject();
			return c;
		} catch (IOException e) {
			System.err.println("Nothing to restore.\n");
		} 
		catch (ClassNotFoundException e) {
			System.err.println("ClassNotFoundException caught in restoreClubState()");
			e.printStackTrace();
		}
			finally {
			if (ois != null) {
				ois.close();
			} 
		}
		return b;
	}


	public static void main(String[] args) {	
		Club c = new Club("VIN");
// Do stuff here

// Try saving bakery state
		try {
			saveClubState(c);
		} catch (IOException e) {
			System.err.println("IOException caught when trying to save state.\n");
		}
		
// Try restoring bakery state
		c = null;
		try {
			c = restoreClubState(c);
		} catch (IOException e) {
			System.err.println("IOException caught when trying to restore state");
		}
// Do even more stuff		
	}
}
