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
 * @author User
 */
@Entity
@Table(name = "PERSONEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personel.findAll", query = "SELECT p FROM Personel p")
    , @NamedQuery(name = "Personel.findById", query = "SELECT p FROM Personel p WHERE p.id = :id")
    , @NamedQuery(name = "Personel.findByAd", query = "SELECT p FROM Personel p WHERE p.ad = :ad")
    , @NamedQuery(name = "Personel.findBySoyad", query = "SELECT p FROM Personel p WHERE p.soyad = :soyad")
    , @NamedQuery(name = "Personel.findByKullaniciadi", query = "SELECT p FROM Personel p WHERE p.kullaniciadi = :kullaniciadi")
    , @NamedQuery(name = "Personel.findByUnvan", query = "SELECT p FROM Personel p WHERE p.unvan = :unvan")
    , @NamedQuery(name = "Personel.findByTckiMliKno", query = "SELECT p FROM Personel p WHERE p.tckiMliKno = :tckiMliKno")
    , @NamedQuery(name = "Personel.findByDo\u011fumtariHi", query = "SELECT p FROM Personel p WHERE p.do\u011fumtariHi = :do\u011fumtariHi")
    , @NamedQuery(name = "Personel.findByCiNsiYet", query = "SELECT p FROM Personel p WHERE p.ciNsiYet = :ciNsiYet")
    , @NamedQuery(name = "Personel.findBySifre", query = "SELECT p FROM Personel p WHERE p.sifre = :sifre")
    , @NamedQuery(name = "Personel.findByGuvenliksorusu", query = "SELECT p FROM Personel p WHERE p.guvenliksorusu = :guvenliksorusu")
    , @NamedQuery(name = "Personel.findByGuvenlikcevap", query = "SELECT p FROM Personel p WHERE p.guvenlikcevap = :guvenlikcevap")
    , @NamedQuery(name = "Personel.findByMaas", query = "SELECT p FROM Personel p WHERE p.maas = :maas")})
public class Personel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "AD")
    private String ad;
    @Column(name = "SOYAD")
    private String soyad;
    @Column(name = "KULLANICIADI")
    private String kullaniciadi;
    @Column(name = "UNVAN")
    private String unvan;
    @Column(name = "TCK\u0130ML\u0130KNO")
    private String tckiMliKno;
    @Column(name = "DO\u011eUMTAR\u0130H\u0130")
    private String doğumtariHi;
    @Column(name = "C\u0130NS\u0130YET")
    private Boolean ciNsiYet;
    @Column(name = "SIFRE")
    private String sifre;
    @Column(name = "GUVENLIKSORUSU")
    private String guvenliksorusu;
    @Column(name = "GUVENLIKCEVAP")
    private String guvenlikcevap;
    @Column(name = "MAAS")
    private Integer maas;

    public Personel() {
    }

    public Personel(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getTckiMliKno() {
        return tckiMliKno;
    }

    public void setTckiMliKno(String tckiMliKno) {
        this.tckiMliKno = tckiMliKno;
    }

    public String getDoğumtariHi() {
        return doğumtariHi;
    }

    public void setDoğumtariHi(String doğumtariHi) {
        this.doğumtariHi = doğumtariHi;
    }

    public Boolean getCiNsiYet() {
        return ciNsiYet;
    }

    public void setCiNsiYet(Boolean ciNsiYet) {
        this.ciNsiYet = ciNsiYet;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getGuvenliksorusu() {
        return guvenliksorusu;
    }

    public void setGuvenliksorusu(String guvenliksorusu) {
        this.guvenliksorusu = guvenliksorusu;
    }

    public String getGuvenlikcevap() {
        return guvenlikcevap;
    }

    public void setGuvenlikcevap(String guvenlikcevap) {
        this.guvenlikcevap = guvenlikcevap;
    }

    public Integer getMaas() {
        return maas;
    }

    public void setMaas(Integer maas) {
        this.maas = maas;
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
        if (!(object instanceof Personel)) {
            return false;
        }
        Personel other = (Personel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdktswdatabase.Personel[ id=" + id + " ]";
    }

    void maas(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
