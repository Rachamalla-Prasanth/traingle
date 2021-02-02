public class Triangle 
{
	public static  void draw(int n)
	{
		if(n>=3&&n<=99)
		{
			for(int i=0;i<n-1;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("");
				}
				for(int j=0;j<=n-1-i;j++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
		}
	System.out.println("*");
	}
	public static void main(String[] args) 
	{
		draw(7);
	}
}
