import java.util.*;

public class perimeterofrectangle {

  public static int perimeter(int length, int breadth) {
    int perimeter = 2 * (length + breadth);
    return perimeter;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int breadth = sc.nextInt();
    System.out.println(perimeter(length, breadth));
  }
}
