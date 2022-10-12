package codesignal_hackerrank;

public class ShapeArea {

    public static int solution(int n) {
        int polygon = 0;
        if ( n == 1){
            polygon = 1;
        }else {
            polygon = (n * n) * 2 - n - (n - 1);
        }
        System.out.println(polygon);
        return polygon;
    }

    public static void main(String[] args) {
        int n = 5;
        solution(n);
    }
}
