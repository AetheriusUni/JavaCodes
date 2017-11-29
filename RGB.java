
public class RGB 
{
	public static void main(String[] args)
	{
		int r, g, b;
		r = 100;
		g = 30;
		b = 200;
		System.out.println((toHex(r) + toHex(g) + toHex(b)).toUpperCase());
	}
	public static String toHex ( int c ) {
        String s = Integer.toHexString ( c );
        return ( s.length() == 1 ) ? "0" + s : s;
    }
}
