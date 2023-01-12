package lesson.demo;

public class AscendingOrder {

	public static void main(String[] args) {
		

		int [] arr = new int [] { 99, 100, 99, 100 ,1 ,45, 1 ,99};     
        int temp = 0;    
               
        System.out.println("Given Numbers: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
              
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
               
        System.out.println("Ascending order Output: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    