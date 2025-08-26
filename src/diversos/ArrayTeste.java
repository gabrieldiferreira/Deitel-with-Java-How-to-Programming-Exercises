package diversos;

public class ArrayTeste {

    public static void main(String[] args){

        int[] array = { 231, 232, 424, 241, 4232, 563, 466, 1772 };
        int counter;
        for(counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;

            System.out.printf("%s%8s%n", "Index", "Value");

            for(counter = 0; counter < array.length; counter++){
                System.out.printf("%5d%8d%n", counter, array[counter]);
            }
        }
    }
}
