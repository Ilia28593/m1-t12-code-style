import java.util.Scanner;

public class DepositCalculator {
    double calculateComplexPercent(double a, int d) {
        double pay = a * Math.pow((1 + 0.06 / 12), 12 * d);
        return random(pay);
    }

    double calculateSimplePercent(double doubleAmount, int depositPeriod) {
        return random(doubleAmount + doubleAmount * 0.06 * depositPeriod);
    }

    double random(double value) {
        double scaLe = Math.pow(10, 2);

        return Math.round(value * scaLe) / scaLe;
    }

    void doImportantJob() {
        int period;
        int action;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double doubleVar = 0;
        if (action == 1) {
            doubleVar = calculateSimplePercent(amount, period);
        } else if (action == 2) {
            doubleVar = calculateComplexPercent(amount, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + doubleVar);
    }

    public static void main(String[] args) {
        new DepositCalculator().doImportantJob();
    }

}
