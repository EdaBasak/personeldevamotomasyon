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
@Table(name = "YONETICI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Yonetici.findAll", query = "SELECT y FROM Yonetici y")
    , @NamedQuery(name = "Yonetici.findById", query = "SELECT y FROM Yonetici y WHERE y.id = :id")
    , @NamedQuery(name = "Yonetici.findByAd", query = "SELECT y FROM Yonetici y WHERE y.ad = :ad")
    , @NamedQuery(name = "Yonetici.findBySoyad", query = "SELECT y FROM Yonetici y WHERE y.soyad = :soyad")
    , @NamedQuery(name = "Yonetici.findByKullaniciadi", query = "SELECT y FROM Yonetici y WHERE y.kullaniciadi = :kullaniciadi")
    , @NamedQuery(name = "Yonetici.findByUnvan", query = "SELECT y FROM Yonetici y WHERE y.unvan = :unvan")
    , @NamedQuery(name = "Yonetici.findByTckiMliKno", query = "SELECT y FROM Yonetici y WHERE y.tckiMliKno = :tckiMliKno")
    , @NamedQuery(name = "Yonetici.findByDo\u011fumtariHi", query = "SELECT y FROM Yonetici y WHERE y.do\u011fumtariHi = :do\u011fumtariHi")
    , @NamedQuery(name = "Yonetici.findByCiNsiYet", query = "SELECT y FROM Yonetici y WHERE y.ciNsiYet = :ciNsiYet")
    , @NamedQuery(name = "Yonetici.findBySifre", query = "SELECT y FROM Yonetici y WHERE y.sifre = :sifre")
    , @NamedQuery(name = "Yonetici.findByGuvenliksorusu", query = "SELECT y FROM Yonetici y WHERE y.guvenliksorusu = :guvenliksorusu")
    , @NamedQuery(name = "Yonetici.findByGuvenlikcevap", query = "SELECT y FROM Yonetici y WHERE y.guvenlikcevap = :guvenlikcevap")
    , @NamedQuery(name = "Yonetici.findByMaas", query = "SELECT y FROM Yonetici y WHERE y.maas = :maas")})
public class Yonetici implements Serializable {

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

    public Yonetici() {
    }

    public Yonetici(Integer id) {
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
        if (!(object instanceof Yonetici)) {
            return false;
        }
        Yonetici other = (Yonetici) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pdktswdatabase.Yonetici[ id=" + id + " ]";
    }
    
}
