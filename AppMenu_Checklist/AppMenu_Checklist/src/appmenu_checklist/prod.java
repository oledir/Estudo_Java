/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmenu_checklist;

import java.util.Scanner;
/**
 * comentario online
 * @author Alunos
 */

public class prod {
      int num1;
    int num2;
    Scanner sca=new Scanner(System.in);
        
     public void exibir(){
         System.out.println("Digite o Valor um: ");
         num1=sca.nextInt();
         System.out.println("Digite Valor Dois: ");
         num2=sca.nextInt();
         System.out.println("Valor um: "+num1+
                 "\n Valor Dois: "+num2+
                 "\n Soma dos Valores: "+(num1+num2)+
                 "\n Subtração dos valores: "+(num1-num2)+
                 "\n Multiplicação dos Valores: "+(num1*num2)+
                 "\n Divisão dos Valores: "+(num1/num2));
}
}