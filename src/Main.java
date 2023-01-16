import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    private static void task1() {
        System.out.println("Задача №1");
        int[] arrayInt = {1, 2, 3};
        double[] arrayDouble = new double[3];
        arrayDouble[0] = 1.57;
        arrayDouble[1] = 7.654;
        arrayDouble[2] = 9.986;
        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[1]);
        System.out.println(arrayInt[2]);
        System.out.println(arrayDouble[0]);
        System.out.println(arrayDouble[1]);
        System.out.println(arrayDouble[2]);
    }

    private static void task2() {
        System.out.println("Задача №2");
        int[] arrayInt = {1, 2, 3};
        double[] array = new double[3];
        array[0] = 1.57;
        array[1] = 7.654;
        array[2] = 9.986;
        System.out.println(arrayInt[0] + "," + arrayInt[1] + "," + arrayInt[2]);
        System.out.println(array[0] + "," + array[1] + "," + array[2]);
    }

    private static void task3() {
        System.out.println("Задача №3");
        int[] arrayInt = {1, 2, 3};
        double[] arrayDouble = new double[3];
        arrayDouble[0] = 1.57;
        arrayDouble[1] = 7.654;
        arrayDouble[2] = 9.986;
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i] + ",");
        }
        System.out.println("");
        for (int j = arrayDouble.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.print(arrayDouble[j]);
                break;
            }
            System.out.print(arrayDouble[j] + ",");
        }
        System.out.println("");
    }

    private static void task4() {
        System.out.println("Задача №4");
        int[] arrayInt = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 == 1) {
                arrayInt[i] +=1;
            }
        }
        System.out.print(Arrays.toString(arrayInt));
    }

}