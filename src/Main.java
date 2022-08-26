import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstValue = new int[4];
        int[] secondValue = new int[4];

        //Получаем у пользователя первую версию программы и перемещаем данные в массив firstValue
        String inputFirst = scanner.nextLine();
        String[] parts = inputFirst.split("\\.");
        for (int i = 0; i < firstValue.length; i++) {
            firstValue[i] = Integer.parseInt(parts[i]);
        }

        //Получаем у пользователя вторую версию программы и перемещаем данные в массив secondValue
        String inputSecond = scanner.nextLine();
        parts = inputSecond.split("\\.");
        for (int j = 0; j < secondValue.length; j++) {
            secondValue[j] = Integer.parseInt(parts[j]);
        }

        //Через цикл while проверяем, какая из версий программ старше
        while (true) {
            for (int k = 0; k < firstValue.length; k++) {
                if (firstValue[k] > secondValue[k]) {
                    System.out.println("Версия " + inputSecond + " старше, чем " + inputFirst);
                    break;
                } else if (firstValue[k] < secondValue[k]) {
                    System.out.println("Версия " + inputFirst + " старше, чем " + inputSecond);
                    break;
                } else {
                    continue;
                }
            }
            break;
        }

        //Если обе версии программ равны:
        if (firstValue[0] == secondValue[0] && firstValue[1] == secondValue[1]
                && firstValue[2] == secondValue[2] && firstValue[3] == secondValue[3]) {
            System.out.println("Обе версии программы равны");
        }
    }
}
