//package SampleCodes;

public class uncommon {
	public static void main (String [] args)
	{
		int[] A = new int[]{ 1,2,3,4,5, 6, 7 ,8 ,9,10}; 
		int[] B = new int[]{ 4,5,6,7,8}; 
		int[] result=new int[A.length+B.length];
		int i = 0,j=0,k=0;
		
		while(true)
		{
			if(i < A.length && j < B.length) {
				if(A[i]<B[j])
				{
					result[k]=A[i];
					k++;
					i++;
					
				}
				else if(A[i]==B[j])
				{
					j++;
					i++;
				}
				else
				{
					result[k]=B[j];
					k++;
					j++;
				}
			}
			else if(j < B.length) {
				result[k] = B[j];
				j++;
				k++;
			}
			else if(i < A.length) {
				result[k] = A[i];
				i++;
				k++;
			}
			else {
				break;
			}
				
			
		}
		for(int pointer=0;pointer<result.length;pointer++)
		{
		System.out.print(result[pointer]);
		}
		
	}

}
