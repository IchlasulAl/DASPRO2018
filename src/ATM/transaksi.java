package ATM;

import java.util.Scanner;

public class transaksi 
{
    Scanner sc= new Scanner(System.in);
    
    void Login(nasabah C)
    {           
           int i=0;
            while((i<3) && (!C.PW.equals("123"))) 
            {
                System.out.print("Masukan Password anda : ");C.PW=sc.next();
                i++;
            }
    }
    
    int Menu()
    {
        int Pil=0;
        System.out.println("Menu ATM"+"\nSelamat Datang Di Bank A");
        System.out.println("1. Cek Saldo "+"\n2. Deposit "+"\n3. Penarikan "+"\n0. Keluar ");
        System.out.println("Pilih Transaksi");Pil=sc.nextInt();
        return Pil;
    }
    
    void CekSaldo(nasabah C)
    {
        System.out.println("Cek Saldo " + "\nSaldo anda = "+C.saldo);
    }
    
    void Deposit(nasabah C)
    {
        System.out.println("Deposit");
        System.out.println("Masukan Jumlah Deposit =");double Deposit=sc.nextDouble();
        C.saldo=C.saldo+Deposit;
        System.out.print("Saldo Anda Sekarang = "+C.saldo);
    }
    
    void Penarikan(nasabah C)
    {
        double Tarik;
        System.out.println("Penarikan");
        System.out.println("Masukan Jumlah Penarikan =");Tarik=sc.nextDouble();
        while (C.saldo>10000)
        {
            System.out.println("Masukan Jumlah Penarikan =");Tarik=sc.nextDouble();
         if (Tarik==0) 
            {
                System.out.println("Masukan Jumlah Penarikan =");Tarik=sc.nextDouble();
            }
        else if(C.saldo-Tarik<10000)
            {
                System.out.println("Transaksi Ditolak");
            }
        else
            {
                C.saldo=C.saldo-Tarik;
                System.out.print("Saldo Anda Sekarang = "+C.saldo);
            }
        }
        
        
        
    }
    
    void ProsesMenu(nasabah C)
    {
        int P=Menu();
        
        switch(P)
        {
            case 0 : System.out.println("Terima kasih");System.exit(0);break;
            case 1 : CekSaldo(C);break;
            case 2 : Deposit(C);break;
            case 3 : Penarikan(C);break;
            default: System.out.println("Silahkan pilih kembali");
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        nasabah N= new nasabah();
        transaksi T=new transaksi();
        
        N.BacaNasabah();
        T.Login(N);
        N.TampilNasabah();
        int RT=0;
        while(RT==0)
        {
            T.ProsesMenu(N);
            System.out.print("Transaksi Kembali? (Y=0 T=1)");RT=sc.nextInt();
        }
        
    }
    
}
