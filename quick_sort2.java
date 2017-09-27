/***************************QUICK SORT FROM CORMEN**************************/

public class quick_sort2
{
 public void quicksort(int A[],int p,int r)
 {
  if(p<r)
  {
   int q=partition(A,p,r);
   quicksort(A,p,q-1);
   quicksort(A,q+1,r);   
  }
 }
 
 public int partition(int A[],int p,int r)
 {
  int x=A[r];
  int i=p-1;
  for(int j=p;j<=r-1;j++)
  {
   if(A[j]<=x)
   {
    i++;
	A[i]=A[i]^A[j]^(A[j]=A[i]);
   }
  }
  A[i+1]=A[i+1]^A[r]^(A[r]=A[i+1]);
  return i+1;
 
 }
public static void main(String[] args)
{
 quick_sort2 ob=new quick_sort2();
 int[] Ar={2,4,1,5,3,6,8,4,5};
 ob.quicksort(Ar,0,8);
 for(int i=0;i<Ar.length;i++)
 {
  System.out.print(Ar[i]+" ");
 }

}

}