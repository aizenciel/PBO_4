/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal1;

/**
 *
 * @author Gudan
 */
public class RumusDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rumus r = new Rumus(2, 3, 5);
        Rumus r1 = new Rumus (3);

            System.out.println("Balok Konstruktor 3 Parameter");
            System.out.println("Luas permukaan Balok : "+r.LuasBalok());
            System.out.println("Volume Balok: "+ r.VolumeBalok());
          
            System.out.println("Selanjutnya Kubus");

             System.out.println("Kubus Konstruktor 1 Parameter");
            System.out.println("Luas Permukaan Kubus : "+r1.LuasKubus());
            System.out.println("Luas Lingkaran : "+r1.VolumeKubus());
             }
                }
    

