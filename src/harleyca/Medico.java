/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harleyca;

/**
 *
 * @author aluno
 */
public class Medico {

    /**
     * @return the idmedico
     */
    public int getIdmedico() {
        return idmedico;
    }

    /**
     * @param idmedico the idmedico to set
     */
    public void setIdmedico(int idmedico) {
        this.idmedico = idmedico;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the  especialidade
     */
    public int getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(int especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the Crm
     */
    public int getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(int crm) {
        this.crm = crm;
    }
        /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    private int idmedico;
    private String nome;
    private int especialidade;
    private int crm;
    private String cpf;
    
}
