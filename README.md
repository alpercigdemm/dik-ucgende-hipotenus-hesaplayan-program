# Dik Üçgende Hipotenüs Bulan Program

* Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

## **Ödev**

* Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

## Formül
 
* Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

* 𝑢 = (a+b+c) / 2

* Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)


**Cevap:**

```
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
   
        System.out.println("Ucgenin alani :" + alan);
        System.out.println("Ucgenin cevresi :" + cevre);


    }
}

```
www.patik.dev
