package Aufgabe1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Service {

    /**
     * sortiert eine liste von offerte nach dem totalPreis
     */
    public List<Offerte> sortListeOfferteNachPreis(List<Offerte> offerteList) {
        return offerteList.stream().sorted(Comparator.comparing(Offerte::getTotalPreis).reversed()).collect(Collectors.toList());
    }

    /**
     * gibt den top der Orte nach Einkommen
     */
    public String getTopOrte(List<Offerte> offerteList){
        Map.Entry<Ort, Long> maxLocation = offerteList.stream()
                .collect(Collectors.groupingBy(Offerte::getOrt, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(NullPointerException::new);

        return maxLocation.getKey() + ": " + maxLocation.getValue();
    }
}
