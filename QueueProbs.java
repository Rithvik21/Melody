import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;
public class QueueProbs
{
    // instance variables - replace the example below with your own
    private Queue<Integer> q;

    public QueueProbs()
    {
        q = new LinkedList<>();
    }

    //#3)
    Queue<Integer> evenFirst(Queue<Integer> nums)
    {
        Queue<Integer> n = new LinkedList<>();
        for(int i = 0; i<nums.size(); i++){
            if(nums.peek()%2 == 0){
                n.offer(nums.poll());
            }
        }
        while(!nums.isEmpty()){
            n.offer(nums.poll());
        }
        return n;
    }
    
    //#4)
    boolean numPalindrome(Queue<Integer> nums){
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> n = nums;
        for(int i = 0; i<nums.size(); i++){
            stack.push(n.poll());
        }
        System.out.println(stack);
        for(int i = 0; i<nums.size(); i++){
            if(stack.pop() != nums.poll()){
                return false;
            }
        }
        return true;
    }
    
    //#6)
    /*Stack primeNums(int n){
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> nums = new LinkedList<>();
        for(int i = 2; i<=n; i++){
            nums.offer(i);
        }
        stack.push(nums.poll());
        while(nums.size() != 0){
            int p = nums.peek();
            for(int i = 0; i<nums.size(); i++){
                if(nums.peek() % p == 0 && nums.peek() != p){
                    nums.poll();
                }
                else{
                    nums.offer(nums.poll());
                }
            }
        }
        for(int i: nums){
            stack.push(i);
        }
        return stack;
    }*/

}
