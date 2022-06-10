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
public class ConsultaDAO extends Conexao{
    
    public String cadastrarConsulta(Consulta consulta)
    {
        try
        {
            String sentenca;
            sentenca = "INSERT INTO CONSULTA VALUES (NULL,'"+
                    consulta.getId_medico()+"'.'" +consulta.getConvenio()+
                    "','"+consulta.getId_paciente() +"')";
            return this.atualizarBanco(sentenca);
            
        }   
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
    public String atualizarConsulta(Consulta consulta)
    {
        try
        {
            String sentenca;
            sentenca = "UPDATE INTO CONSULTA SET FKIDMEDICO '" + consulta.getId_medico()+
                    "',CONVENIO = '" +consulta.getConvenio()+
                    "',FKIDPACIENTE = '" +consulta.getId_paciente() + "WHERE IDCONSULTA = " +
                    consulta.getIdconsulta();
            return this.atualizarBanco(sentenca);
            
        }   
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
    public String excluirConsulta(String idconsulta)
    {
        try
        {
            String sentenca;
            sentenca = "DELETE FROM CONSULTA WHERE IDCONSULTA = " + idconsulta;
            return this.atualizarBanco(sentenca);
            
        }   
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
    
            
    
    
}
