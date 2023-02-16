package website.functions;

import server.Server;

public class Payment {

    private static int paymentSum;
    private static int months;

    public static void sumOfPayment() throws Exception {
        System.out.println("Введите сумму, которую планируете оплачивать");
        Thread.sleep(1000);
        System.out.print(">>");
        int input = Integer.parseInt(Server.scanner.nextLine());
        if (input < 0) {
            System.out.println("Сумма платежа не может быть отрицательной!");
        } else if (input == 0) {
            System.out.println("Сумма платежа не может быть равна 0!");
        } else {
            paymentSum = input;
        }
        typeOfPayment();
    }

    public static void typeOfPayment() throws Exception {
        System.out.println("Выберите тип оплаты:");
        Thread.sleep(1000);
        System.out.println("1. Полная сумма\n2. Помесячно");
        Thread.sleep(1000);
        System.out.print(">>");
        Server.input = Server.scanner.nextLine();
        switch (Integer.parseInt(Server.input)) {
            case 1:
                System.out.println("У вас появился новый платеж");
                break;
            case 2:
                typeOfInstallmentPlan();
                break;
        }
    }

    public static void typeOfInstallmentPlan() throws Exception {
        System.out.println("Введите количество месяцев, на которое вы хотите поделить платеж:");
        Thread.sleep(1000);
        months = Integer.parseInt(Server.scanner.nextLine());

        double monthlyPayment = paymentSum / months;

        System.out.println("У вас появился новый платеж");
        Thread.sleep(1000);
        System.out.println("Ваш ежемесячный платеж составляет: " + monthlyPayment + "руб");
    }
}
