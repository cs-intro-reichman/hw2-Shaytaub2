// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int n = Integer.parseInt(args[0]);
		System.out.println("pi according to Java: " + Math.PI);
		double pi = 0.0;
		double x = 1.0;
		for (int i=0; i<n; i++)
		{
			if (i%2==0)
			{
				pi +=(1.0/x);
			}
			else
			{
				pi -=(1.0/x);
			}
			x+=2;
		}
		pi *=4;
		System.out.print("pi, approximated:     " + pi);
	}
}
