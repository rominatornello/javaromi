package examples;


import java.io.*;

public class IOExample {


	 public static void main(String args[]) {
	     IOExample example = new IOExample();
		 File fileNew = new File("C:/Users/romina.tornello/Downloads/ioexample/archivo.txt");
		 //create a file
	/*	 example.createFile(fileNew);

		 //read file
		  example.readFile(fileNew);

		  //createTempFile
		  example.createTempFile();*/

		 //create and read a serializable object
	     Person person = new Person("pablo", "pablo@mail.com");
		 example.createAndReadSerializable(person);
	 }

	private void createFile(File fileNew){
		try {
			if(!fileNew.exists())
				fileNew.createNewFile();
			FileWriter fileWriter = new FileWriter(fileNew.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fileWriter);
			bw.write("Creating new file....felipito es muy lindo "+"\n");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readFile(File fileNew){
		try {
			//abrimos el archivo
			FileInputStream fstream = new FileInputStream(fileNew);
			//creamos el objeto de entrada
			DataInputStream entrada = new DataInputStream(fstream);
			//creamos el buffer de lectura
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			String linea;
			//lee el archivo linea por linea
			while((linea = buffer.readLine())!= null){
				System.out.print(linea);
			}
			entrada.close();

		} catch (Exception e) {
			System.out.print("error" + e.getMessage());
		}

	}

	private void createTempFile(){
		try {
			File tempFile= File.createTempFile("tmp",".txt", new File("C:/Users/romina.tornello/Downloads/ioexample/"));
			System.out.println("the temp file name is: "+ tempFile.getName());

			tempFile.deleteOnExit();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void createAndReadSerializable(Person person){

		try {
			//save the object in a fila
			FileOutputStream file = new FileOutputStream("personExample");
			ObjectOutputStream object = new ObjectOutputStream(file);
			object.writeObject(person);
			object.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fileInput = new FileInputStream("personExample");
			ObjectInputStream objectIn= new ObjectInputStream(fileInput);
			System.out.print("El objeto que leo es : " + objectIn.readObject());
			objectIn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}

