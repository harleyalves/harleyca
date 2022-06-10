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
public class MedicoDAO extends Conexao{
    
    public String cadastrarMedico(Medico medico)
    {
        try
        {
            String sentenca;
            sentenca = "INSERT INTO MEDICO VALUES (NULL,'"+
                    medico.getNome()+"','" +medico.getEspecialidade()+
                    "','"+medico.getCrm()+
                    "','"+medico.getCpf() +"')";
            return this.atualizarBanco(sentenca);
            
        }   
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
    public String atualizarMedico(Medico medico)
    {
        try
        {
            String sentenca;
            sentenca = "UPDATE INTO MEDICO SET NOME '" + medico.getNome()+
                    "',ESPECIALIDADE = '" +medico.getEspecialidade()+
                    "',CRM = '" +medico.getCrm() +
                    "',CPF = '" +medico.getCpf() + "WHERE IDMEDICO = " +
                    medico.getIdmedico();
            return this.atualizarBanco(sentenca);
            
        }   
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
    public String excluirMedico(String idmedico)
    {
        try
        {
            String sentenca;
            sentenca = "DELETE FROM MEDICO WHERE IDMEDICO = " + idmedico;
            return this.atualizarBanco(sentenca);
            
        }   
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
    
    public ArrayList listarMedicos()
    {
        try
        {
            ArrayList medicos = new ArrayList();
            String sentenca = "SELECT * FROM MEDICO ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);
            while(rs.next())
            {
                Medico medico = new Medico();
                medico.setIdmedico(rs.getInt("IDMEDICO"));
                medico.setNome(rs.getString("NOME"));
                medico.setEspecialidade(rs.getInt("ESPECIALIDADE"));
                medico.setCrm(rs.getInt("CRM"));
                medico.setCpf(rs.getString("CPF"));
                medicos.add(medico);
            }
            return medicos;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
            
    
    
}
