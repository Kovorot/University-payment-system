package website;

import server.Server;
import website.functions.Payment;

public class University {

    public static void printGreetings() throws Exception {
        System.out.println("Добро пожаловать на сайт университета!");
        Thread.sleep(1000);
        System.out.println("Выберите действие:");
        Thread.sleep(1000);
        System.out.println("1. Оплатить обучение");
        Thread.sleep(1000);
        System.out.println("Чтобы выйти введите \"end\"");
        System.out.print(">>");
        Server.input = Server.scanner.nextLine();
        choiceFunction(Server.input);
    }

    public static void choiceFunction(String input) throws Exception {
        if (input == "end") {
            System.out.println("До свидания!");
        }
        switch (Integer.parseInt(input)) {
            case 1:
                Payment.sumOfPayment();
                break;
        }
    }
}
