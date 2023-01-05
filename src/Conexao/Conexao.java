/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;
    
    
    public void conexaoBanco(){
        
        this.servidor  = "localhost";
        this.banco = "BANCO";
        this.usuario = "root";
        this.senha = "bcd127";       
    }
        
     
    public boolean Connect(){
             
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
            return true;
        } 
        catch (SQLException ex){
            System.out.println("OCORREU UM ERRO AO ACESSAR O BANDO DE DADOS");
            return false;
        }  /*finally{      
            if (conexao != null){
                conexao.close();
            }
        }     **/       
    } 
    
    public Connection getConnection(){
        return conexao;
    }
    
}
