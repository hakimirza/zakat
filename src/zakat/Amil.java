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
public class Amil {
    
    public void wajibZakat(CalcBenda mal, CalcUang gaji, Muzaki muz){
        
        System.out.println("\n---------------------\nSaudara/i "+muz.getNama()+" Maka anda wajib membayar :");
        
        System.out.println("zakat penghasilan, Rp " + gaji.getPayUang()+",-");
        System.out.println("zakat kepemilikan emas,Rp " + mal.getPayEmas()+",-");
        System.out.println("zakat kepemilikan perak, Rp" + mal.getPayPerak()+",-");
        System.out.println("zakat ternak sapi/kerbau, " + mal.getPaySapi()+" sapi/kerbau minimal usia 2 tahun");
        System.out.println("zakat ternak kambing/domba, " + mal.getPayKambing()+" kambing domba");
        System.out.println("zakat pertanian " + mal.getPayTani()+" KG hasil panen");
        
    }
    
}
