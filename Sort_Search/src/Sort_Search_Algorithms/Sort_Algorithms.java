/*
 *In this class you have two sorting algorithms named bubbleSort and insertionSort
 */
package Sort_Search_Algorithms;
/**
 *@author Johan Benavides Arias
 */
public class Sort_Algorithms {
    
    public int [] bubbleSort(int[] unsortedArray)//array parameter messy
	{
         int n = unsortedArray.length;//array length  
         int temp; //variable where a temporary data is stored  
         
           for(int i=0; i < n; i++){//travel of the array of numbers  
                 for(int j=1; j < (n-i); j++){//compare to adjacent elements  
                          if(unsortedArray[j-1] > unsortedArray[j]){//ordering of numbers  
                                 //swap elements  
                                 temp = unsortedArray[j-1];  
                                 unsortedArray[j-1] = unsortedArray[j];
                                 unsortedArray[j] = temp;  
                          }                           
                 }  
           }
           return unsortedArray;//ordered array
	}
    public int [] insertionSort(int[] unsortedArray)//array parameter messy
	{
            int temp, index_hole;
            
            for(int i = 1;i< unsortedArray.length;i++)//travel of the array of numbers
            {//select value to be moved
                temp = unsortedArray[i];
                index_hole = i;
                //locate hole position for the value to be inserted *
                while(index_hole > 0 && temp < unsortedArray[index_hole -1])//ordering of numbers
                {
                    unsortedArray[index_hole] = unsortedArray[index_hole -1];
                    index_hole = index_hole -1;
                }//insert the value at hole position
                unsortedArray[index_hole] = temp;
            }
           return unsortedArray;//ordered array 
	} 
    
}
