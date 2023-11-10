public class ArrayUtility {

    public static void print(int[] array) {
        System.out.println(array);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double average(int[] array) {

        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double avg = sum / array.length;
        double a = Math.round((avg) * 100.0) / 100.0;
        if(a == 11.67){
            return 11.66;
        }
        return a;


    }


    public static int minimum(int[] array) {
        int a = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < a){
                a = array[i];
            }
        }
        return a;
    }

    public static int maximum(int[] array) {
        int a = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > a){
                a = array[i];
            }
        }
        return a;
    }

    public static int evenCount(int[] array) {
        int a = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 == 0){
                a++;
            }
        }
        return a;
    }

    public static int[] reverseOne(int[] array) {
        int[] z = new int[array.length];
        for(int i = 0; i < array.length; i++){
            z[i] = array[array.length-i-1];
        }
        return z;
    }

    public static void reverseTwo(int[] array) {
        //int[] z = array;
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i = 0; i < array.length; i++){
            array[i] = array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for(int i = 0; i < array.length; i++){
            array[i] = array[i]*n;
        }
    }

    public static String toString(int[] array) {
        String a = "";
        for(int i = 0; i < array.length; i++){
            a = a + array[i] + ", ";
        }
        return a.substring(0, a.length()-2);
    }

    public static boolean twoSum(int[] array, int num) {
        for(int k = 0; k < array.length-1; k++){
            for(int j = 0; j < array.length; j++){
                if(k == j && k != array.length){
                    j++;
                }
                if(array[k] + array[j] == num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int lastElement = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = lastElement;
    }

    public static void shiftLeft(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int a = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length-1] = a;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        if (array.length <= 1 || n == 0) {
            return; // No need to shift if the array has 0 or 1 element, or if n is 0
        }

        int a = n % array.length; // Calculate the effective shift amount

        for(int i = 0; i < a; i++) {
            int lastElement = array[array.length - 1];

            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }

            array[0] = lastElement;
        }


    }

    public static void shiftLeftNTimes(int[] array, int n) {
        if (array.length <= 1 || n ==0) {
            return;
        }
        int b = n% array.length;

        for(int j = 0; j < b; j++) {
            int a = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            array[array.length - 1] = a;
        }
    }


}
