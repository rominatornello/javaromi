package examples;
import java.io.FileNotFoundException;
public class DemoThrowsException {
	
	 public static void main(String args[])
		        throws InterruptedException {		       
		        DemoThrowsException demo = null;
		        demo.findFile("lala");
		        
		    }
	
	public void readFile(String file) throws FileNotFoundException {     
        boolean found = findFile(file);                         
        if (!found)
            throw new FileNotFoundException("Missing file");    
        else {
            //code to read file
        }
    }
	
    boolean findFile(String file) {
        return false;
    }
}
