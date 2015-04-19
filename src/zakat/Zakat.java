/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakat;

/**
 *
 * @author Hakim
 */
import java.util.*;

public class Zakat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Muzaki m = new Muzaki();
        Muzaki muzaki1 = inputNama(m);
        
        //input**********************************************
        
        System.out.print("input penghasilan setahun terakhir : Rp ");
        muzaki1.setUang(in.nextLong());
        System.out.print("input pengeluaran setahun terakhir : Rp ");
        muzaki1.setUangOut(in.nextLong());
        
        System.out.print("input emas yang disimpan (gram) :");
        muzaki1.setEmas(in.nextInt());
          
        System.out.print("input perak yang disimpan (gram) :");
        muzaki1.setPerak(in.nextInt());
        
        System.out.print("input jumlah sapi/kerbau :");
        muzaki1.setSapi(in.nextInt());
        
        System.out.print("input jumlah kambing/domba :");
        muzaki1.setKambing(in.nextInt());
        
        System.out.print("input hasil panen (Kg) :");
        muzaki1.setHasilTani(in.nextInt());
        
        //end input *********************************
        
        //hitung ************************************
        
        CalcBenda hitMal = hitungMal(new CalcBenda() , muzaki1);
        CalcUang hitPenghasilan = hitungPenghasilan(new CalcUang() , muzaki1);
        Amil amil = new Amil();
        
        //end hitung *********************************
        
        //output**************************************
        
        amil.wajibZakat(hitMal , hitPenghasilan , muzaki1);
        
    }
    
    private static Muzaki inputNama(Muzaki muzaki){
        boolean err = true;
         Scanner in = new Scanner(System.in);
        while(err){
            
            System.out.print("input nama :");
            try {
            
                muzaki.setNama(in.next());
                err = false;
                
            } catch (Exception e) {
            
                System.err.println("Error : "+e.getMessage());
                
            }
        }
        return muzaki;
    }

    private static CalcBenda hitungMal(CalcBenda c, Muzaki m) {
        c.setPayEmas(m);
        c.setPayPerak(m);
        c.setPaySapi(m);
        c.setPayKambing(m);
        c.setPayTani(m);
        return c;
    }

    private static CalcUang hitungPenghasilan(CalcUang c, Muzaki m) {
        c.setPayUang(m);
        return c;
    }
 
}
