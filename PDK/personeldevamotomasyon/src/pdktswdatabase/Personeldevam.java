/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdktswdatabase;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 *
 */
@Entity
@Table(name = "PERSONELDEVAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personeldevam.findAll", query = "SELECT p FROM Personeldevam p")
    , @NamedQuery(name = "Personeldevam.findById", query = "SELECT p FROM Personeldevam p WHERE p.id = :id")
    , @NamedQuery(name = "Personeldevam.findByGiRi\u015ezamani", query = "SELECT p FROM Personeldevam p WHERE p.giRi\u015ezamani = :giRi\u015ezamani")
    , @NamedQuery(name = "Personeldevam.findBy\u00c7iki\u015fzamani", query = "SELECT p FROM Personeldevam p WHERE p.\u00e7iki\u015fzamani = :\u00e7iki\u015fzamani")
    , @NamedQuery(name = "Personeldevam.findByPId", query = "SELECT p FROM Personeldevam p WHERE p.pId = :pId")})
public class Personeldevam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "G\u0130R\u0130\u015eZAMANI")
    private String giRiŞzamani;
    @Column(name = "\u00c7IKI\u015eZAMANI")
    private String çikişzamani;
    @Column(name = "P_ID")
    private Integer pId;

    public Personeldevam() {
    }

    public Personeldevam(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGiRiŞzamani() {
        return giRiŞzamani;
    }

    public void setGiRiŞzamani(String giRiŞzamani) {
        this.giRiŞzamani = giRiŞzamani;
    }

    public String getÇikişzamani() {
        return çikişzamani;
    }

    public void setÇikişzamani(String çikişzamani) {
        this.çikişzamani = çikişzamani;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personeldevam)) {
            return false;
        }
        Personeldevam other = (Personeldevam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdktswdatabase.Personeldevam[ id=" + id + " ]";
    }
    
}
