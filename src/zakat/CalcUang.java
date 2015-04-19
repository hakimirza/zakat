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
public class CalcUang {
    
    ListNisab nisab = new ListNisab(); 
    private long payUang;

    /**
     * @return the payUang
     */
    public long getPayUang() {
        return payUang;
    }

    /**
     * @param muzaki
     */
    public void setPayUang(Muzaki muzaki) {
        long in = muzaki.getUang();
        long out = muzaki.getUangOut();
        if((in-out) > nisab.getNisabUang()){
            payUang = ((in/12)-(out/12))*25/100;
        }else payUang = 0;
    }
    
}
