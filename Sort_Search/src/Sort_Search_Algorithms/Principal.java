/*
 *In the main class I have the menu, also from here I call all the methods
 */
package Sort_Search_Algorithms;
import java.io.*;
/**
 *
 * @author Johan Benavides Arias
 */
public class Principal {
static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        
        Sort_Algorithms sorts = new Sort_Algorithms();//sorts class call
        Search_Algorithms search = new Search_Algorithms();//search class call
        Operations main = new Operations();//Operations class call
        int option = 0;
        int option2 = 0;
                
        try{
            bw.write("Ingrese números separados por ','\n\n");
                bw.flush();
                    int[] a = main.readArrayFronConsole();
            
            bw.write("\n¿CUAL METODO DE ORDENAMIENTO QUIERE USAR?\n");
                bw.write("\n1.Insertion Sort\n2.Bubble Sort\nOpcion: ");
                    bw.flush();
            while (option!=2){//menu sorting algorithms
                    String op= br.readLine();
                        option = Integer.parseInt(op);

                    if(option==1){
                        bw.write("\n.:INSERTION SORT:.\n");
                        bw.flush();
                            a = sorts.insertionSort(a);
                                main.printArray(a);
                                    break;
                    } 
                    if(option==2){
                        bw.write("\n.:BUBBLE SORT:.\n");
                        bw.flush();
                            a = sorts.bubbleSort(a);
                                main.printArray(a);
                                    break;
                    }
                    if(option!=1&&option!=2){
                        bw.write("¡OPCIÓN NO VALIDA!");
                        bw.flush();
                    }  
            }
            bw.write("\n¿CUAL METODO DE BUSQUEDA QUIERE USAR?");
                bw.write("\n1.lineal Search\n2.Binary Search\n3.Binary Search Recursive\n4.Interpolation Search\n5.Interpolation Search Recursive\nOpcion: ");
                    bw.flush();
            
            while (option2!=5){//search algorithms menu          
                    String op2= br.readLine();
                            option2 = Integer.parseInt(op2);
                
                    if(option2==1){
                        bw.write("\n.:LINEAL SEARCH:.\n");  
                        bw.flush();
                            int x = main.Number_Search();                              
                                int index = search.linealSearch(a,x);
                                        main.printArray(a);
                                            bw.write("\nEl número "+x+" se encuentra el indice : "+index+"\n");
                                                break;
                    } 
                    if(option2==2){
                        bw.write("\n.:BINARY SEARCH:.\n");
                        bw.flush();
                            int x = main.Number_Search();
                                int index = search.binarySearch(a,x);
                                    main.printArray(a);
                                        bw.write("\nEl número "+x+" se encuentra el indice : "+index+"\n");
                                            break;
                    }
                    if(option2==3){
                        bw.write("\n.:BINARY SEARCH RECURSIVE:.\n");
                        bw.flush();
                            int x = main.Number_Search();                              
                                int index = search.binarySearch_recursive(a,x,0,a.length-1);
                                    main.printArray(a);
                                        bw.write("\nEl número "+x+" se encuentra el indice : "+index+"\n");
                                            break;
                    } 
                    if(option2==4){
                        bw.write("\n.:INTERPOLATION SEARCH:.\n");
                        bw.flush();
                            int x = main.Number_Search();                              
                                int index = search.linealSearch(a,x);
                                    main.printArray(a);
                                        bw.write("\nEl indice en el que se encuentra el número "+x+" es: "+index+"\n");
                                            break;
                    }
                    if(option2==5){
                        bw.write("\n.:INTERPOLATION SEARCH RECURSIVE:.\n");
                        bw.flush();
                            int x = main.Number_Search();                              
                                int index = search.interpolationSearch_recursive(a,x,0,a.length-1);
                                    main.printArray(a);
                                        bw.write("\nEl número "+x+" se encuentra el indice : "+index+"\n");
                                            break;
                    }
                    if(option2!=1&&option2!=2&&option2!=3&&option2!=4&&option2!=5){
                                bw.write("¡OPCIÓN NO VALIDA!");
                                bw.flush();
                            }  
            }
            
          bw.flush();
        }catch (IOException ex){}
        
    }
    
}
