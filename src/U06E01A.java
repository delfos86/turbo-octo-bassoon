import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;


public class U06E01A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //String myStr = "the butcher's wife, she was from Montreal";
		File documento = new File("C:\\Users\\Delfos\\Desktop\\jana\\colecciones\\quijote_cervantes.txt");
		
		
		
		 try {
		Reader r = new FileReader(documento);
	    StreamTokenizer st = new StreamTokenizer(r);
	    
	   
	    while (st.nextToken() != StreamTokenizer.TT_EOF) {
	      System.out.println(st.sval);
	    }
	    r.close();
	    }
	    catch(Exception e) {			
			System.out.println(e+"Archivo no encontrado");			
		}
		
		/*
		try {		
		
		FileReader input = new FileReader(documento);		
		BufferedReader br = new BufferedReader(input);

    // Declaring a string variable
    String st;
    // Condition holds true till
    // there is character in a string
    while ((st = br.readLine()) != null) {

        // Print the string
        System.out.println(st);
        
    }*/
		
		
		
		/*	
		try {
		 
		  Scanner escan = new Scanner(documento);
		List<String> result = new Scanner(documento)
			     .useDelimiter(" ")
			     .tokens()
			     .collect(Collectors.toList());
		result.forEach((n)-> System.out.println(n));
		}
		
		catch(Exception e) {			
			System.out.println(e+"Archivo no encontrado");			
		}
		*/
		
		
	       // String[] words = myStr.split("\\s+");
	       // System.out.println("Word Count is: "+words.length);
	
	}
	/*
	 * restore
	 */

}
