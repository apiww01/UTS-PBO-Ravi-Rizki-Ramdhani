/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @Ravi Rizki Ramdhani
 * NIM A22100105
 */
public class PerulanganBilanganGenap {
    public static void main(String[] args) {
    for(var counter = 1; counter <= 100; counter++){
      if(counter % 2 == 1){ // di ubah dari nilai "0" menjadi nilai "1"
        continue;
      }
      System.out.println("Perulangan Genap " + counter); // di ubah dari "perulangan Ganjil" menjadi "perulangan Genap" 
    }
  } 
}
