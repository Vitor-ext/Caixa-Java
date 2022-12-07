/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewConta;

import java.util.Scanner;
import Menu.Menu;
import Cliente.Cliente;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

/**
 *
 * @author ❤🚀❤ Vitor de Jesus ❤🚀❤
 */
public class NewConta{
    
    public String CPF = "";
    public int Agencia = 001;
    public String Conta = "1000-3";



    Scanner objScanner = new Scanner(System.in);

        public void cadastro () {

        System.out.println("PARA CRIAR SUA CONTA INFORME SEU CPF: ");    
        CPF = objScanner.next();
        
        Cliente objCliente = new Cliente();
        
        if("".equals(CPF)){
        
            System.out.println("Caro Sr(a) " + objCliente.Nome + " Seja muito bem vindo(a) ao nosso banco ! Abaixo suas informações: " );  

            System.out.println("Sua Agencia é: " + this.Agencia);    

            System.out.println("Sua Conta é: " + this.Conta);    
            
            /*Thread.sleep(1);*/
            
            Menu objMenu = new Menu();
            objMenu.executaMenu();  
            
        }
        else{
            System.out.println("CPF Inválido, verifique se o cliente é cadastrado em nosso banco.");
        }

    }  
    
}
