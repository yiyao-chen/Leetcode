/*

You are given an array of integers stones where stones[i] is the weight of the ith stone.

We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

If x == y, both stones are destroyed, and
If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
At the end of the game, there is at most one stone left.

Return the smallest possible weight of the left stone. If there are no stones left, return 0.
*/


class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });


        for (int n : stones) {
            q.offer(n);
        }

        for(int s : q) {
            System.out.println(s);
        }


        while(q.size() > 1) {
            int first = q.poll();
            int second = q.poll();

            if (first > second) {
                q.offer(first - second);
            }
        }

        if(q.isEmpty()) {
            return 0;
        }

        return q.peek();
    }
}
