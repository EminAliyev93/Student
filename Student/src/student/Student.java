/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Emin
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("imtahan giris balini qeyd edin");
        int gb = sc.nextInt();
        System.out.println("imtahanda yigilan bali qeyd edin");
        int yb = sc.nextInt();
        int netice = gb + yb;
        if (netice >= 51 && netice < 71) {
            System.out.println("tebrik edirik sizin umumi neticeniz " + netice + "-siz qenaetbexs ile kecdiniz");
        }else if(netice>=71 && netice<91){
            System.out.println("tebrik edirik sizin umumi neticeniz "+netice+"-siz zerbecisiniz");
        }else if(netice>=91 && netice<101){
            System.out.println("tebrik edirik sizin umumi neticeniz  "+netice+"-siz elacisiniz");
        }else if(netice<51) {
            System.out.println("tesuf ki imtahani kece bilmemisiz");
           
        }else{
             System.err.println("GIRIS VE YA IMTAHAN BALINI DUZGUN QEYD EDIN");
        }
    }

}
