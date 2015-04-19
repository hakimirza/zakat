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
public class Muzaki {
       
       private String nama;
       private long uang;
       private long uangOut;
       private int emas;
       private int perak;
       private int sapi;
       private int kambing;
       private int hasilTani;
       String pesanError = "input salah, nama harus full huruf dan bagian nominal harus angka";
    
    public void Muzaki(){
    nama = null;
    uang = 0;
    emas = 0;
    perak = 0;
    sapi = 0;
    kambing = 0;
    hasilTani = 0;
    } //constructor

    /**
     * @return the nama
     */
    
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     * @throws java.lang.Exception
     */
    public void setNama(String nama) throws Exception{
        
        for(char i : nama.toCharArray()){
            if(!Character.isLetter(i)){
                throw new Exception(pesanError);
            }
        }
        
        this.nama = nama;
    }

    /**
     * @return the uang
     */
    public long getUang() {
        return uang;
    }

    /**
     * @param uang the uang to set
     * @throws java.lang.Exception
     */
    public void setUang(long uang) {
        
        
        this.uang = uang;
        
    }

    /**
     * @return the emas
     */
    public int getEmas() {
        return emas;
    }

    /**
     * @param emas the emas to set
     */
    public void setEmas(int emas) {
        this.emas = emas;
    }

    /**
     * @return the perak
     */
    public int getPerak() {
        return perak;
    }

    /**
     * @param perak the perak to set
     */
    public void setPerak(int perak) {
        this.perak = perak;
    }

    /**
     * @return the sapi
     */
    public int getSapi() {
        return sapi;
    }

    /**
     * @param sapi the sapi to set
     */
    public void setSapi(int sapi) {
        this.sapi = sapi;
    }

    /**
     * @return the kambing
     */
    public int getKambing() {
        return kambing;
    }

    /**
     * @param kambing the kambing to set
     */
    public void setKambing(int kambing) {
        this.kambing = kambing;
    }

    /**
     * @return the hasilTani
     */
    public int getHasilTani() {
        return hasilTani;
    }

    /**
     * @param hasilTani the hasilTani to set
     */
    public void setHasilTani(int hasilTani) {
        this.hasilTani = hasilTani;
    }   

    /**
     * @return the uangOut
     */
    public long getUangOut() {
        return uangOut;
    }

    /**
     * @param uangOut the uangOut to set
     */
    public void setUangOut(long uangOut) {
        this.uangOut = uangOut;
    }
       
}