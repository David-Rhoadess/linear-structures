package cs207.linear;

import java.util.PriorityQueue;

public class StringQue {
  public static void main(String[] arg, int args) {
    java.util.PriorityQueue<String> que = new java.util.PriorityQueue<String>(new Comparator<String>() {
      @Override
      public int compare(String str1, String str2) {
        return 1;
      }
    });
  }
}
 