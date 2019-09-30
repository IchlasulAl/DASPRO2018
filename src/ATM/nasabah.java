package ATM;

import java.util.Scanner;

public class nasabah 
{
    int kode;
    String nama,PW;
    double saldo;
    
    Scanner sc= new Scanner(System.in);
    
    void BacaNasabah()
    {
        System.out.print("Kode = ");kode=sc.nextInt();
        System.out.print("Nama = ");nama=sc.next();
        System.out.print("Password = ");PW=sc.next();
        System.out.print("Saldo = ");saldo=sc.nextDouble();
    }
    
    void TampilNasabah()
    {
        System.out.println("Kode = "+kode+" Nama = "+nama+" Saldo = "+saldo);
    }
    public static void main(String[] args) 
    {
        nasabah N= new nasabah();
        
        N.BacaNasabah();
        N.TampilNasabah();
    }
    
}
