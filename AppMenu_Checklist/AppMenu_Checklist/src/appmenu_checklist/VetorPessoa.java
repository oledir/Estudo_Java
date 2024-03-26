/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmenu_checklist;

/**
 * mais um aqui
 * @author Alunos
 */
public class VetorPessoa {
    Pessoa Vn[]=new Pessoa[5];
        
        public VetorPessoa(){
            for(int i=0;i<5;i++){
                Vn[i]=new Pessoa("Indefinido",0,0);
            }
        }
        public void LerPessoa(ES e){
            for(int i=0;i<5;i++){
            Vn[i].setName(e.LerTexto("Digite o Nome:"));
            Vn[i].setIdade(e.LerInteiro("Digite a Idade:"));
            Vn[i].setAltura(e.LerReal("Digite a Altura: "));
        }
}
        public void exibirPessoa(ES e){
           for(int i=0;i<5;i++){
               e.exibir(Vn[i].getName());
               e.exibir(Vn[i].getIdade());
               e.exibir(Vn[i].getAltura());
           }
        }
}
