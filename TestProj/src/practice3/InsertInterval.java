/*
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example 1:
Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

Example 2:
Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 * 
 */
package practice3;

import java.util.*;
class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }
public class InsertInterval {

	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        
		int pos=0;
		List<Interval> l=new ArrayList<Interval>();
		for(int i=0;i<intervals.size();i++){
			
			if(newInterval.end<intervals.get(i).start){
				
				l.add(intervals.get(i));
			}
			else if(newInterval.start>intervals.get(i).end){
				
				l.add(intervals.get(i));
				pos++;
			}
			else{
				
				newInterval.start=(intervals.get(i).start<newInterval.start)?intervals.get(i).start:newInterval.start;
				newInterval.end=(intervals.get(i).end>newInterval.end)?intervals.get(i).end:newInterval.end;
			}
		}
		l.add(pos,newInterval);
		return l;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertInterval ii=new InsertInterval();
		Interval i1=new Interval(1,5);
		Interval i2=new Interval(6,9);
		List<Interval> intervals=new ArrayList<Interval>();
		intervals.add(i1);
		intervals.add(i2);
		Interval newInterval=new Interval(0,7);
		List<Interval> l=ii.insert(intervals, newInterval);
		int i=0;
		while(!l.isEmpty()){
			
			Interval ip=l.remove(0);
			System.out.println("["+ip.start+","+ip.end+"]");
		}
	}

}
