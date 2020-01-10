/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdktswdatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author User
 */
public class Calisan extends Kullanıcı{
     static Mesai aktifMesai;
     public Date girissaati;
     public Date cıkıssaati;
    public ArrayList<Mesai> Mesailer = new ArrayList();
    public Calisan() {
        super();
            this.aktifMesai=new Mesai();
             EntityManagerFactory emf =Persistence.createEntityManagerFactory("PDKTSwDatabasePU");
             EntityManager em=emf.createEntityManager();
           em.getTransaction().begin();
           em.persist(aktifMesai);
           em.getTransaction().commit();
         
        
    }
    public void girisyap(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	System.out.println(dateFormat.format(date));
        if(aktifMesai.girisZamani==null || aktifMesai.girisZamani.getDay()!=date.getDay())
        {

        aktifMesai.girisZamani= date;
        }
    }
}
