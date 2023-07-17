import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yas ,yon;
        double km,tutar;
        Scanner alici = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km= alici.nextInt();
        tutar =km*0.10;
        System.out.print("Yaşınızı giriniz : ");
        yas = alici.nextInt();
        System.out.print("Yolculuk tipinizi giriniz(1=Tek yön 2=Gidiş dönüş )=");
        yon = alici.nextInt();
        if (!(km >0) || !(yas>0) ||!(yon==1 || yon==2 )){
            System.out.println("Hatalı veri girdiniz");
        } else if (yas<12) {
            tutar = (tutar*20)/100;
        } else if (yas>=12 && yas<=24) {
            tutar =(tutar*0.90)/100;
            
        } else if (yas>65) {
            tutar=(tutar*0.70)/100;
            
        } else if (yon==2) {
            tutar=(tutar*0.20)/100;
            
        }
        System.out.println("Toplam ödemeniz gereken tutar"+tutar);

    }
}