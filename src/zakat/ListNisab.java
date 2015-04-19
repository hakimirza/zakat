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
public class ListNisab {
    
    private final long nisabUang;
    private final int nisabEmas;
    private final int nisabPerak;
    private final int nisabSapi;
    private final int nisabKambing;
    private final int nisabTani;

    public ListNisab() {
        this.nisabUang = 5200000;
        this.nisabEmas = 85;
        this.nisabPerak = 595;
        this.nisabSapi = 30;
        this.nisabKambing = 40;
        this.nisabTani = 700;
    }
        
    /**
     * @return the nisabUang
     */
    public long getNisabUang() {
        return nisabUang;
    }

    /**
     * @return the nisabEmas
     */
    public int getNisabEmas() {
        return nisabEmas;
    }

    /**
     * @return the nisabPerak
     */
    public int getNisabPerak() {
        return nisabPerak;
    }

    /**
     * @return the nisabSapi
     */
    public int getNisabSapi() {
        return nisabSapi;
    }

    /**
     * @return the nisabKambing
     */
    public int getNisabKambing() {
        return nisabKambing;
    }

    /**
     * @return the nisabTani
     */
    public int getNisabTani() {
        return nisabTani;
    }
    
    
        
}
