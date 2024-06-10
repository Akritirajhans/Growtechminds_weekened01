package Arraydemo;

public class twodimensionalarrademo {

	public static void main(String[] args) {
	                                                      
		//Declare 2D array Approach1
		//int a[][]=new int[3][2];
		//a[0][0]=100;
		//a[0][1]=200;
		
		//Approach 2 to declare 2D array
		int a[][]	= {{100,200},{300,400},	{500,600}};
		
		//find size of an array

		System.out.println("length of rows"+a.length);
		System.out.println("length of column"+a[0].length);
		
		//reach specific value
	//	System.out.println(a[2][1]);
		
		//Read all rows and column
		//normal loop
		for(int i=0; i<a.length;i++)
		{
			for(int y=0; y<a[0].length;y++)	
			{
				System.out.println(a[i][y]);
			}
		}
		
		
		
		
		
	}

}
