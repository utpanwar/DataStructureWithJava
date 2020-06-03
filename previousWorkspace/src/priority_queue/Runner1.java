package priority_queue;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Runner1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		while(k > 0) {
			int n = s.nextInt();
			ArrayList<Integer> current = new ArrayList<Integer>();
			for(int i = 0; i < n; i++) {
				current.add(s.nextInt());
			}
			input.add(current);
			k--;
		}
		ArrayList<Integer> output = Solution4.mergeKSortedArrays(input);
		for(int i : output) {
        System.out.print(i + " ");
		}
	}
}



class PairComparator implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2) {

        if(p1.value <= p2.value)
            return 1;
        else 
            return -1;
    }
}
class Pair {
    int value;
    int arrayNumber;
    
    Pair(int v, int n) {
        value = v;
        arrayNumber = n;
    }
}
 class Solution4 {
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
        PairComparator compare = new PairComparator();
        PriorityQueue<Pair> maxHeap = new PriorityQueue<Pair>(input.size(), compare);
        for(int i = 0; i < input.size(); i++) {
            int index = input.get(i).size() - 1;
            Pair current = new Pair(input.get(i).get(index), i);
            maxHeap.add(current);
            input.get(i).remove(index);
        }
        ArrayList<Integer> output = new ArrayList<Integer>();
        while(!maxHeap.isEmpty()) {
            Pair max = maxHeap.remove();
            output.add(max.value);
            int i = max.arrayNumber;
            if(input.get(i).size() > 0) {
                int index = input.get(i).size() - 1;
                int value = input.get(i).get(index);
                input.get(i).remove(index);
                Pair current = new Pair(value, i);
                maxHeap.add(current);
            }
        }
        Collections.reverse(output);
        return output;
    }
}
// 
// 4
// 3
// 1 5 9
// 2
// 45 90
// 5
// 2 6 78 100 234
// 1
// 0