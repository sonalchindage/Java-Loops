class RandomOTPGeneration 
{
	public static void main(String[] args) 
	{
		String opt="";
		for(int cnt=1; cnt<=10;)
		{
			opt+=(int)(Math.random()*1000000);
			if(opt.length()==6)
			{
				System.out.println(cnt+": "+opt);
				cnt++;
			}
			opt="";
		}
	}
}
