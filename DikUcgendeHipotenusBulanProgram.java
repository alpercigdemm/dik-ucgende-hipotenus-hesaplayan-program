import  java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        int a, b, c;
        double u, alan, cevre;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. uzunlugu giriniz: ");
        a = inp.nextInt();

        System.out.print("2. uzunlugu giriniz: ");
        b = inp.nextInt();

        System.out.print("3. uzunlugu giriniz: ");
        c = inp.nextInt();

        cevre = a+b+c;
        u = cevre/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin alani :" +alan);
        System.out.println("Ucgenin cevresi :" +cevre);


    }
}
