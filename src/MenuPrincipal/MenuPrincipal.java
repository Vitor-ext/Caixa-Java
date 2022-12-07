package MenuPrincipal;

import Cliente.Cliente;
import Conta.Conta;
import Menu.Menu;
import java.util.Scanner;

public class MenuPrincipal {

    public void executaMenuPrincipal() {
        System.out.println("###### BEM VINDO AO BANCO DO SENAI ######");
        System.out.println("# ESCOLHA UMA OPÇÃO:                    #");
        System.out.println("# 1  - JÁ SOU CLIENTE                   #");
        System.out.println("# 2  - SOU NOVO POR AQUI                #");
        System.out.println("# 3  - CANCELAR MINHA CONTA             #");
        System.out.println("#########################################");

        Scanner objScanner = new Scanner(System.in);
        //public boolean apagar = 0;

    int operacao = objScanner.nextInt();

    switch (operacao) {

        case 1:
            Menu objMenu = new Menu();
            objMenu.executaMenu();
            break;

        case 2:
            Cliente objCliente = new Cliente();
            objCliente.cadastro();
            break;

        case 3:
            System.out.println("TEM CERTEZA QUE DESEJA APAGAR SUA CONTA");
            System.out.println("#########################################");
            System.out.println("# 0  - NÃO                              #");
            System.out.println("# 1  - SIM                              #");
            System.out.println("#########################################");

            int apagar = objScanner.nextInt();

            if (apagar==0){
                System.out.println("PARABENS! SUA CONTA CONTINUA ATIVA....");
                executaMenuPrincipal();
            }
            else{
                System.out.println("SUA CONTA FOI EXCLUIDA COM SUCESSO !");
            }
            break;


        default:
            System.out.println("O Valor digitado não atende aos requisitos propostos");
            executaMenuPrincipal();
    }
}

}
