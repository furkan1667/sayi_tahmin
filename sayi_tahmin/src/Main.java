import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random a=new Random();
        Scanner giris =new Scanner(System.in);

        System.out.println("Aklınızdan 1 ile 100 Arasından Bir Sayı Tutunuz.....");
        int deger=0;
        int tahmin=a.nextInt(101);
        int fazlalık =100;
        int azlık=0;


        while (deger==0) {
            System.out.println("Tahminim: "+ tahmin);
            System.out.print("Yanlış ise 0 değerini,  doğru ise 1 değerini giriniz: ");
            deger = giris.nextInt();

            if(deger!=0 || deger!=1){
                if(deger==0) {
                    System.out.print("Tahminim düşük ise 0 değerini, yüksek ise 1 değerini giriniz: ");
                    int aralık=giris.nextInt();
                    if(aralık==0) {
                        azlık=tahmin;
                        tahmin=a.nextInt((fazlalık-azlık)+1)+azlık;
                        continue;                                                  //((fazlalık-azlık)+1)+azlık
                    }

                    else if (aralık==1);{
                        fazlalık=tahmin;
                        tahmin=a.nextInt((fazlalık-azlık)+1)+azlık;
                        continue;
                    }
                }
                else if (deger==1);
                System.out.println("Tuttuğunuz Sayı: "+tahmin);
                break;
            }
        }
    }
}
