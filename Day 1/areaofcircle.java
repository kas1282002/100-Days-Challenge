import java.util.*;
public class areaofcircle {
    public static double areaofcircle(double radius){
        double area=3.14 *(radius*radius);
        return area;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        System.out.println(areaofcircle(radius));
    }
}
