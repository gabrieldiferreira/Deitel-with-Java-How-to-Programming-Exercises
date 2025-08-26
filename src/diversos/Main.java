package diversos;

import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        //tenhos 10 alunos
        //nota vai de 0 a 100
        // calule a media dessa notas

        Scanner sc = new Scanner(System.in);

        var flag = 10;
        var valor = 0;
        double media = 0.0;
        var somaTotal = 0;

        for(var i = 0; i < flag; i++){
            System.out.println("Entre com uma nota:");
            valor =  sc.nextInt();
            if(valor < 0 || valor > 100 ){
                System.out.println("valor invalido!");
                i--;
            }else{
                somaTotal+=valor;
            }
        }
        media = (double) somaTotal / flag;
        System.out.println("Soma de tudo: "+ somaTotal);
        System.out.println("A media é igual a : "+media);


    }
}