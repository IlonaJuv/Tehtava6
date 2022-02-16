package com.example.tehtava6;

import java.util.ArrayList;

public class Presidents {

    private static final Presidents ourInstance = new Presidents();
   // private ArrayList<PresidentClicked> presidentit = new ArrayList<>();
    public ArrayList<President> presidentit;


    public static Presidents getInstance(){
        return ourInstance;
    }

    public ArrayList<String> getNimet (){
        ArrayList<String> nimet = new ArrayList<>();
        for(President presd: presidentit){
            nimet.add(presd.getNimi());
        }
        return nimet;
    }

   public ArrayList<President> getTiedot() {
        return presidentit;
    }

    private Presidents() {
        presidentit = new ArrayList<President>();

        presidentit.add(new President("Stahlberg, Kaarlo Juho", 1919, 1925, "Eka presidentti"));
        presidentit.add(new President("Relander, Lauri Kristian", 1925, 1931, "Reissulasse"));
        presidentit.add(new President("Svinhufvud, Pehr, Evind", 1931, 1937, "Ukko-Pekka"));
        presidentit.add(new President("Kallio, Kyosti", 1937, 1940, "Neljas presidentti"));
        presidentit.add(new President("Ryti, Risto Heikki", 1940, 1944, "Nuorena Kustu Kalliokangas"));
        presidentit.add(new President("Mannerheim, Carl Gustav", 1944, 1946, "Marski"));
        presidentit.add(new President("Paasikivi, Juho Kusti", 1946, 1956, "Äkäinen ukko"));
        presidentit.add(new President("Kekkonen, Urho Kaleva", 1956, 1982, "Pelimies"));
        presidentit.add(new President("Koivisto, Mauno Henrik", 1982, 1994, "Manu"));
        presidentit.add(new President("Ahtisaari, Martti Oiva", 1994, 2000, "Mahtisaari"));
        presidentit.add(new President("Halonen, Tarja Kaarina", 2000, 2012, "Eka naispressa"));
        presidentit.add(new President("Niinistö, Sauli Väinämö", 2012, 2024, "Owner of Lennu, the First Dog"));

    }
}


//  presidentit.add("Tarja Halonen" + "Helsinki" + "1000");
//presidentit.add("Stahlberg, Kaarlo Juho" + 1919 + 1925 + "Eka presidentti");
//presidentit.add("Relander, Lauri Kristian" + 1925 + 1931 + "Reissulasse");
// presidentit.add("Svinhufvud, Pehr, Evind" + 1931 + 1937 + "Ukko-Pekka");
