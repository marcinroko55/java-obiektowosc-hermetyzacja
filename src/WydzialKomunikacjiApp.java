import java.util.Scanner;

public class WydzialKomunikacjiApp {
    public static void main(String[] args) {

        int option = 0;
        int licznikWniosków = 1;
        Wniosek[] wnioski = new Wniosek[100];

        while (option != 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - złóż wniosek ");
            System.out.println("2 - zmień status wniosku");
            System.out.println("3 - sprawdź status wniosku");
            System.out.println("4 - wyświetl wyszystkie wnioski");
            System.out.println("5 - wyjście z programu");
            Wniosek wniosek;
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Podaj imię i nazwisko: ");
                    scanner.nextLine();
                    String imieINazwisko = scanner.nextLine();
                    System.out.println("Podaj typ tablicy: ");
                    String typTAblicy = scanner.nextLine();
                    wniosek = new Wniosek(imieINazwisko, typTAblicy, licznikWniosków);
                    System.out.println("Twój wniosek otrzymał numer: " + licznikWniosków);
                    wnioski[licznikWniosków] = wniosek;
                    licznikWniosków++;
                    break;

                case 2:
                    System.out.println("Podaj numer wniosku: ");
                    int numer = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Przypisz nowy status: \n 1 - w realizacji \n 2 - do odbioru");
                    int nowyStatus = scanner.nextInt();
                    String status;
                    if (nowyStatus == 1) {
                        status = "W realizacji";
                    } else if (nowyStatus == 2) {
                        status = "Do odbioru";
                    } else {
                        System.out.println("Status nie został zmieniony");
                        break;
                    }
                    for (int i = 1; i < wnioski.length && wnioski[i] != null; i++) {
                        if (numer == wnioski[i].getNumer()) {
                            wnioski[i].setStatus(status);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Podaj numer wniosku: ");
                    numer = scanner.nextInt();
                    for (int i = 1; i < wnioski.length && wnioski[i] != null; i++) {
                        if (numer == wnioski[i].getNumer()) {
                            if (wnioski[i].getStatus().equals("Do odbioru")) {
                                System.out.println("Tak");
                            } else System.out.println("Nie");
                        }
                    }
                    break;
                case 4:
                    for (int i = 1; i < wnioski.length && wnioski[i] != null; i++) {
                        wnioski[i].display();
                    }
            }
        }
    }
}