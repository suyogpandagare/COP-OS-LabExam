

	public class Main {

	  public static void main(String[] args) {
	    
		  int arr[] = {20,30,40,50,60};
		  
		  int min = arr[0];
		  int max = arr[0];

		  System.out.print("The array is: ");
		  for(int i=0; i<arr.length; i++)
		  {
			  if(min > arr[i])
			  {
				  min = arr[i];
			  }
			  if(max < arr[i])
			  {
				  max = arr[i];
			  }
			  System.out.print( arr[i] + ", ");  
		  }
		 
		  System.out.println("\n Maximum no.= "+ max+ ", "+ "Minimum no.= "+ min);
		  
		  int diff = max - min;
		  
		  System.out.println("Difference between Largest and Smallest is = "+diff);
	}

}
