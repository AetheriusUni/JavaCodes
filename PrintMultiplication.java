
public class PrintMultiplication 
{
	public static void main(String[] args)
	{
		int max = 12;	// however big you want your multiplication table, max by max
		// for each row you print that row's number * column number
		for(int i = 1; i <= max; i++)
		{
			for(int j = 1; j <= max; j++)
			{
				System.out.print(i*j + "	");
			}
			// after each row is finished, hit enter to start next row
			System.out.println();
		}
	}
}
