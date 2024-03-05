import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DiskReadWrite {

  public static void main(String[] args) throws IOException {
    for (int i = 0; i < 5; i++) {
      test();
    }
  }

  private static void test() throws IOException {
    long start = System.currentTimeMillis();

    // write
    File file = new File("test.txt");
    FileWriter writer = new FileWriter(file);
    for (int i = 0; i < 1_000_000; i++) {
      writer.write(String.valueOf(i));
      writer.append("\n");
    }
    writer.close();

    // read
    FileReader reader = new FileReader(file);
    while (reader.read() != -1) {
    }

    long end = System.currentTimeMillis();
    System.out.println("Time: " + (end - start) + "ms");
  }
}
