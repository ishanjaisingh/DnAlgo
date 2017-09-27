/**********APPLYING BINARY SEARCH ON THE CREATED DATASETS************/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class binarysearch2
{
int[] a;
int T;
Scanner scan=new Scanner(System.in);
FileReader fr=new FileReader("C:\\Users\\HP\\Desktop\\searching_data\\dataset_for_searching1.txt");
BufferedReader sc=new BufferedReader(fr);
 binarysearch2()throws IOException,FileNotFoundException
 {
  T=1000000;
  a=new int[T];
  
  for(int i=0;i<T;i++)
  {
   a[i]=Integer.parseInt(sc.readLine());
  }
  
  System.out.println("Enter the element you wanna search");
  int num=scan.nextInt();
  calc(num);
  
 }
 
 public void calc(int num)throws IOException,FileNotFoundException
 {
 
  int low=0;
  int high=a.length-1;
  int res=-1;
  int count=0;
  while(low<=high)
  {
	  count++;
   int mid=(low+high)/2;
   if(num>a[mid])
   {
    low=mid+1;
   }
   else if(num<a[mid])
   {
    high=mid-1;
   }
   else if(num==a[mid])
   {
    res=mid;
	low++;
	
   }
   
  }
  
  if(res==-1)
  System.out.println("Element not found");
  else
  System.out.println("Number of comparisons: "+count+"\nElement found at position: "+(res+1));
 
 }
 
 public static void main(String[] args)throws IOException,FileNotFoundException
 {
  binarysearch2 ob=new binarysearch2();
 }

}