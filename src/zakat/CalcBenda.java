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
public class CalcBenda {
    
    private int payEmas;
    private int payPerak;
    private int paySapi;
    private int payKambing;
    private int payTani;
    private final int hargaEmas = 500000;
    private final int hargaPerak = 20000;
    ListNisab nisab = new ListNisab();   

    /**
     * @return the payEmas
     */
    public int getPayEmas() {
        return payEmas;
    }

    /**
     * @param muzaki
     */
    public void setPayEmas(Muzaki muzaki) {
        
        if(muzaki.getEmas()<nisab.getNisabEmas()){
            payEmas = 0;
        }else
        payEmas = muzaki.getEmas() * hargaEmas / 40;
        
    }

    /**
     * @return the payPerak
     */
    public int getPayPerak() {
        return payPerak;
    }

    /**
     * @param muzaki
     */
    public void setPayPerak(Muzaki muzaki) {
        if(muzaki.getPerak()<nisab.getNisabPerak()){
            payPerak = 0;
        }else
        payPerak = muzaki.getPerak() * hargaPerak / 40;
    }

    /**
     * @return the paySapi
     */
    public int getPaySapi() {
        return paySapi;
    }

    /**
     * @param muzaki
     */
    public void setPaySapi(Muzaki muzaki){
        int sapi = muzaki.getSapi();
        if(sapi<nisab.getNisabSapi())paySapi = 0;
            else if(sapi<40)paySapi = 1;
            else if(sapi<60)paySapi = 1;
            else if(sapi<70)paySapi = 2;
            else if(sapi<80)paySapi = 2;
            else if(sapi<90)paySapi = 2;
            else if(sapi<100)paySapi = 3;
            else if(sapi<110)paySapi = 3;
            else if(sapi<120)paySapi = 3;
            else if(sapi<130)paySapi = 4;
            else if(sapi>=130)
                {
                autosapi(sapi);
                }
            else paySapi = 0;
    }

    /**
     * @return the payKambing
     */
    public int getPayKambing() {
        return payKambing;
    }

    /**
     * @param muzaki
     */
    public void setPayKambing(Muzaki muzaki) {
        int kambing = muzaki.getKambing();
        if(kambing<nisab.getNisabKambing())payKambing = 0;
            else if(kambing<=120)payKambing = 1;
            else if(kambing<=200)payKambing = 2;
            else if(kambing>200)
                {
                    payKambing = autokambing(kambing);
                }
            else payKambing = 0;
    }

    /**
     * @return the payTani
     */
    public int getPayTani() {
        return payTani;
    }

    /**
     * @param muzaki
     */
    public void setPayTani(Muzaki muzaki) {
        if(muzaki.getHasilTani() < nisab.getNisabTani())payTani = 0;
        else payTani = muzaki.getHasilTani()/10;
    }

//end of accessor********************************************
    
    private int autokambing(int kbg) {
        int i=3;
	while(i>0)
		{
		if(kbg<=100*i){return i;}
		i++;
		}
	return 0;
    }

    private int autosapi(int sapi) {
        //jumlah sapi >= 130 ekor
	int m, s, t;
	m=(sapi-129)/40;
	if(m>0)
		{
		s=(sapi-129)-m*40;
		if((s/30)>0)
			{
			t=s/30;
			}
		else{t=0;}
		return m+3+t+4;
		}
	else if((sapi-129)>=30)return 5;
	else return 7;
    }
   
}
