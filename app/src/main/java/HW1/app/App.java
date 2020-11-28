/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HW1.app;

import HW1.list.LinkedList;
import java.util.ArrayList;


import static HW1.utilities.StringUtils.join;
import static HW1.utilities.StringUtils.split;
import static HW1.app.MessageUtils.getMessage;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        System.out.println(join(tokens));
    }
    public static boolean search(ArrayList<Integer> array, int e) {
      System.out.println("inside search");
      if (array == null) return false;
  
      for (int elt : array) {
        if (elt == e) return true;
      }
      return false;
    }
}

