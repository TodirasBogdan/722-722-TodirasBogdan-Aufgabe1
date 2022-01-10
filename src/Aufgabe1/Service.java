package Aufgabe1;

import java.util.List;

public class Service {
    public List<Offerte> sortListeOfferteNachPreis(List<Offerte> offerteList){
        return offerteList.stream().sorted()
    }
}
