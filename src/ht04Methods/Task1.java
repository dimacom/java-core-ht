package ht04Methods;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
    }

    private static int sum(int ... nums) {
        int resultSum = 0;
        for (int num : nums) {
            resultSum += num;
        }
        return resultSum;
    }
}
