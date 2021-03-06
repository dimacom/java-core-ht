package ht02VarsAndTypes;

public class Task5 {

    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = 1;
        int x = 0;
        int y = 0;
        int z = 0;
        x = Math.min(c, Math.min(a, b));
        y = FindMiddle.middleNumber(a, b, c);
        z = Math.max(c, Math.max(a, b));
        a = x;
        b = y;
        c = z;
        System.out.println(" a = "+a +"\n b = "+ b + "\n c = "+c);
    }

    private static class FindMiddle {

        private static int middleNumber(int a, int b, int c) {
            if (((a > b) && (a < c)) || ((a < b) && (a > c))) {
                return a;
            } else {
                if (((b > a) && (b < c)) || ((b < a) && (b > c))) {
                    return b;
                } else {
                    return c;
                }
            }
        }
    }
}
