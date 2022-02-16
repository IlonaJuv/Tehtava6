package com.example.tehtava6;

public class President {
    private String nimi;
    private String aloitus;
    private String lopetus;
    private String kuvaus;

    public President (String nimi, String aloitus, String lopetus, String kuvaus) {
        this.nimi = nimi;
        this.aloitus = aloitus;
        this.lopetus = lopetus;
        this.kuvaus = kuvaus;
    }

    public String getNimi() {
        return nimi;
    }

    public String getAloitus(){
        return aloitus;
    }

    public String getLopetus(){
        return lopetus;
    }

    public String getKuvaus(){
        return kuvaus;
    }

}

