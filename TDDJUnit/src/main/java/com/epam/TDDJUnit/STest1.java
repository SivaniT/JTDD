package com.epam.TDDJUnit;

public class STest1 {

	public String swap(String s) {
		StringBuilder sb=new StringBuilder(s);
		if(s.charAt(0)=='A'&&s.charAt(1)=='A')
		{
			sb.delete(0,2);
		}
		if(s.charAt(0)=='A'&&s.charAt(1)!='A')
		{
			sb.delete(0,1);
		}
		if(s.charAt(0)!='A'&&s.charAt(1)=='A')
		{
			sb.delete(1,2);
		}
		return sb.toString();
	}
	

}
