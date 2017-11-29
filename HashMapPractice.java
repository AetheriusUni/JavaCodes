import java.util.*;
import java.util.Map.Entry;

public class HashMapPractice 
{
	public static void main(String[] args)
	{
		String input = "Hello there friend";
		String target = "I am within the gates";
		// characters of input stored in map
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map = computemap(input);
		Set<Entry<Character, Integer>> keySet = map.entrySet();
		for(Entry<Character, Integer> c : keySet)
		{
			System.out.println(c.getKey()+ " : " + c.getValue());
		}
		
		if(charcheck(map,target))
		{
			System.out.println("YAY!");
		}
		else
		{
			System.out.println("This is also good!");
		}
	}

	
	public static Map<Character,Integer> computemap (String input)
	{
		// initialize HashMap which stores character, number of that character
		Map<Character,Integer> myMap = new HashMap<Character,Integer>();
		String inputedit = input.replaceAll("\\s+", "");
		char[] inputchar = inputedit.toCharArray();
		for(Character c : inputchar)
		{
			// if the map doesn't already have this character, add it to the map
			if(!myMap.containsKey(c))
			{
				myMap.put(c, 1);
			}
			// if the map already has the character, increase the number of that character by 1
			else
			{
				myMap.put(c, myMap.get(c)+1);
			}
		}
		return myMap;
	}
	
	static boolean charcheck(Map<Character,Integer> map,String target)
	{
		String targetedit = target.replaceAll("\\s+", "");
		char[] targetchar = targetedit.toCharArray();
		for(Character c : targetchar)
		{
			// if the map has one of the characters required to make the target
			if(map.containsKey(c))
			{
				// reduce the amount of that character you have by 1
				map.put(c, map.get(c)-1);
				// if you don't have enough of that character
				if(map.get(c)<=-1)
				{
					// it is impossible for the target to be reproduced
					return false;
				}
			}
			// if the map doesn't have one of the characters required
			else
			{
				// it is impossible for the target to be reproduced
				return false;
			}
		}
		// if we went through all the characters and were not short on characters, we must have enough characters
		return true;
	}
}
