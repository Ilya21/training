package algorithm.other;

import java.util.Deque;
import java.util.LinkedList;

public class TwoStacksQueue {

  private Deque<Integer> stack1 = new LinkedList<>();
  private Deque<Integer> stack2 = new LinkedList<>();

  public void add(Integer elem) {
    if (stack1.isEmpty()) {
      stack1.push(elem);
    } else {
      while (!stack1.isEmpty()) {
        Integer pop = stack1.pop();
        stack2.push(pop);
      }
      stack1.push(elem);
      while (!stack2.isEmpty()) {
        Integer pop = stack2.pop();
        stack1.push(pop);
      }
    }
  }

  public Integer head() {
    return stack1.pop();
  }
}
