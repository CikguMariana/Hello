package helloworld;
import java.util.Scanner;
public class Helloworld {
   
    public static void main(String[] args) {
              
        Scanner data = new Scanner(System.in);
        String nama;
        System.out.println("siapa nama awak: ");
        nama = data.nextLine();
        System.out.println("nama saya :"+nama);
    }
}