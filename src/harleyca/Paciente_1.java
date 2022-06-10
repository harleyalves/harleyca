/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harleyca;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "paciente", catalog = "harleyca", schema = "")
@NamedQueries({
    @NamedQuery(name = "Paciente_1.findAll", query = "SELECT p FROM Paciente_1 p")
    , @NamedQuery(name = "Paciente_1.findByIdpaciente", query = "SELECT p FROM Paciente_1 p WHERE p.idpaciente = :idpaciente")
    , @NamedQuery(name = "Paciente_1.findByNome", query = "SELECT p FROM Paciente_1 p WHERE p.nome = :nome")
    , @NamedQuery(name = "Paciente_1.findByCpf", query = "SELECT p FROM Paciente_1 p WHERE p.cpf = :cpf")
    , @NamedQuery(name = "Paciente_1.findByIdade", query = "SELECT p FROM Paciente_1 p WHERE p.idade = :idade")})
public class Paciente_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpaciente")
    private Integer idpaciente;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "idade")
    private int idade;

    public Paciente_1() {
    }

    public Paciente_1(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public Paciente_1(Integer idpaciente, String nome, String cpf, int idade) {
        this.idpaciente = idpaciente;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Integer getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Integer idpaciente) {
        Integer oldIdpaciente = this.idpaciente;
        this.idpaciente = idpaciente;
        changeSupport.firePropertyChange("idpaciente", oldIdpaciente, idpaciente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        int oldIdade = this.idade;
        this.idade = idade;
        changeSupport.firePropertyChange("idade", oldIdade, idade);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpaciente != null ? idpaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente_1)) {
            return false;
        }
        Paciente_1 other = (Paciente_1) object;
        if ((this.idpaciente == null && other.idpaciente != null) || (this.idpaciente != null && !this.idpaciente.equals(other.idpaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome ;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
