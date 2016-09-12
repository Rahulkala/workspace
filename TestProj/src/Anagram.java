import java.util.*;

public class Anagram {

	static Map<String, Queue<String>> map=new HashMap<String, Queue<String>>(); 
	public void makeMap(String s){
		
		int[] arr=new int[255];
		StringBuilder pattern=new StringBuilder();
		for(int i=0;i<255;i++)
			arr[i]=0;
		Queue<String> q=new PriorityQueue<String>();
		for(int i=0;i<s.length();i++){
			
			if(s.charAt(i)==' ')
				continue;
			arr[s.charAt(i)]++;
		}
		for(int i=0;i<255;i++){
			
			pattern.append(arr[i]);
		}
		//String pattern=new String(arr+"");
		if(map.containsKey(pattern.toString())){
			
			q=map.remove(pattern.toString());
		}
		q.add(s);
		map.put(pattern.toString(),q);
	}
	
	public List<String> find(List<String> l){
		
		//int j=0;
		for(int i=0;i<l.size();i++){
			
			makeMap(l.get(i));
		}
		ArrayList<String> list=new ArrayList<String>();
		for(String s:map.keySet()){
			
			StringBuilder sb=new StringBuilder();
			Queue<String> q=map.get(s);
			while(!q.isEmpty()){

				if(sb.length()!=0)
					sb.append(",");
				sb.append(q.poll());
			}	
			list.add(sb.toString());
		}
		//Collections.sort(list);
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		list.add("pear");
		list.add("amleth");
		list.add("dormitory");
		list.add("tinsel");
		list.add("dirty room");
		list.add("hamlet");
		list.add("listen");
		list.add("silent");
		list.add("reap");
		Anagram a=new Anagram();
		List<String> l=a.find(list);
		//System.out.println(l);
		for(int i=0;i<l.size();i++){
			
			System.out.println(l.get(i));
		}
	}

}
