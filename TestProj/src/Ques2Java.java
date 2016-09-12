/*
*Question 1:
Given the passage in textSample.txt, please remove all words that contain more than these letters RSTLN AEIOU and one other letter.
Then organize the words by length and find the most common word.

Note the letters RSTLN AEIOU and the additional letter maybe used
multiple times in a word.
For Example:
"unclean" uses "N" twice, "LNAEU" are part of "RSTLN AEIOU" and has only one other letter "C", therefore this an acceptable word.
"households" which contains "HD" has more than one letter outside of our acceptable set so it  must be removed.
Note the d and h, where "unclean" only uses a c with the assigned set of letters
*/

import java.io.*;
import java.util.*;


public class Ques2Java {
    
	public String[] sortarray(String[] arr){

		String temp = null;
		for(int i=0;i<arr.length-1;i++)
		{
			temp = new String();
			if(arr[i].length() > arr[i+1].length()){

				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		return arr;
	}
	public String sortarray(String[] arr, HashMap<String, Integer> hm){

		String max=arr[0];
		for(int i=1;i<arr.length;i++){

			if(hm.get(max)<hm.get(arr[i])){
				
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) throws IOException {
	    Scanner sc2 = null;
	    HashSet<Character> hs=new HashSet<Character>();
	    //RSTLN AEIOU
	    hs.add('R');
	    hs.add('S');
	    hs.add('T');
	    hs.add('L');
	    hs.add('N');
		hs.add('A');
		hs.add('E');
		hs.add('I');
		hs.add('O');
		hs.add('U');
		hs.add('r');
	    hs.add('s');
	    hs.add('t');
	    hs.add('l');
	    hs.add('n');
		hs.add('a');
		hs.add('e');
		hs.add('i');
		hs.add('o');
		hs.add('u');
	    try {
	        sc2 = new Scanner(new File("sample.txt"));
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();  
	    }
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
	    while (sc2.hasNext()) {
	     
	        String s=sc2.next();
			s = s.replaceAll("[\\;\\.\\,\\-\"',']", "");
			s+=" ";
	        int i=0;
		int f=0;
		boolean flag=false;
	        while (s.charAt(i)!=' ') {
	            
			if(!hs.contains(s.charAt(i))){
				
				if(flag){
				
					f=1;	
					break;
				}
				if(!flag)
					flag=true;
			}
			i++;
	        }
		if(f==0){

			if(hm.containsKey(s)){
		
				int count=hm.get(s);
				hm.remove(s);
				hm.put(s,count+1);
			}
			else{
		
				hm.put(s,1);
			}
		}
	    }
	    Set<String> word_set=hm.keySet();
	    Iterator<String> it=word_set.iterator();
	    String[] ar=new String[word_set.size()];
	    int j=0;
	    while(it.hasNext()){
	    	
	    	ar[j++]=it.next();
	    }
	    ar=new Ques2Java().sortarray(ar);
	    System.out.println("Words Organized in ascending order of there length:");
	    for(String s:ar)
	    System.out.println(s);
	    System.out.println("The most common word is: "+new Ques2Java().sortarray(ar,hm));
	    
	}   
}  