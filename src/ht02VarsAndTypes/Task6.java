package ht02VarsAndTypes;

public class Task6 {
    public static void main(String[] args) {
        String result;
        int x = 10;
        double y = 16;
        double z = 14.5;
        double m = 0;
        double n = 0;
        m = Math.abs(x - y);
        n = Math.abs(x - z);
        result = m < n ? "near to " + x + " number" + y : "near to " + x + " number " + z;
        System.out.println(result);
    }
}
