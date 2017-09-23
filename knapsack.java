/**************************knapsack problem****************************/
import java.util.Scanner;
public class knapsack
{
 Scanner sc=new Scanner(System.in);
 int T;int W;int[] w;int[] v;double[] ar;String[] item;
 public knapsack()
 {
  
 System.out.println("enter the number of items");
 T=sc.nextInt();
 item=new String[T];
 for(int i=65,j=0;j<T;i++,j++)
 {
  item[j]=Character.toString((char)i);
 }
 System.out.println("enter the knapsack capacity");
 W=sc.nextInt();
 w=new int[T];
 System.out.println("enter the weight of the items:");
 for(int i=0;i<T;i++)
 {
  w[i]=sc.nextInt();
 }
 v=new int[T];
 System.out.println("enter the value of each item");
 for(int i=0;i<T;i++)
 {
  v[i]=sc.nextInt();
 }
 ar=new double[T];
 for(int i=0;i<T;i++)
 {
  ar[i]=(double)v[i]/w[i];
 }
 
 quicksort(ar,0,T-1);
 
 calc(ar,w,v,W,item);

 }

 public void calc(double ar1[],int wi[],int vi[],int WC,String[] item1)
 {
  double x[]=new double[T];
  for(int j=0;j<T;j++)
  {
   x[j]=0;
  }
  int weight=0;
  int i=0;
  for(;i<T;i++)
  {
   if((wi[i]+weight)<=WC)
    {
      weight+=wi[i];
      x[i]=1;
      
    }
   else
    {
      x[i]=(double)(WC-weight)/wi[i];
      weight=WC;
      break;
    }
  }
  double value=0;
   for(int j=0;j<T;j++)
   {

     value+=x[j]*vi[j];

   }
  for(int j=0;j<T;j++)
  {
    System.out.println("ITEM "+item1[j]+" : "+(x[j]*wi[j]));
  }
  System.out.println("TOTAL WEIGHT : "+weight);
  System.out.println("TOTAL VALUE : "+value);
 }
 public void quicksort(double A[],int p,int r)
 {
   if(p<r)
    {
      int q=partition(A,p,r);
      
      quicksort(A,p,q-1);
      quicksort(A,q+1,r);
    }
 }

 public int partition(double A[],int p,int r)
 {
  double x=A[r];
  int i=p-1;
  for(int j=p;j<=r-1;j++)
  {
   if(A[j]>=x)
    {
      i++;
      double temp=A[i];
      A[i]=A[j];
      A[j]=temp;String temp1=item[i];
      item[i]=item[j];
      item[j]=temp1;
      w[i]=w[i]^w[j]^(w[j]=w[i]);
      v[i]=v[i]^v[j]^(v[j]=v[i]);
    }
  }
  double temp=A[i+1];
      A[i+1]=A[r];
      A[r]=temp;String temp1=item[i+1];
      item[i+1]=item[r];
      item[r]=temp1;
      w[i+1]=w[i+1]^w[r]^(w[r]=w[i+1]);
      v[i+1]=v[i+1]^v[r]^(v[r]=v[i+1]);

  return i+1;
 }


public static void main(String[] args)
{
 //Scanner sc=new Scanner(System.in);
 knapsack ob=new knapsack();
 }
}







