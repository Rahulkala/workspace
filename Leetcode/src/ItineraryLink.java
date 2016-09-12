/*
 * 
 * Given a list of airline tickets represented by pairs of departure and arrival airports [from, to], reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK. Thus, the itinerary must begin with JFK.

Note:
If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string. For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
All airports are represented by three capital letters (IATA code).
You may assume all tickets may form at least one valid itinerary.
Example 1:
tickets = [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
Return ["JFK", "MUC", "LHR", "SFO", "SJC"].
Example 2:
tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
Return ["JFK","ATL","JFK","SFO","ATL","SFO"].
Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"]. But it is larger in lexical order.
 */

import java.util.*;

public class ItineraryLink {

	public List<String> findItinerary(String[][] tickets) {
       
        HashMap<String, PriorityQueue<String>> map=new HashMap<String, PriorityQueue<String>>();
        List<String> itinerary=new ArrayList<String>();
        for(int i=0;i<tickets.length;i++){
            
            if(map.containsKey(tickets[i][0])){
            	
            	map.get(tickets[i][0]).add(tickets[i][1]);
            }
            else{
            	PriorityQueue<String> queue=new PriorityQueue<String>();
            	queue.add(tickets[i][1]);
            	map.put(tickets[i][0], queue);
            }
        }
        String loc="JFK";
        itinerary.add(loc);
        while(map.size()!=0){
        	
        	PriorityQueue<String> queue=map.get(loc);
        	String temp=loc;
        	loc=queue.poll();
        	itinerary.add(loc);
        	if(queue.size()==0){
        		
        		map.remove(temp);
        	}
        }
        return itinerary;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItineraryLink plan=new ItineraryLink();
		String[][] route={{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
		List<String> output=plan.findItinerary(route);
		for(String s:output){
			
			System.out.print(" "+s);
		}
	}

}
