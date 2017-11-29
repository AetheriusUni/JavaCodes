/*
 * A building has 100 floors. One of the floors is the highest floor an egg can be dropped from without breaking.
If an egg is dropped from above that floor, it will break. If it is dropped from that floor or below, it will be completely undamaged and you can drop the egg again.

Given two eggs, find the highest floor an egg can be dropped from without breaking, with as few drops as possible.
 */

import java.math.*;

public class EggDrop 
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
		int mintry = 0;
		int maxsafe = 0;
		int dropcount = 0;
		// we drop one egg from the middle of the floors
		// if the egg breaks we assume the highest safe floor is one below the place the egg broke
		if(floors[floors.length/2]==1)
		{
			maxsafe = floors.length/2 - 1;
			egg = egg - 1;
			dropcount = dropcount + 1;
		}
		// if the egg doesn't break we start checking floors from the one higher than this one
		else
		{
			mintry = floors.length/2 + 1;
			maxsafe = floors.length;
			dropcount = dropcount + 1;
		}
		// now with our reduced bounds we go from lowest to highest height until the second egg breaks
		for(int i = mintry; i < maxsafe; i++)
		{
			if(floors[i]==1)
			{
				egg = egg - 1;
				dropcount = dropcount + 1;
				maxsafe = i - 1;
				System.out.println("This took " + dropcount + " drops to get the answer with " + egg + " egg(s) remaining.");
				System.out.println("The highest safe floor is " + maxsafe + ".");
			}
			dropcount = dropcount + 1;
		}
	}

}
