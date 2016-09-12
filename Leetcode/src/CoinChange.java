/*
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:
coins = [1, 2, 5], amount = 11
return 3 (11 = 5 + 5 + 1)

Example 2:
coins = [2], amount = 3
return -1.
 */
public class CoinChange {
	
	public int coinCount(int arr[], int amt){
		
		
		return -1;
	}
}
/* CAN BE A POSSIBLE SOLUTION
 *
 * public class MinPathValue {
        public int minPathValue (int [] [] grid) { . Jianshui Zhan Ju Han Bang, Bang ╀ Du Juan € Rougu Ban
                int N = grid.length; . carve consultations  Xidie slip @ 1point 3 acres
                int M = grid [0] .length;
                // DP Array, f [i] [J], min Weigh on path from 0,0 to i, J . From 1point 3acres BBS
                int [] [] f = new int [N] [M];
. Jianshui Hanbangzhanju, Juan € Hamamatsu ╀ Durouguban                // Initialization . carve consultations  Xidie slip @ 1point 3 acres
                int min1 = Integer.MAX_VALUE;
                int min2 = Integer.MAX_VALUE;
                for (int i = 0; i <N; i ++) {
                        f [i] [0] = Math.min (min1, grid [i] [0]);
                } . from: 1point3acres.com/bbs
                for (int i = 1; i <M; i ++) {
                        f [0] [i] = Math.min (min2, grid [0] [i]);
                } . Jianshui Hanbangzhanju, Juan € Hamamatsu ╀ Zhurouwapan
                // DP formula
                for (int i = 1; i <N; i ++) {
                        for (int J = 1; J <M; J ++) { . Waral Ti Ar  chain Qun stagnant water still water Dong Jin Ku,
                                f [i] [j] = Math.min (Math.min (f [i-1] [j], f [i] [j-1]), grid [i] [j]);
                        }
                }
                return f [N-1] [M-1];
        }
 */
