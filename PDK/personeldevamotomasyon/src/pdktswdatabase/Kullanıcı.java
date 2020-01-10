/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdktswdatabase;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sfrcn
 */
/**
 *
 * @author User
 */
public class Kullanıcı {
    public static ArrayList<Kullanıcı> Kullanicilar = new ArrayList();
  public int id;
    public String ad;
    public String soyad;
    public String tcKimlikNo;

    public String kullaniciAdi;
    public String sifre;
    public Boolean cinsiyet;
    public String unvan;
    public String dogumTarihi;
    public int maas;
    public String guvenlikSorusu,guvenlikCevabi;
    
    static ArrayList<Date> mesaiSaati= new ArrayList();
}


