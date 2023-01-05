/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newCliente;

import Conexao.Conexao;
import Cliente.Cliente;
import java.sql.SQLException;

/**
 *
 * @author sn1079379
 */
public class newCliente {
    
    private Conexao conexao;
    
    public newCliente()
    {
       this.conexao = new Conexao(); 
    }  
    
    String sql = "INSERT INTO CLIENTE (IdCliente, nome, CPF, endereco, telefone) VALUES(?,?,?,?,?)";
    
    try 
    {
        if (this.conexao.Connect())
        {
            prepareStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                        
            sentenca.setString(1,5);
            sentenca.setString(2,"Joao");
            sentenca.setInt(3,"45212512562");
            sentenca.setString(4, "MAR E SOL");
            sentenca.setString(5, "9146587570");
            
            sentenca.execute();
            sentenca.close();
            this.conexao.getConnection().close();      
        }
    }
    catch (SQLException ex)
    {
        throw new RuntieException(ex);
    }   
}
