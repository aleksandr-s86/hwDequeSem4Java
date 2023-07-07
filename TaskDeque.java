
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class TaskDeque {
    
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(-1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        TaskDeque task = new TaskDeque();
        //Deque<Integer> summa = task.sum(d1, d2);
        Deque<Integer> comp = task.composition(d1, d2);
        //System.out.println(summa);
        System.out.println(comp);
    }


      public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> summa = new ArrayDeque<>();
        int carry = 0;
         while (!d1.isEmpty() || !d2.isEmpty()) { 
            int sum = carry;
            if (!d1.isEmpty()) {
                sum += d1.removeFirst();
            }
            if (!d2.isEmpty()) {
                sum += d2.removeFirst();
            }
            summa.addLast(sum % 10);
            carry = sum / 10; 
        }
        if (carry != 0) {
            summa.addLast(carry);
        }
        return summa;
    }
    public Deque<Integer> composition(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> comp = new ArrayDeque<>();
        int count = 0;
         while (!d1.isEmpty() || !d2.isEmpty()) { 
            int composition = count;
            if (!d1.isEmpty() || !d2.isEmpty()) {
                composition = d1.removeFirst()*d2.removeFirst();
            }
          
            comp.addLast(composition % 10);
            count = composition / 10; 
        }
        if (count != 0) {
            comp.addLast(count);
        }
        return comp;
    }
    
}
    


    

