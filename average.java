package average;

import java.util.Scanner;

//@author MSI by okon0miyaki
 
public class average {

    public static void main(String[] args) {
   
    Scanner userInput = new Scanner(System.in);
    int ddp, pddp, klk, dig, dis, eng, isl, pcl, rata;
    
    System.out.println("Rata-Rata Nilai UAS Informatika");
    
    System.out.print("Dasar Dasar Pemrograman = ");
    ddp = userInput.nextInt();
    System.out.print("Praktikum Dasar Dasar Pemrograman = ");
    pddp = userInput.nextInt();
    System.out.print("Kalkulus = ");
    klk = userInput.nextInt();
    System.out.print("Sistem Digital = ");
    dig = userInput.nextInt();
    System.out.print("Matematika Diskrit = ");
    dis = userInput.nextInt();
    System.out.print("English = ");
    eng = userInput.nextInt();
    System.out.print("Agama Islam = ");
    isl = userInput.nextInt();
    System.out.print("Pancasila = ");
    pcl = userInput.nextInt();
    
    rata = (ddp + pddp + klk + dig + dis + eng + isl + pcl) / 8;
    System.out.println();
    System.out.println("++==================================++");
    System.out.println("||Rata-Rata Nilai UAS mu adalah = " + rata + "||");
    
    if (rata >= 80){
    System.out.println("||     Anda mendapatkan grade A     ||");
    } else {
    System.out.println("||            Belajar Lebih Giat !            ||");
    }
    System.out.println("++==================================++");
    }
}
