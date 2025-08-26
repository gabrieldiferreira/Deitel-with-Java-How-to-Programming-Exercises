package diversos;

public class ArrayStars {

    public static void main(String[] args){

        int[] array = {0,0,0,0,0,0,1,2,4,2,1};

        for (int contador=0; contador < array.length; contador++){

            if(contador == 10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", contador * 10, contador * 10 + 9 );
            }
            for(int estrelinhas= 0; estrelinhas<array[contador]; estrelinhas++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
