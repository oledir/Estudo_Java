/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmenu_checklist;

/**
 * coment here
 * @author Alunos
 */
public class product {
    private String nome;
    private int codigo;
    private int qtde;
    private double valorun;
    public product(String nome, int codigo, int qtde, double valorun){
      this.nome=nome;
      this.codigo=codigo;
      this.qtde=qtde;
      this.valorun=valorun;
      
    }
   public String getNome(){
       return nome;
   }
   public void setNome(String nome){
       this.nome=nome;   }
   public int getCodigo(){
       return codigo;
   }
   public void setCodigo(int codigo){
           this.codigo=codigo;}
   public double getValorun(){
       return valorun;
       }
   public void setValorun(double valorun){
       this.valorun=valorun;
   }
   public int getQtde(){
       return qtde;
   }
   public void setQtde(int qtde){
       this.qtde=qtde;
   }
}

