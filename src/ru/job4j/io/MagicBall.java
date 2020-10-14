package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Я великий оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        int answerN = new Random().nextInt(3);
        String answerS = answerN == 0 ? "Да" : answerN == 1 ? "Нет" : "Может быть";
        System.out.println(answerS);
    }
}
