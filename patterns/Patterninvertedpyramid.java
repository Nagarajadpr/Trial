package patterns;

class Patterninvertedpyramid
{
	public static void main(String[] args) 
	{
		int i,j,n=5;
        
		for(i=n;i>=0;i--)
		{
			for(j=n-i;j>=1;j--)
			{
				System.out.print(" ");

			}
			for(j=i;j>=1;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
}