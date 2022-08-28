public class Main {
        public static void main(String[] args) {

                //Задание 1

                int[] weight;
                weight = new int[3];
                weight[0] = 1;
                weight[1] = 2;
                weight[2] = 3;

                double[] arrayDouble = {1.57, 7.654, 9.986};

                boolean[] arrayBool = {true, false};

                //Задание 2

                for (int i = 0; i < weight.length - 1; i++) {
                        System.out.print(weight[i] + ", ");
                }
                System.out.println(weight[weight.length - 1]);

                for (int i = 0; i < arrayDouble.length; i++) {
                        System.out.print(arrayDouble[i]);
                        if (i != arrayDouble.length - 1) {
                                System.out.print(", ");
                        }
                }
                System.out.println(" ");

                for (int i = 0; i < arrayBool.length - 1; i++) {
                        System.out.print(arrayBool[i] + ", ");
                }
                System.out.print(arrayBool[arrayBool.length - 1]);
                System.out.println(" ");

                //Задание 3

                for (int i = weight.length-1; i >0; i--) {
                        System.out.print(weight[i] + ", ");
                }
                System.out.println(weight[0]);

                for (int i = arrayDouble.length-1; i >0; i--) {
                        System.out.print(arrayDouble[i] + ", ");
                }
                System.out.println(arrayDouble[0]);

                for (int i = arrayBool.length-1; i >0; i--) {
                        System.out.print(arrayBool[i] + ", ");
                }
                System.out.println(arrayBool[0]);

                //Задание 4

                for (int i = 0; i < weight.length; i++) {

                        if (weight[i] % 2 !=0) {
                                weight[i]++;
                        }
                        System.out.print(weight[i] + " ");
                }
        }
}