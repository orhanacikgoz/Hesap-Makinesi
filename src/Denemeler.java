import java.util.Scanner;


public class Denemeler {
    public static void main(String[] args) {
        int x1, x2, total;
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        x1=inp.nextInt();
        System.out.print("İkinci Sayiyi Giriniz");
        x2=inp.nextInt();
        System.out.print("1) Toplama \n 2)Cikarma \n 3)Carpma \n 4)Bolme");
        System.out.print("Seciniz: ");
        total =inp.nextInt();



           switch (total) {
               case 1:
                   System.out.println(x1 + x2);
                   break;
               case 2:
                   System.out.println(x1 - x2);
                   break;
               case 3:
                   System.out.println(x1 * x2);
                   break;
               case 4:
                   if (x2 != 0){
                        System.out.println(x1/x2);
                   }else {
                       System.out.println("Yanlis");

                   }break;
               default:
                   System.out.println("Gecersiz Deger Girdiniz");
           }










        }















}
