package AtividadeRevisão;

import java.util.Scanner;

import javax.print.event.PrintEvent;

public class ExemploRevisão {
    Scanner sc = new Scanner(System.in);

    public void exemplo1 (){
        System.out.println("Digite o numero");
        double ndigitando = sc.nextDouble();
         if (ndigitando > 10) {
             System.out.println("e maior que dez");

         }
         else{
           System.out.println("e menor que dez");
         }
        }
          public void exemplo2(){
         System.out.println("informe a quantidade de horas trabalhadas no mes");
         int horasTrabalhadas = sc.nextInt();
         System.out.println("Informe o valor da hora");
         double ValorHoras = sc.nextDouble();
         int HorasExtra = horasTrabalhadas - 200;
         double salarioTotal = horasTrabalhadas + HorasExtra * ValorHoras * 50 / 100;
         System.out.println("O valor das Horas é R$" +salarioTotal);
         

         }
       

}
