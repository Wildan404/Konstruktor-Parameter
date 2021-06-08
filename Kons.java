/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class Kons {
    int harga, bayar, kembalian;
    
    void kons(int harga, int bayar){
        this.harga = harga;
        this.bayar = bayar;

    }
    
    void hitung(){
        kembalian = bayar - harga;
        System.out.println(" Kembalian anda sebesar = "+ kembalian);
    }
    
    }
