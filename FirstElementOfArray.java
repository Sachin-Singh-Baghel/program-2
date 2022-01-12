import java.util.Scanner;

class FirstElementOfArray
{
	public static void main(String arg[])	
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of elements in an Array");
	    int n=sc.nextInt();
	    if(n==0)
	    {
		System.out.println("Array is Empty");
	        return;
	    }
	    int a[]=new int[n]; 
	    System.out.println("Enter "+n+" array elements ");  
	    for(int i=0;i<n;i++)
	    {
          
	      a[i]=sc.nextInt();
            }
  	    System.out.println("First elment of an array is "+a[0]);
	}
}
