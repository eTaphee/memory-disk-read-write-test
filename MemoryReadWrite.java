import java.util.ArrayList;
import java.util.List;

public class MemoryReadWrite {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      test();
    }
  }

  private static void test() {
    long start = System.currentTimeMillis();

    // write
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 1_000_000; i++) {
      list.add(i);
    }

    // read
    List<Integer> list1 = list.stream().toList();

    long end = System.currentTimeMillis();
    System.out.println("Time: " + (end - start) + "ms");
  }
}
