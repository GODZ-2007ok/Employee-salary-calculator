package DSA;
import java.util.Scanner;
 class mergeSorting<T extends Comparable <T>> {

	 T[] arr;
	 Object[] temp;//important
	 
	 public mergeSorting(T []arr)
	 {
		 this.arr = arr;
		 this.temp=new Object[arr.length];
	 }
	 
	 //divide
	 public void mergesort(int low,int high)
	 {
		 if(low <high)
		 {
			 int mid = (low+high)/2;
			 mergesort(low,mid);
			 mergesort(mid+1,high);
			 merge(low,mid,high);
		 }
	 }
	 public void merge(int low,int mid,int high)
	 {
		 int i = low;
		 int j = mid+1;
		 int k = low;
		 while(i<=mid && j<=high) {
		      if(arr[i].compareTo(arr[j])<=0) {
		        temp[k]=arr[i];
		        k++;
		        i++;
		      }
		      else {
		        temp[k]=arr[j];
		        k++;
		        j++;
	 }
	 
}
	 
 
 
 //Copying the left out elements from the left sublist
 while(i<=mid) {
   temp[k++]=arr[i++];
 }
 //Copying the left out elements from the right sublist
 while(j<=high) {
   temp[k++]=arr[j++];
 }
 //Moving elements from temp array to original array
 for(int p=low;p<=high;p++) {
   arr[p]=(T)temp[p];
 }
}
public void  display()
{
 System.out.println("Sorted array:");
 for(int i=0;i<arr.length;i++)
   System.out.println(arr[i]+" ");
}
}

 
 public class mergeSortClassgeneric {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int ch;
  
     System.out.println("1 for integer array");
     System.out.println("2 for Double Array");
     System.out.print("Enter choice");
     ch=sc.nextInt();
     switch (ch) {
       case 1:
      System.out.print("Enter no. of elements");
      int n1 = sc.nextInt();
      Integer[] arr1=new Integer[n1];
      System.out.println("Enter Integer elements:");
      for (int i = 0; i < n1; i++){
      arr1[i]=sc.nextInt();
      }
      mergeSorting<Integer> m1= new mergeSorting<>(arr1);
      m1.mergesort(0, n1 - 1);
      m1.display();
      break;
      case 2:
       System.out.print("Enter number of elements: ");
       int n2 = sc.nextInt();
       Double[] arr2 = new Double[n2];
       System.out.println("Enter no.of elements");
       for (int i=0;i<n2;i++) {
       arr2[i] = sc.nextDouble();
       }
       mergeSorting   <Double> m2= new mergeSorting<>(arr2);
       m2.mergesort(0, n2 - 1);
       m2.display();
       break;
       
 }
 }
}

