package storage_project;

import static storage_project.Storage.scan;

public class Islemler extends Actions {

    public static void menu() throws InterruptedException {


        System.out.println(
                "============= İŞLEMLER =============\r\n"
                        + "     1-URUN EKLEME\r\n"
                        + "     2-ARAMA\r\n"
                        + "     3-URUN CİKİSİ\r\n"
                        + "     0-CİKİS");

        int secim = scan.nextInt();

        Actions obj=new Actions();

        switch (secim) {

            case 1:
                obj.depoyaUrunEkleme();
                menu();
                break;
            case 2:

                obj.urunArama();
                menu();
                break;
            case 3:
                obj.urunCikisi();
                menu();
                break;
            case 0:
                Thread.sleep(2000);
                cikis();
                break;
            default:
                System.out.println("gecerli bir tuslama yapiniz");
        }

    }

    public static void cikis() {

        System.out.println("yine bekleriz");


    }
}
