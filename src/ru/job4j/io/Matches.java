package ru.job4j.io;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 11;
        boolean playerB = true;
        String playerS;
        while (num > 0) {
            playerS = playerB ? "Первый игрок" : "Второй игрок";
            System.out.println(playerS + ", введите число от 1 до 3");
            int nextValue = Integer.valueOf(input.nextLine());
            while ((nextValue < 1) || (nextValue > 3)) {
                System.out.println("Неверное число. Попробуйте еще раз");
                nextValue = Integer.valueOf(input.nextLine());
            }
            if (nextValue >= num) {
                System.out.println(playerS + " взял количество спичек: " + num);
                num = 0;
                System.out.println("Осталось спичек: " + num);
                System.out.println(playerS + " проиграл. Спасибо за игру!");
            } else {
                System.out.println(playerS + " взял количество спичек: " + nextValue);
                num -= nextValue;
                System.out.println("Осталось спичек: " + num);
                System.out.println("Играем дальше.");
                playerB = !playerB;
            }
        }
    }
}
