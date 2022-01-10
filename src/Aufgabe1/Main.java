package Aufgabe1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Repository repository = new Repository();
        Service service = new Service();

        List<Offerte> offerteList = repository.readFromFile("D:\\Downloads\\LECTII UBB\\An_2 Semestrul_1\\Metode Avansate de Programare\\Laborator\\722-TodirasBogdan-Aufgabe1\\src\\Aufgabe1\\offerten.txt", "&");

        List<Offerte> sortedOfferteList = service.sortListeOfferteNachPreis(offerteList);
        List<String> topOrte = new ArrayList<>();
        topOrte.add(service.getTopOrte(sortedOfferteList));
        repository.writeToFile("D:\\Downloads\\LECTII UBB\\An_2 Semestrul_1\\Metode Avansate de Programare\\Laborator\\722-TodirasBogdan-Aufgabe1\\src\\Aufgabe1\\offertenSortiert.txt", sortedOfferteList, "&");
        repository.writeToFile2("D:\\Downloads\\LECTII UBB\\An_2 Semestrul_1\\Metode Avansate de Programare\\Laborator\\722-TodirasBogdan-Aufgabe1\\src\\Aufgabe1\\statistik.txt", topOrte, "&");

    }
}
