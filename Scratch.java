import java.util.ArrayList;
import java.util.List;

public class Scratch {

  public static void main(String[] args) {
    
    List<Integer> intList = new ArrayList<Integer>();
    intList.add(1);
    intList.add(2);
    for (Integer i : intList) {
      System.out.println("val: " + i);
    }
    
    // use .toArray to fill in an array from ArrayList
    Integer[] integerArr = new Integer[intList.size()];
    intList.toArray(integerArr);
    for (Integer i : integerArr) {
      System.out.println("valA: " + i);
    }

    // fill a primitive int array from intList
    int[] intArr = new int[intList.size()];
    for (int i = 0; i < intArr.length; i++) {
      intArr[i] = intList.get(i);
      System.out.println("intArr[" + i + "] = " + intArr[i]);
    }
    
  }
}
