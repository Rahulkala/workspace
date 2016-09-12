
package practice1;

import java.util.*;

// Comparable because we have priorityqueue which require compareTo method 
//inorder to store in some order for the minheap
class Point implements Comparable<Point>{
	
	public int x,y;
	double dist;
	public Point(int x,int y){
		
		this.x=x;
		this.y=y;
	}
	public void setDist(double d){
		
		this.dist=d;
	}
	public double getDist(){
		
		return this.dist;
	}
	@Override
	public int compareTo(Point p){
		
		return Double.valueOf(dist).compareTo(p.dist);
	}
}
public class KClosestPoint {

	public ArrayList<Point> getKPoints(ArrayList<Point> a, Point origin, int k){
		
		ArrayList<Point> list=a;
		PriorityQueue<Point> queue=new PriorityQueue<Point>();
	    for(Point p: list){
	    	
	    	p.setDist(Math.hypot(origin.x-p.x, origin.y-p.y));
	    	queue.add(p);
	    }
	    ArrayList<Point> newlist=new ArrayList<Point>();
	    int i=0;
	    while(i++<k){
	    	
	    	newlist.add(queue.poll());
	    }
	    return newlist;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=0;
		ArrayList<Point> points=new ArrayList<Point>();
		points.add(new Point(1,1));
		points.add(new Point(0, 3));
		points.add(new Point(-1, 1));
		points.add(new Point(-1, 3));
		points.add(new Point(1, -1));
		points.add(new Point(3, -1));
		points.add(new Point(-1, -1));
		points.add(new Point(-1, 3));
		points.add(new Point(2, 2));
		Point origin=new Point(0,0);
		points=new KClosestPoint().getKPoints(points, origin, 5);
		for(Point p:points){
			
			System.out.println("Point no "+k+++" ("+p.x+","+p.y+")");
		}
	}

}
