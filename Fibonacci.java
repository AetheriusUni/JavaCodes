
public class Fibonacci 
{
	public static void main(String[] args)
	{
		System.out.println(fibonacci(5));
	}
	public static int fibonacci(int n)
	{
		// if n <= 1 return n since first two fibonacci are 0 and 1
		// else return fibonacci at number n
		return n <= 1 ? n : fibonacci(n-1) + fibonacci(n-2);
	}
}

/* Ex
fibonacci of 5

fibonacci(4) + fibonacci(3)
for fibonacci(4)
fibonacci(4) = fibonacci(3) + fibonacci(2)
fibonacci(3) = fibonacci(2) + fibonacci(1)
fibonacci(2) = fibonacci(1) + fibonacci(0) = 1

THEN YOU GO UP

fibonacci(3) = 1 + 1 = 2 which is returned to fibonacci(4)
fibonacci(4) = 2 + 1 = 3

*/