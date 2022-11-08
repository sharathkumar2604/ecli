package com.xworkz.patternrepeat_i_numbers;

public class Pattern_row_i {

	public static void main(String[] args) {
int i,j,rows=10,number=1;

for(i=1;i<=rows;i++)
{
	for(j=1;j<=i;j++)
	{
		System.out.print(" "+number);
		number++;
		
	}
System.out.println(" ");
}

}
}
