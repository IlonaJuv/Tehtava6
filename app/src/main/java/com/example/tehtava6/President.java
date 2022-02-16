package com.example.tehtava6;

public class President {
    private String nimi;
    private int aloitus;
    private int lopetus;
    private String kuvaus;

    public President (String nimi, int aloitus, int lopetus, String kuvaus) {
        this.nimi = nimi;
        this.aloitus = aloitus;
        this.lopetus = lopetus;
        this.kuvaus = kuvaus;
    }

    public String getNimi() {
        return nimi;
    }

    public int getAloitus(){
        return aloitus;
    }

    public int getLopetus(){
        return lopetus;
    }

    public String getKuvaus(){
        return kuvaus;
    }

}

