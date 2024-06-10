package Arraydemo;


public class singledimenarray {
	
	public static void main(String[]args)

	{
	//declare array 1 approach
		
		/*int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[4]=400;
		a[5]=500;
		*/
		
		//Approach2
		int a[]= {100,200,300,400,500};
		
		//2.find length of array
		
		System.out.println("Lenghth of array:"+ a.length);
	
		//3. Read Specific value of array---> If 100 array we can can print
		
		//System.out.println(a[4]);
		
		// 4. In 100 array print we will use for loop
		//normal for loop
	//	for(int i=0;i<=a.length;i++)
		//{
			//System.out.println(a[i]);
	//	}
		
	//	4. Enhance for loop
		for(int x:a)
		{
			System.out.println(x);
		}
		
	}
}
