package diversos;

import java.security.SecureRandom;

public class SecureRadom {
    public static void main(String[] args){

        SecureRandom secureRandom = new SecureRandom();

        for(int i = 1; i <= 20; i++){
            int options = 1 + secureRandom.nextInt(6);
            System.out.printf("%d ",options);
            if(options % 5 == 0){
                System.out.println();
            }
        }
    }
}
