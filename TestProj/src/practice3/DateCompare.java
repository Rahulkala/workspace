package practice3;

import java.util.*;
public class DateCompare {

	public boolean before(String a, String b){
		
		Date d1=new Date(a);
		return d1.before(new Date(b));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateCompare dc=new DateCompare();
		System.out.println(dc.before("1/2/2000", "1/1/2000"));
	}

}
