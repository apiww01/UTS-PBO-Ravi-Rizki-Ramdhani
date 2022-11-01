/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @Ravi Rizki Ramdhani
 * NIM A22100105
 */
public class Bank {
    int saldoSaya;
    int total;
    Bank(int saldo){
        saldoSaya = saldo;
    }
    void getSaldo(){
        System.out.println("Selamat datang di Bank ABC");
        System.out.println("Saldo saat ini : Rp." + saldoSaya);
        System.out.println("===================================");   
    }
    void simpanUang(int simpan){
        saldoSaya += simpan;    
        System.out.println("Simpan uang : " + simpan);
        System.out.println("Saldo saat ini : Rp." + total);
        System.out.println("===================================");
    }
    void ambilUang(int ambil){
        if(ambil < saldoSaya){
          saldoSaya -= ambil; 
            System.out.println("Ambil uang : " + ambil);
            System.out.println("Saldo saat ini : Rp." + saldoSaya);
            System.out.println("===================================");
        }else {
            System.out.println("Maaf saldo anda tidak mencukupi");
        }
    }   
}

