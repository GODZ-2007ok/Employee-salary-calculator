package TcsVita;
import java.util.*;
public class OrderIt {

	public static void main (String [] arg)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter n ");
		int n = sc.nextInt();
		sc.nextLine();
		String[]  ori= new String [n];
		String[] suf = new String [n];
		int m = suf.length;
		System.out.println("orginal");
		for (int i=0;i<ori.length;i++)
		{
			ori[i] = sc.nextLine().trim();
		}
	System.out.println("shuffled");
	
	for(int i =0; i<suf.length;i++)
	{
		suf[i] = sc.nextLine().trim();
	}
	
	
	int shift =0;
	boolean match = false;
	
	for (int s = 0; s < m; s++) {
        boolean same = true;
        for (int i =0;i<m;i++)
        {
        	if (!ori[i].equals(suf[i]))
        	{
        		same = false;
        		break;
        	}
        }
        if (same)
        {
        	match = true;
        	break;
        }
        String first = suf[0];
        for (int i = 0; i < m - 1; i++) {
            suf[i] = suf[i + 1];
        }
        suf[m - 1] = first;
        
        shift++;
	}
	 if (match)
         System.out.println("Arrays matched after " + shift + " left shifts.");
     else
         System.out.println("Arrays cannot be matched by shifting.");
	

}
}
