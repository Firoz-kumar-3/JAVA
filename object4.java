import java.util.Scanner;
public class object4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[4][];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			int col=sc.nextInt();
			arr[i]=new int[col];
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=sc.nextInt();
		}
		for(int a[]:arr)
		{
			for(int value:a)
				 System.out.println(value);
		  System.out.println();
		}
	}

}
