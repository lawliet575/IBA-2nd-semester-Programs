import java.io.*;

public class FileWrite {
    
    public FileWrite(String data) throws FileNotFoundException {      

        try {

            File myObj = new File("data.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } 
            else {
              System.out.println("File already exists.");
            } 
            
            FileWriter myWriter = new FileWriter(myObj);
            myWriter.write(data);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

           }

        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }


    }


}
