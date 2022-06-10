/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harleyca;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class PacienteDAO extends Conexao{
    
    public String cadastrarPaciente(Paciente paciente)
    {
        try
        {
            String sentenca;
            sentenca = "INSERT INTO PACIENTE VALUES (NULL,'"+
                    paciente.getNome()+"','" +paciente.getCpf()+
                    "','"+paciente.getIdade() +"')";
            return this.atualizarBanco(sentenca);
            
        }   
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
    public String atualizarPaciente(Paciente paciente)
    {
        try
        {
            String sentenca;
            sentenca = "UPDATE INTO PACIENTE SET NOME '" + paciente.getNome()+
                    "',CPF = '" +paciente.getCpf()+
                    "',IDADE = '" +paciente.getIdade() + "WHERE IDPACIENTE = " +
                    paciente.getIdpaciente();
            return this.atualizarBanco(sentenca);
            
        }   
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
    public String excluirPaciente(String idpaciente)
    {
        try
        {
            String sentenca;
            sentenca = "DELETE FROM PACIENTE WHERE IDPACIENTE = " + idpaciente;
            return this.atualizarBanco(sentenca);
            
        }   
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
    public ArrayList listarPacientes()
    {
        try
        {
            ArrayList pacientes = new ArrayList();
            String sentenca = "SELECT * FROM PACIENTE ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);
            while(rs.next())
            {
                Paciente paciente = new Paciente();
                paciente.setIdpaciente(rs.getInt("IDPACIENTE"));
                paciente.setNome(rs.getString("NOME"));
                paciente.setCpf(rs.getString("CPF"));
                paciente.setIdade(rs.getInt("IDADE"));
                pacientes.add(paciente);
            }
            return pacientes;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
            
    
    
}
