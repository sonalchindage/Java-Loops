class MaxDegitNumber 
{
	public static void main(String[] args) 
	{
		int num = 1237459;
		int max=0;
		int min=9;
		
	  for(int i= num; i>0; i/=10)
		{
			int rem=num%10;
			if(max < rem)
			{
				max=rem;
			}
			else if(min>rem)
			{
				min=rem;
			}
		}
	  System.out.println("largest digit from="+num+":"+max);
	   System.out.println("Smallest digit from="+num+":"+min);
	}
}
