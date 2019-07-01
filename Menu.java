package com.company;
import java.util.Scanner;
public class Menu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int click =1;
        while(click !=0) {
            System.out.println("Введите действие от 0 до 9");
            click=in.nextInt();
            switch (click) {
                case 0:
                    break;
                case 1:

                    System.out.println("Выволнение действия1");
                    break;
                case 2:
                    System.out.println("Выволнение действия2");
                    break;
                case 3:
                    System.out.println("Выволнение действия3");
                    break;
                case 4:
                    System.out.println("Выволнение действия4");
                    break;
                case 5:
                    System.out.println("Выволнение действия5");
                    break;
                case 6:
                    System.out.println("Выволнение действия6");
                    break;
                case 7:
                    System.out.println("Выволнение действия7");
                    break;
                case 8:
                    System.out.println("Выволнение действия8");
                    break;
                case 9:
                    System.out.println("Выволнение действия9");
                    break;
                default:
                    System.out.println("Действие не выбрано");
            }

        }
        in.close();
    }

}