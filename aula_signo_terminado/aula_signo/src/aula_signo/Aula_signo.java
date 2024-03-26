
package aula_signo;
import java.util.Scanner;
public class Aula_signo {


    public static void main(String[] args) {
        Scanner quest=new Scanner(System.in);
        double dia;
        int mes;
        System.out.println("Esse programa serve para descobrir seu signo Hindu. \n"
                + "Insira o dia da sua data de nascimento: ");
        dia=quest.nextDouble();
        System.out.println("Insira o mes da sua data de nascimento: ");
        mes=quest.nextInt();
        switch(mes){
          
            case 1:
                    if(dia>=1&&dia<=14){
                        System.out.println("Seu signo Hindu é Dhanu");}
                    else{
                        if(dia>=15&&dia<=31){
                            System.out.println("Seu signo Hindu é Makara");
                        }
                    }
                    break;
            case 2:
                    if(dia>=1&&dia<=13){
                        System.out.println("Seu signo Hindu é Makara");}
                    else{
                        if(dia>=14&&dia<=28){
                         System.out.println("Seu signo Hindu é Kumbha"); 
                        }
                    }
                    break;
            case 3:
                    if(dia>=1&&dia<=14){
                        System.out.println("seu Signo Hindu é Kumbha");}
                    else{
                       if(dia>=15&&dia<=31){
                        System.out.println("seu Signo Hindu é Mina");
                       } 
                    
                    }
                    break;
            case 4:
                    if(dia>=15&&dia<30){
                     System.out.println("seu signo Hindu é Mesha ");}
                    else{
                        if(dia>=1&&dia<=14){
                        System.out.println("seu signo Hindu é Mina ");
                        }
                     break;
                 }
            case 5:
                   if(dia>=1&&dia<=15){
                       System.out.println("seu signo Hindu é Mesha ");}
                   else{
                       if(dia>=16&&dia<=31){
                       System.out.println("Seu signo Hindu é Vrishabha ");
                       }
                      break;
                                
                   }
            case 6:
                    if(dia>=1&&dia<=15){
                        System.out.println("Seu Signo Hindu é Vrishabha");}
                    else{
                        if(dia>=16&&dia<=30){
                            System.out.println("seu signo é Mithuna");}
                        }
                    break;
            case 7:
                    if(dia>=1&&dia<=16){
                        System.out.println("Seu signo é Mithuna");}
                    else{
                        if(dia>=17&&dia<=31){
                            System.out.println("Seu signo é Karka");
                        }
                    }
                    break;
            
            case 8:
                    if(dia>=1&&dia<=17){
                        System.out.println("Seu signo Hindu é Karka");}
                    else{
                        if(dia>=18&&dia<=31){
                            System.out.println("Seu Signo Hindu é Simha");}
                        break;}
            case 9:
                    if(dia>=1&&dia<=16){
                        System.out.println("Seu signo Hindu é Simha");
                    }
                    else{
                        if(dia>=17&&dia<=30){
                            System.out.println("Seu Signo Hindu é Kanya");
                        }          
                    }
                    break;
            case 10:
                    if(dia>=1&&dia<=17){
                        System.out.println("Seu signo Hindu é Kanya");
                    }
                    else{
                        if(dia>=18&&dia<=31){
                            System.out.println("Seu signo Hindu é Tula");
                        }
                    }
                    break;
            case 11:
                    if(dia>=1&&dia<=16){
                        System.out.println("Seu signo Hindu é Tula");
                    }
                    else{
                        if(dia>=17&&dia<=30){
                            System.out.println("Seu signo Hindu é Vrischika");
                        }
                    }
                    break;
            case 12:
                    if(dia>=1&&dia<=16){
                        System.out.println("Seu signo Hindu é Vrischika");
                    }
                    else{
                        if(dia>=17&&dia<=31){
                            System.out.println("Seu Signo Hindu é Dhanu");
                        }
                    }
                    break;
            default:
                    System.out.println("Data inserida incorretamente");
                    break;
                        }}}
                        
                   
                    
                        
                   
                  
            
         
             
    
