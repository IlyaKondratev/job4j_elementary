package ru.job4j.tasks;

public class TasksClass {

    public static int sum(int a, int b) {
        int sum = 0;
        boolean enable = true;
        for (int i = a; i <= b; i++) {
            if (enable) {
               sum += i;
            }
            enable = !enable;
        }
        return sum;
    }

    public static int checkStrings(String left, String right) {
        int count = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static String code(String s) {
        if (s.length() == 0) {
            return "empty";
        } else if (s.length() < 4) {
            return s;
        } else {
            StringBuilder stringBuilder = new StringBuilder(s);
            for (int i = 0; i < s.length(); i++) {
                if (s.length() - i > 4) {
                    stringBuilder.setCharAt(i, '#');
                } else {
                    stringBuilder.setCharAt(i, s.charAt(i));
                }
            }
            return stringBuilder.toString();
        }
    }

    public static boolean check(int i) {
        String s = Integer.toString(i);
        boolean rsl = true;
        for (int j = 0; j < s.length() / 2; j++) {
            if (s.charAt(j) != s.charAt(s.length() - j - 1)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static String collect(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.charAt(0));
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ') {
                stringBuilder.append(s.charAt(i + 1));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 5));
        System.out.println(sum(0, 5));
    }

}
