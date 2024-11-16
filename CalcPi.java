// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int n = Integer.parseInt(args[0]);
		System.out.println("pi according to Java: " + Math.PI);
		double pi = 1.0;
		double x = 3.0; //the odd places
		double y = 5.0; //the even places
		for (int i=0; i<=n; i++)
		{
			if (i%2!=0)
			{
				pi = pi + (1.0/y);
				y+=4;
			}
			else
			{
				pi = pi - (1.0/x);
				x+=4;
			}
		}
		pi = pi*4;
		System.out.print("pi, approximated:     " + pi);
	}
}
