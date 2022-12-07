/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Conta.Conta;
import MenuPrincipal.MenuPrincipal;
import java.util.Scanner;

public class Menu {

    public void executaMenu() {
        System.out.println("###### MENU ######");
        System.out.println("ESCOLHA UMA OPÇÃO: ");
        System.out.println("1  - SALDO");
        System.out.println("2  - DEPÓSITO");
        System.out.println("3  - SAQUE");

        Scanner objScanner = new Scanner(System.in);
        Conta objConta = new Conta();

        int operacao = objScanner.nextInt();
        float valor = 0;

        switch (operacao) {

            case 1:
                objConta.consultaSaldo();
                break;

            case 2:
                System.out.println("Qual o valor do depósito que deseja fazer: ");
                valor = objScanner.nextFloat();
                objConta.geraDeposito(valor);
                objConta.consultaSaldo();
                break;

            case 3:
                System.out.println("Qual o valor do saque que deseja fazer: ");
                valor = objScanner.nextFloat();
                objConta.geraSaque(valor);
                objConta.consultaSaldo();
                break;
                
            default: 
                System.out.println("O Valor digitado não atende aos requisitos propostos");       
        }
            
        MenuPrincipal objMenuPrincipal = new MenuPrincipal();
        objMenuPrincipal.executaMenuPrincipal();   
    }

}
