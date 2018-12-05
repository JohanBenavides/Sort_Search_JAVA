/*
 *In this search class you will find all the search algorithms
 */
package Sort_Search_Algorithms;
/**
 *
 * @author Johan Benavides Arias
 */
public class Search_Algorithms {
    
    public int linealSearch(int[] arrayData, int value)
    {
	int index = -1;
		
            for(int i = 0; i < arrayData.length; i++)//compare with all the elements of the array
                if(arrayData[i] == value)
                {
                    index = i;
                    break;
                }
		
	return index;                
    }
    public int binarySearch(int[] arrayData, int value)
	{
		int lowerBound = 0;
                int upperBound= (arrayData.length)-1;
                int index = -1;
                
                while (lowerBound<upperBound){//if upper bound is less than lower bound, there is not a feasible solution
                    
                    int middlePoint = ((lowerBound + upperBound) / 2);                    
                    
                    if (value == arrayData[middlePoint]){//value has been found
                        index = middlePoint;
                    }else if (value<arrayData[middlePoint]){
                            upperBound = middlePoint-1;                        
                          }else lowerBound = middlePoint+1;
                    
                }
                    if (lowerBound == upperBound && arrayData[lowerBound] == value){
                        index = lowerBound;//value has been found                                 
                    }
                return index;//value has been found     
	}
    public int binarySearch_recursive(int[] arrayData, int value, int lowerBound, int upperBound)
	{
		int middlePoint = (lowerBound + upperBound) / 2;//if upper bound is equal than lower bound, there is justone feasible solution
		
		if(lowerBound == upperBound){
			if(value == arrayData[middlePoint]){//element value has been found
				return middlePoint;
                        }else return -1;
                }else if(value == arrayData[middlePoint]){
				return middlePoint;
                      }
                        else if(value < arrayData[middlePoint]){
					return binarySearch_recursive(arrayData, value, lowerBound, middlePoint);
                              }
                               else return binarySearch_recursive(arrayData, value, middlePoint + 1, upperBound);                                
	}
    public int interpolationSearch(int[] arrayData, int value)
	{
		int lowerBound = 0;
		int upperBound = arrayData.length - 1;
		int index = -1, middlePoint;
		
		while(lowerBound < upperBound){//if upper bound is less than lower bound, there is not a feasible solution			
                        middlePoint = (lowerBound + ((upperBound - lowerBound)/(arrayData[upperBound] - arrayData[lowerBound]))*(value - arrayData[lowerBound]));			
			if(middlePoint < lowerBound || middlePoint > upperBound){
				break;                        }	
			if(value == arrayData[middlePoint]){//value has been found
				index = middlePoint;
				break;
			}
			else{
				if(value < arrayData[middlePoint]){
					upperBound = middlePoint - 1;
                                }
                                else{
                                     lowerBound = middlePoint + 1;
                                    }
			}
		}		
		if(lowerBound == upperBound && arrayData[lowerBound] == value){
			index = lowerBound;//value has been found
                }
		return index;
	}
    public int interpolationSearch_recursive(int[] arrayData, int value, int lowerBound, int upperBound)
	{
		int middlePoint;
		
		while(lowerBound < upperBound){//if upper bound is less than lower bound, there is not a feasible solution			
                        middlePoint = (lowerBound + ((upperBound - lowerBound)/(arrayData[upperBound] - arrayData[lowerBound]))*(value - arrayData[lowerBound]));			
			
                    if(value == arrayData[middlePoint]){//value has been found
                            return middlePoint;			
                    
                    }else
                        if (value < arrayData[middlePoint]){
                            return interpolationSearch_recursive(arrayData, value, lowerBound, middlePoint);
                        }else
                            return interpolationSearch_recursive(arrayData, value, middlePoint + 1, upperBound);
		
                }
        return -1;
    }
}
    
