package patterns;
class PattrenBox
{
	// 	public static void main(String[] args) 
	// 	{
	// 		int m=4;
	// 		int n=5;
	// 		for(int i=0;i<n;i++)
	// 		{
	// 			for(int j=0;j<m;j++)
	// 			{
	// 				 if(i == 0 || i == n-1 || j == 0 || j == m-1) 
	// 				 {
	//                    System.out.print("*"+" ");
	//                  } 
	//                  else 
	//                  {
	//                    System.out.print(" ");
	// 			      }

	// 		   }
	// 		   System.out.println();
	// 		}
	// 	}
	// } 
	public static void main(String args[]) {
		int n = 4;
		int m = 4;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(i == 0 || i == n-1 || j == 0 || j == m-1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}