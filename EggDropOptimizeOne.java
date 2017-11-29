/*
 * A building has 100 floors. One of the floors is the highest floor an egg can be dropped from without breaking.
If an egg is dropped from above that floor, it will break. If it is dropped from that floor or below, it will be completely undamaged and you can drop the egg again.

Given two eggs, find the highest floor an egg can be dropped from without breaking, with as few drops as possible.
 */

import java.math.*;

@SuppressWarnings("unused")
public class EggDropOptimizeOne 
{
	public static void main(String[] args)
	{
		int maxfloors = 100;
		int[] floors = new int[maxfloors];
		// if floors = 0, that floor is safe, if floors = 1 that floor is not safe
		int deadegg = (int) (Math.random()*100);
		// this sets the floors which will break egg
		for(int i = deadegg; i < maxfloors; i++)
		{
			floors[i] = 1;
		}
		DropTest(floors);
	}
	static void DropTest(int[] floors)
	{
		int egg = 2;
		int dropcount = 0;
		int maxsafe = 0;
		int mintry = 0;
		// drop egg in intervals of 10 from floors 10 to 100 until an egg breaks
		for(int i = 10; i < floors.length; i=i+10)
		{
			if(floors[i]==1)
			{
				dropcount = dropcount + 1;
				// lost an egg
				egg = egg - 1;
				// assume maximum safe floor is the one below the one we broke
				maxsafe = i - 1;
				// start dropping egg from one above last known safe floor
				mintry = i - 9;
				System.out.println("Step 1 Done "+maxsafe+" "+mintry);
				break;
			}
			else
			{
				// you still dropped the egg
				dropcount = dropcount + 1;
			}
		}
		for(int i = mintry; i < maxsafe; i++)
		{
			if(floors[i]==1)
			{
				dropcount = dropcount + 1;
				egg = egg - 1;
				maxsafe = i - 1;
				System.out.println("This took " + dropcount + " drops to get the answer with " + egg + " egg(s) remaining.");
				System.out.println("The highest safe floor is " + maxsafe + ".");
				break;
			}
			else if(i==maxsafe-1)
			{
				dropcount = dropcount + 1;
				egg = egg - 1;
				System.out.println("This took " + dropcount + " drops to get the answer with " + egg + " egg(s) remaining.");
				System.out.println("The highest safe floor is " + maxsafe + ".");
			}
			else
			{
				dropcount = dropcount + 1;
			}
		}
	}
}
