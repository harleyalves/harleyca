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
@Table(name = "medico", catalog = "harleyca", schema = "")
@NamedQueries({
    @NamedQuery(name = "Medico_1.findAll", query = "SELECT m FROM Medico_1 m")
    , @NamedQuery(name = "Medico_1.findByIdmedico", query = "SELECT m FROM Medico_1 m WHERE m.idmedico = :idmedico")
    , @NamedQuery(name = "Medico_1.findByNome", query = "SELECT m FROM Medico_1 m WHERE m.nome = :nome")
    , @NamedQuery(name = "Medico_1.findByEspecialidade", query = "SELECT m FROM Medico_1 m WHERE m.especialidade = :especialidade")
    , @NamedQuery(name = "Medico_1.findByCrm", query = "SELECT m FROM Medico_1 m WHERE m.crm = :crm")
    , @NamedQuery(name = "Medico_1.findByCpf", query = "SELECT m FROM Medico_1 m WHERE m.cpf = :cpf")})
public class Medico_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmedico")
    private Integer idmedico;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "especialidade")
    private int especialidade;
    @Basic(optional = false)
    @Column(name = "crm")
    private int crm;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;

    public Medico_1() {
    }

    public Medico_1(Integer idmedico) {
        this.idmedico = idmedico;
    }

    public Medico_1(Integer idmedico, String nome, int especialidade, int crm, String cpf) {
        this.idmedico = idmedico;
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
        this.cpf = cpf;
    }

    public Integer getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(Integer idmedico) {
        Integer oldIdmedico = this.idmedico;
        this.idmedico = idmedico;
        changeSupport.firePropertyChange("idmedico", oldIdmedico, idmedico);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public int getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(int especialidade) {
        int oldEspecialidade = this.especialidade;
        this.especialidade = especialidade;
        changeSupport.firePropertyChange("especialidade", oldEspecialidade, especialidade);
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        int oldCrm = this.crm;
        this.crm = crm;
        changeSupport.firePropertyChange("crm", oldCrm, crm);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmedico != null ? idmedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medico_1)) {
            return false;
        }
        Medico_1 other = (Medico_1) object;
        if ((this.idmedico == null && other.idmedico != null) || (this.idmedico != null && !this.idmedico.equals(other.idmedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
