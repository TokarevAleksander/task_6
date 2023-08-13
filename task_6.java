import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice = scanner.nextInt();

        if (choice == 1) {
            convertMassUnits();
        } else if (choice == 2) {
            convertDistanceUnits();
        } else {
            System.out.println("Ошибка: некорректный выбор.");
        }
    }

    public static void convertMassUnits() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция");
        int unitChoice = scanner.nextInt();

        System.out.print("Введите количество выбранных единиц: ");
        double value = scanner.nextDouble();

        switch (unitChoice) {
            case 1:
                System.out.println("Результат:");
                System.out.println("Килограммы: " + value);
                System.out.println("Фунты: " + (value * 2.20462));
                System.out.println("Унции: " + (value * 35.274));
                break;
            case 2:
                System.out.println("Результат:");
                System.out.println("Фунты: " + value);
                System.out.println("Килограммы: " + (value * 0.453592));
                System.out.println("Унции: " + (value * 16));
                break;
            case 3:
                System.out.println("Результат:");
                System.out.println("Унции: " + value);
                System.out.println("Килограммы: " + (value * 0.0283495));
                System.out.println("Фунты: " + (value * 0.0625));
                break;
            default:
                System.out.println("Ошибка: некорректный выбор единицы измерения.");
                break;
        }
    }

    public static void convertDistanceUnits() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int unitChoice = scanner.nextInt();

        System.out.print("Введите количество выбранных единиц: ");
        double value = scanner.nextDouble();

        switch (unitChoice) {
            case 1:
                System.out.println("Результат:");
                System.out.println("Метры: " + value);
                System.out.println("Мили: " + (value * 0.000621371));
                System.out.println("Ярды: " + (value * 1.09361));
                System.out.println("Футы: " + (value * 3.28084));
                break;
            case 2:
                System.out.println("Результат:");
                System.out.println("Мили: " + value);
                System.out.println("Метры: " + (value * 1609.34));
                System.out.println("Ярды: " + (value * 1760));
                System.out.println("Футы: " + (value * 5280));
                break;
            case 3:
                System.out.println("Результат:");
                System.out.println("Ярды: " + value);
                System.out.println("Метры: " + (value * 0.9144));
                System.out.println("Мили: " + (value * 0.000568182));
                System.out.println("Футы: " + (value * 3));
                break;
            case 4:
                System.out.println("Результат:");
                System.out.println("Футы: " + value);
                System.out.println("Метры: " + (value * 0.3048));
                System.out.println("Мили: " + (value * 0.000189394));
                System.out.println("Ярды: " + (value * 0.333333));
                break;
            default:
                System.out.println("Ошибка: некорректный выбор единицы измерения.");
                break;
        }
    }
}