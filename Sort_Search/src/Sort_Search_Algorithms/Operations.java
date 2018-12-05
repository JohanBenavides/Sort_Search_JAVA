/*
 * In this class I have the operations of reading in the console the numbers, the request of the number of search and the method to write the chains of numbers
 */
package Sort_Search_Algorithms;
import java.io.*;
/**
 *
 * @authorauthor Johan Benavides Arias
 */
public class Operations {
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );    
          
    public int[] readArrayFronConsole()throws IOException	
        {        
        String[] numbers = br.readLine().split(",");//creation of numbers array
        int[] arrayNumbers = new int[numbers.length];     
	    for(int i = 0; i < numbers.length; i++)
		arrayNumbers[i] = Integer.parseInt( numbers[i] );
                
            return arrayNumbers;	
	}
    public int Number_Search()throws IOException	
        { 
         bw.write("\nIngrese número para buscar: ");
            bw.flush();
                String number= br.readLine();
                    int Number=Integer.parseInt(number);
                
         return Number;            
	}    
    public void printArray(int[] array)throws IOException
	{
	bw.write("\nLa cadena ordenada es: ");	
	for(int i = 0; i < array.length - 1; i++)//number array writing
            bw.write(array[i] + ",");
                bw.write(array[array.length - 1] + "\n");
                    bw.flush();		
	}       
    
}
