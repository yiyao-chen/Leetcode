
/*
The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1 respectively. All students stand in a queue. Each student either prefers square or circular sandwiches.

The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack. At each step:

If the student at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave the queue.
Otherwise, they will leave it and go to the queue's end.
This continues until none of the queue students want to take the top sandwich and are thus unable to eat.

You are given two integer arrays students and sandwiches where sandwiches[i] is the type of the i​​​​​​th sandwich in the stack (i = 0 is the top of the stack) and students[j] is the preference of the j​​​​​​th student in the initial queue (j = 0 is the front of the queue). Return the number of students that are unable to eat.
*/


class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> stQ = new LinkedList<>();
        Queue<Integer> swQ = new LinkedList<>();

        for (int s : students) {
            stQ.add(s);
        }
        for (int s : sandwiches) {
            swQ.add(s);
        }

        int i=0;
        while(i<1000) {
            System.out.println("i: " + i);
            if(stQ.peek() == swQ.peek()) {
                System.out.println("== " );

                //remove student and sandwich
                stQ.poll();
                swQ.poll();
                for (int s : stQ) {
                    System.out.println("st ==" + s);

                }
            }
            else if(stQ.peek() != swQ.peek()) {
                System.out.println("!= ");

                // student goes to the back of the queue
                int n = stQ.poll();
                stQ.add(n);
                for (int s : stQ) {
                    System.out.println("st != " + s);

                }
            }
            i++;
        }

        return stQ.size();
    }
}
