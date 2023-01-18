import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    public static int[] generateRandomArray(){
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = random.nextInt(100_000)+100_000;
        }
        return arr;
    }
    private static void task1(){
        System.out.println("Задача №1");
        int[] array = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum+=array[i];
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }
    private static void task2(){
        System.out.println("Задача №2");
        int[] array = generateRandomArray();
        double maxSumOneDay = 0;
        double minSumOneDay = array[0]+1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxSumOneDay) {
                maxSumOneDay = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]<minSumOneDay) {
                minSumOneDay = array[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+maxSumOneDay+" рублей");
        System.out.println("Минимальная сумма трат за день составила "+minSumOneDay+" рублей");
    }
    private static void task3(){
        System.out.println("Задача №3");
        int[] array = generateRandomArray();
        int sum = 0;
        int allDay = 30;
        double averageAmount = 0;
        for (int i = 0; i < array.length ; i++) {
            sum+=array[i];
            averageAmount =  sum/allDay;
        }

        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей ",averageAmount);
        System.out.println("");
    }
    private static void task4(){
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2; i++) {
           char sort = reverseFullName[i];
           reverseFullName[i] = reverseFullName[reverseFullName.length-i-1];
           reverseFullName[reverseFullName.length-i-1]=sort;
        }
        System.out.print(Arrays.toString(reverseFullName));
    }
}


//    private static void task1() {
//        System.out.println("Задача №1");
//        int[] arrayInt = {1, 2, 3};
//        double[] arrayDouble = new double[3];
//        arrayDouble[0] = 1.57;
//        arrayDouble[1] = 7.654;
//        arrayDouble[2] = 9.986;
//        System.out.println(arrayInt[0]);
//        System.out.println(arrayInt[1]);
//        System.out.println(arrayInt[2]);
//        System.out.println(arrayDouble[0]);
//        System.out.println(arrayDouble[1]);
//        System.out.println(arrayDouble[2]);
//    }
//
//    private static void task2() {
//        System.out.println("Задача №2");
//        int[] arrayInt = {1, 2, 3};
//        double[] array = new double[3];
//        array[0] = 1.57;
//        array[1] = 7.654;
//        array[2] = 9.986;
//        System.out.println(arrayInt[0] + "," + arrayInt[1] + "," + arrayInt[2]);
//        System.out.println(array[0] + "," + array[1] + "," + array[2]);
//    }
//
//    private static void task3() {
//        System.out.println("Задача №3");
//        int[] arrayInt = {1, 2, 3};
//        double[] arrayDouble = new double[3];
//        arrayDouble[0] = 1.57;
//        arrayDouble[1] = 7.654;
//        arrayDouble[2] = 9.986;
//        for (int i = arrayInt.length - 1; i >= 0; i--) {
//            if (i == 0) {
//                System.out.print(arrayInt[i]);
//                break;
//            }
//            System.out.print(arrayInt[i] + ",");
//        }
//        System.out.println("");
//        for (int j = arrayDouble.length - 1; j >= 0; j--) {
//            if (j == 0) {
//                System.out.print(arrayDouble[j]);
//                break;
//            }
//            System.out.print(arrayDouble[j] + ",");
//        }
//        System.out.println("");
//    }
//
//    private static void task4() {
//        System.out.println("Задача №4");
//        int[] arrayInt = {1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < arrayInt.length; i++) {
//            if (arrayInt[i] % 2 == 1) {
//                arrayInt[i] +=1;
//            }
//        }
//        System.out.print(Arrays.toString(arrayInt));
//    }
//
//}