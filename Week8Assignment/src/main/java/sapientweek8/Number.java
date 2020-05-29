package sapientweek8;

public class Number {
	int n;
	public int checkPrime(int num)
	{
		int i;
		for(i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
				return 0;
		}
		return 1;
	}
	
	 public boolean checkAmstrong(int x)
	 {
		 int i,j,k;
		 i=j=0;
		 j=x;
		 while(j>0)
		 {
			 k=j%10;
			 j=j/10;
			 i=i+k*k*k;
		 }
		 if(i==x)
			 return true;
		 return false;
	 }
	public boolean CheckPolindrom(int x)
	{
		try {
			if(x<0)
				throw new Exception("negative no.");
		} catch (Exception e) {
			// TODO: handle exception
		}
		int i=0,j=x;
		while(j>0)
		{
			i=i*10+j%10;
			j=j/10;
		}
		if(i==x)
			return true;
		return false;
	}
}
