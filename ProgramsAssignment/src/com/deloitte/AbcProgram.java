package com.deloitte;

public class AbcProgram {

	public static void main(String[] args) {
for(int i=1;i<40;i++)
{
	if(i%5==0 && i%3==0)
	{
		System.out.print(" abcxyz ");
	}
	else if(i%5==0 )
	{
		System.out.print(" abc ");
	}
	else if( i%3==0)
	{
		System.out.print(" xyz ");
	}
	else
	{
		System.out.print(" "+ i);
	}
}
	}

}