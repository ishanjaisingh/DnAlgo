/*************************MERGE SORT******************************/
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class merge_sort1
{
 Scanner sc=new Scanner(System.in);
 long starttime;
 long endtime;
 int[] Ar;
 long totaltime;
 int T;
 public merge_sort1() throws IOException,FileNotFoundException
 {   //FileReader fr=new FileReader("C:\\Users\\HP\\Desktop\\searching_data\\dataset_for_searching1.txt");
	 //BufferedReader buff=new BufferedReader(fr);
	 T=sc.nextInt();
	 Ar=new int[T];
	 for(int i=0;i<T;i++)
	 {
		 //Ar[i]=Integer.parseInt(buff.readLine());
		 Ar[i]=sc.nextInt();
	 }
	 starttime = System.currentTimeMillis();
	 mergesort(Ar);
	 
	 
 }
 
 public void mergesort(int[] A)throws IOException,FileNotFoundException
 {
	 
	 int n=A.length;
	 if(n<2)
		 return;
	 
	 int mid=n/2;
	 int[] L=new int[mid];
	 int[] R=new int[n-mid];
	 for(int i=0;i<=mid-1;i++)
	 {
		 L[i]=A[i];
		 
	 }
	 for(int i=mid,j=0;i<n;i++,j++)
	 {
		 R[j]=A[i];
		 
	 }
	 mergesort(L);
	 mergesort(R);
	 merge(L,R,A);
	 
	 
 }
 
  public void merge(int[] ar1,int[] ar2,int[] A)throws IOException,FileNotFoundException
  {
    //A=new int[ar1.length+ar2.length];
   int i=0;
   int j=0;
   int k=0;
  
  while(i<ar1.length&&j<ar2.length&&k<A.length)
	{
		
		
	 if(ar1[i]<=ar2[j])
	 {
	  A[k]=ar1[i];
	  i++;
	  k++;
	 }
	 else if(ar1[i]>ar2[j])
	 {
	  A[k]=ar2[j];
	  j++;
	  k++;
	 }
     
	 if(i==ar1.length)
	 {
		 for(;k<A.length;k++){
		 A[k]=ar2[j];
		 j++;}
		 break;
		 
	 }
	 else if(j==ar2.length)
	 {
		 for(;k<A.length;k++){
		 A[k]=ar1[i];
		 i++;
		 }
		 break;
	 }
   
   }
   
   if(A.length==T)
   {
       endtime = System.currentTimeMillis();
	  
	   for(int l=0;l<A.length;l++)
	   {
		   System.out.print(A[l]+" ");
	   }
	   totaltime=endtime-starttime;
	   System.out.print("\nTIME TAKEN: "+totaltime+" ms");
   }
   
  }
  
  public static void main(String[] args)throws IOException,FileNotFoundException
  {
	  merge_sort1 ob=new merge_sort1();
	  
  }
}