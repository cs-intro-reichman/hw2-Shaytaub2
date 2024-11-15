// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int n = Integer.parseInt(args[0]);
		System.out.println("according to Java: " + Math.PI);
		double pi = 1;
		double x = 3;
		double y = 5;
		if (n%2==0)
		{
			for (int i=0; i<=n; i++)
			{
				pi = pi - (1/x);
				x +=4;
			}
			for(int j=0; j<n; j++)
			{
				pi = pi + (1/y);
				y +=4;
			}
		}
		else
		{
			for (int i=0; i<n; i++)
			{
				pi = pi - (1/x);
				x +=4;
			}
			for(int j=0; j<=n; j++)
			{
				pi = pi + (1/y);
				y +=4;
			}
		}
		pi = pi*4;
		System.out.println("approximated: " + pi);
	}
}
