//package SampleCodes;

public class common {
	public static void main (String [] args)
	{
	int A []= new int [] {1,2,3,4,5,6,7,8};
	int B []= new int [] {6,7,8,9,10,11};
	int result []= new int [A.length+B.length];
	int i,j,k=0;
	
	for (i=0; i<A.length; i++)
	{
		for(j=0; j<B.length; j++)
		{
			if (A[i]==B[j])
			{
				result[k]=A[i];
				k++;
				
			}
			
		}
	}
	
	for(int pointer=0;pointer<result.length;pointer++)
	{
	System.out.print(result[pointer]);
	}
	
	}

}
