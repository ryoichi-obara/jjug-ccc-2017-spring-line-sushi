
import java.util.stream.IntStream;

public class LineSushi {

  public static void main(String[] argus) {
    IntStream.range(0, 4)
      .mapToObj(idx -> new int[] {
        "SUSI".charAt(idx),
        "LINE".charAt(idx)})
      .map(p -> p[0] * p[0] * 311 - p[0] * 49_578 + p[1] * 1320 + 1_876_615)
      .map(value -> (char) (value /60))
      .forEach(System.out::print);
  }
}