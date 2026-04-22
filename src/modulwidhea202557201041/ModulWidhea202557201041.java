/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulwidhea202557201041;

/**
 *
 * @author asus4
 */
import javax.swing.JOptionPane;
public class ModulWidhea202557201041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        int data[][] = {{4,6,4,2,8,4,2,10}, {4,6,4,2,8,4,2,10}};
            
        int total = 0;
        int jumlahdata = 0;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
            total += data[a][b]; jumlahdata++;
            System.out.print(data[a][b] + "");
            }
            System.out.print("\n");
        }
        //Menghitung Rata-Rata
            double ratarata = (double) total / jumlahdata;
            
            System.out.println("Total:" + total);
            System.out.println("JumlahData:" + jumlahdata);
            System.out.println("RataRata:" + ratarata);
            
            
            //JoptionPane mencari dan mengganti nilai
            int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka yang dicari:"));
            int nilaibaru=0;
            boolean ditemukan = false;
            String alamat="";
            
            for (int a = 0; a < data.length; a++) {
                for (int b = 0; b < data[a].length; b++) {
                    if (data[a][b] == cari){
                        alamat += "[" +a+ "][" +b+ "}\n" ;
                        
                        ditemukan = true;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Ditemukan di index\n" + alamat);
            nilaibaru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Ganti"));
            for (int a = 0; a < data.length; a++) {
                for (int b = 0; b < data[a].length; b++) {
                    if (data[a][b] == cari){
                        data[a][b] = nilaibaru;
                    }
                }
            }
            
            if(!ditemukan){
                   JOptionPane.showMessageDialog(null, "Data tidak ditemukan ");     
                    }
                
                        //Tampilkan Array setelah perubahan 
                        System.out.println("\nArray setelah diubah:");
                        for(int a = 0; a <data.length; a++){
                            for(int b = 0; b <data[a].length; b++){
                                System.out.print(data[a][b] + " ");
                            }
                            System.out.println();
                        }
                        // Jumlah Ganjil
                        int JumlahGanjil = 0;
                        
                        for (int a = 0; a <data.length; a++){
                        for(int b = 0; b <data[a].length; b++){
                           
                            
                       // cek jika nilainya ganjil (bukan index)
                            if (b % 2 == 0){
                            JumlahGanjil += data[a][b];
                            }
                        }
                        }
                        System.out.println("\nJumlah elemen ganjil = " + JumlahGanjil);
            }
    }

            
                 
    


    
    

