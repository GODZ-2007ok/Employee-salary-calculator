package DSA;

 class linearSearchdemo {

	 public static <T> int search(T []arr , T key) 
	 {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(key))
					return i;
		}
		return -1;
	}
	 
}
 
 public class linearSearch1
 {
	 public static void main (String [] arg)
	 {
		 Integer [] arr = {10,20,30,40};
		 int result = linearSearchdemo.search(arr, 10);
		 if(result!=-1)
		 {
			 System.out.println("found at index "+ result );
		 }
		 else
		 {
			 System.out.println("not found");
		 }
	 }
 }
