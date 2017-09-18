/******THIS IS A PROGRAM TO FIND THE BINARY REPRESENTATION OF AN INTEGER NUMBER*****************************/
/*******FIRST LINE OF INPUT-THE NUMBER****************/
/*******SECOND LINE OF INPUT-THE NUMBER OF BITS*******/
/*******OUTPUT REPRESENTS THE BINARY REPRESENTATION OF THE ENTERED NUMBER**************/


import java.util.Scanner;
import java.lang.Math;



public class int_binary{
	
/* **** I AM CREATING A STATIC OBJECT OF SCANNER CLASS BECAUSE I HAVE CREATED I HAVE DEFINED MY FUNCTIONS AS STATIC*******************************/	
static Scanner sc=new Scanner(System.in);

public static void getdata()
  {
	System.out.println("Enter the number and the number of bits");
	int n=sc.nextInt();
	int m=sc.nextInt();
	intToBinary(n,m);//CALLING THE METHOD TO FIND THE BINARY EQUIVALENT

  }

public static void intToBinary (int n, int numOfBits)
{
	String binary = "";
	String[] abc=new String[5];
	if(numOfBits<Math.ceil(Math.log(n+1)/Math.log(2)))
	{
	  System.out.println("Enter a valid number of bits value");
	  getdata();

	}
	else
	{
	  int[] arr=new int[numOfBits];
      for(int i = 0; i < numOfBits; ++i, n/=2)
      {
        arr[numOfBits-i-1]=n%2;
    
      }
      for(int i=0;i<arr.length;i++)
	  {
        binary=binary.concat(Integer.toString(arr[i]));
	  }
    
    System.out.println(binary);
	String binary1=new String(binary);
	char[] arr1=binary.toCharArray();
	char a='0',b='1';
	double count2=0,count1=0;
	double len=arr1.length;
	for(int i=0;i<len;i++)
	{
		if(a==arr1[i])
			count1++;
		if(b==arr1[i])
			count2++;
		
			
   }
   if(count1==len/2||count2==len/2){
			System.out.println(count1+ "  "+count2+"  ");
	
			
		}
}
}


public static void main(String[] args)
   {
     getdata();
   }
}
