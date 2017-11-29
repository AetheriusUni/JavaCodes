import java.util.*;

public class PairWithSum 
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,9};
		int[] arr2 = {1,2,4,4};
		int sum = 8;
		System.out.println(pairwithsum(arr, sum));
		System.out.println(pairwithsum(arr2, sum));
	}
	static boolean pairwithsum(int[] arr, int sum)
	{
		Set<Integer> comp = new HashSet<Integer>();
		for(Integer i : arr)
		{
			if(comp.contains(i))
			{
				return true;
			}
			comp.add(sum-i);
		}	
		return false;
	}
}
