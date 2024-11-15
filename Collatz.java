// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) 
	{
		int seed = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
		int x;
		int count;
		int countB =0;
		for (int i=0; i<seed; i++)
		{
			x = i+1;
			count = 1;
			String arr = "" + x;
			while (x>1)
			{
				if (x%2==0)
				{
					x = x/2;
					arr = arr + " " + x;
					count = count + 1;
				}
				else
				{
					x = x*3+1;
					arr = arr + " " + x;
					count = count + 1;
				}
			}
			arr = arr + " (" + count + ")";
			if (x==1) {countB++;}
			if (mode =='v')
			{
				System.out.println(arr);
			}
		}
		if (countB == seed)
			{
				System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
			}
	}
}
