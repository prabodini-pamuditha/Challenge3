import java.util.*;

public class Sorting{
	
	public static void main(String[] args){
		//initialize an array
		int[] array = new int[] {47,84,75,21,14,14,79};
		
		//assign length of an array to n
		int n = array.length;
		
		int mode = array[0];
		int maxCount = 0;
		
		//check the array is empty
		if(array.length <= 1){
			System.out.println(array);
		}else{
			
			//sorting the array
			for(int i = 0; i < array.length; i++){
				//use outer loop
				for(int j = i + 1; j < array.length; j++){
					//temp variable for compare
					int temp = 0;
					if(array[i] > array[j]){
						//compare outer loop object with inner loop
						temp = array[i]; //swap, if greater than
						array[i] = array[j];
						array[j] = temp;
					}
						
				}
			}
			//sorted array
			System.out.println("Sorted Array");
			
			//initialize highest value in 0 index of an array
			int max = array[0];
			
			for(int i = 0; i < array.length; i++){
				System.out.print(array[i] + " " );
							
				//find highest value				
				if(array[i] > max){
					max = array[i];
				}
				
			}
			
			System.out.println("Highest value is " + max);
			
			// find median
				if(n % 2 != 0){
					System.out.println("Median is : " + n / 2);
				}else{
					System.out.println("Median is : " + (n / 2 + (n / 2-1) /2.0));
				}
						
		}
		
	}
	
	
}
