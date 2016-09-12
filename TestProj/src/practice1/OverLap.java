package practice1;

//import java.util.*;
//overlap rectangle

public class OverLap {
	// rectangle A, B
	// time O(1), space O(1)
	public static boolean check(Node topLeftA, Node topLeftB, Node bottomRightA, Node bottomRightB) {
		// if one rectangle is above other
		if(topLeftA.y<bottomRightB.y || topLeftB.y<bottomRightA.y)
			return false;
		// if one rectangle is on left side of other
		if(topLeftA.x>bottomRightB.x || topLeftB.x>bottomRightA.x)
			return false;
		return true;
	}
	public static class Node {

		double x;
		double y;
		public Node(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String arg[]){
		
		System.out.println(OverLap.check(new Node(1,4), new Node(3,4), new Node(2,2), new Node(4,2)));
	}
}
// return !(Bx <= Cx || Ay <= Dy || Ax >= Dx || By >= Cy);
