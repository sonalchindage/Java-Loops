class FrequencyOfNumber 
{
	public static void main(String[] args) 
	{
		long num=12346678345l;
		System.out.println(num);
		for(int i=0; i<=9; i++)
		{
			int cnt=0;
			for(long j = num; j>0;j/=10)
			{
				long rem = j%10;
				if(rem==i) 
				{
					cnt++;
				}
			}
			if(cnt!=0)
			System.out.println(i+"  :"+cnt);
		}
	}
}
