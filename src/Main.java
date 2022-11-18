import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("yıl giriniz:");
        year = input.nextInt();

        int artikyil = year%4;

        if (artikyil == 0) {
            System.out.println(year +" artık bir yıldır!");
        } else {
            System.out.println(year +" artık bir yıl değildir !");
        }

    }
}
