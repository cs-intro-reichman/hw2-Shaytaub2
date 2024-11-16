// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) 
	{
		int seed = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
		int x;
		int count;
		int countB =1;// To track successful sequences
		if (seed>0 && mode == 'v'){System.out.println("1 4 2 1 (4)");};
		for (int i=1; i<seed; i++) // Loop over all seeds from 1 to the input seed value
		{
			x = i+1;
			count = 0; // Step counter
			String arr = "" + x;
			while (x>1)
			{
				count++;
				if (x%2==0)
				{
					x = x/2;
					arr = arr + " " + x;
				}
				else
				{
					x = x*3+1;
					arr = arr + " " + x;
				}
			}
			count++; // Account for reaching 1
			arr = arr + " (" + count + ")";
			if (x==1) 
			{
				countB++;
			}
			if (mode == 'v')
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
