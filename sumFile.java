import java.io.BufferedReader;
import java.io.FileReader;

// this program reads the first integer in each line of a text file, but each line can only contain an integer with no spaces
public class sumFile 
{
	public static void main(String[] args)
	{
	    String filename = "C:\\Users\\AetheriusUni\\Desktop\\Test.txt";
	    int sum = 0;
	    sum = sumFile(filename);
	    System.out.println(sum);
	}
	public static int sumFile ( String name ) {
		int total = 0;
        try {
        	//int total = 0;
            BufferedReader in = new BufferedReader ( new FileReader ( name ));
            for ( String s = in.readLine(); s != null; s = in.readLine() ) {
                total += Integer.parseInt ( s );
            }
            //System.out.println ( total );
            in.close();
            //return total;
        }
        catch ( Exception xc ) {
            xc.printStackTrace();
        }
		return total;
    }
}
