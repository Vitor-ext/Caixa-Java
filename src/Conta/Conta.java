/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conta;

/**
 *
 * @author ❤🚀❤ Vitor de Jesus ❤🚀❤
 */

public class Conta {
    
    public String agencia = "";
    public String n_conta = "";
    public float saldo = 6500;
    public String res = "";
    
    
    public String consultaSaldo(){
        // INFORMAR AO USUARIO O SALDO ATUAL NA CONTA;
        System.out.println("Seu saldo atual é: " + this.saldo);
        
        res=("Seu saldo atual é: " + this.saldo);
        
        return (res);
    }
    
    public void geraDeposito(float valor){
        // ADICIONA VALOR NA CONTA DO USUARIO 
        this.saldo += valor;
    }
    
    public void geraSaque(float valor){
        // O USUARIO É CAPAZ DE SACAR O VALOR EXISTENTE EM SUA CONTA
        this.saldo -= valor;
    }

 /**   public void consultaSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }**/
  
}
