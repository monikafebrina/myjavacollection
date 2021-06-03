import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version 0.1
 */

public class Main
{
    public static void main(String args[])
    {
    ArrayList<Integer> arri = new ArrayList<Integer>();
    ArrayList<String> arrs = new ArrayList<String>();
    ArrayList<Mahasiswa> arrm = new ArrayList<Mahasiswa>();
        

        System.out.println("Data Mahasiswa");
        System.out.print("Jumlah Mahasiswa: ");
        Scanner input = new Scanner(System.in);
        int jumlah=0, nim=0;
        String nama=null;
        String kelas= null;
        int umur=0;
        String alamat= null;
        jumlah = input.nextInt();
        
        for (int i=0; i < jumlah ; i++) 
        {
            System.out.print("Nim ke-"+(i+1)+": ");
            nim = input.nextInt();
            System.out.print("Nama ke-"+(i+1)+":  ");
            nama = input.next();
            System.out.print("kelas ke-"+(i+1)+":  ");
            kelas= input.next();
            System.out.print("umur ke-"+(i+1)+":  ");
            umur = input.nextInt();
            System.out.print("alamat ke-"+(i+1)+":  ");
            alamat= input.next();
            arrm.add(new Mahasiswa(nim,nama,kelas,umur,alamat));
        }
        
         System.out.println("\n");
        System.out.println("Menampilkan Data Mahasiswa");
        for (Mahasiswa mhs : arrm)
        {
            System.out.println("Nim : "+mhs.getnimMhs());
            System.out.println("Nama : "+mhs.getnamaMhs());
            System.out.println("Alamat : "+mhs.getalamatMhs());
            System.out.println("Kelas : "+mhs.getkelasMhs());
            System.out.println("Umur : "+mhs.getumurMhs());
            System.out.println("---------------------");
        }
        
        //Mencari data Mahasiswa
        System.out.println("\nSearch Data Mahasiswa");
        int cariNim;
        System.out.print("Cari NIM: ");
        cariNim = input.nextInt();
        System.out.println("Hasil yang dicari:");
        for (Mahasiswa mhs : arrm)
        {
            if(mhs.getnimMhs() == cariNim){
                System.out.println("Nim : "+mhs.getnimMhs());
                System.out.println("Nama : "+mhs.getnamaMhs());
                System.out.println("Alamat : "+mhs.getalamatMhs());
                System.out.println("Kelas : "+mhs.getkelasMhs());
                System.out.println("Umur : "+mhs.getumurMhs());
            }
        }
        System.out.println("\nUpdate Data Mahasiswa");
        System.out.print("Cari NIM: ");
        cariNim = input.nextInt();
        for(Mahasiswa mhs: arrm)
        {
        if (mhs.getnimMhs() == cariNim)
        {
        System.out.print("Set Nama = ");    
        nama = input.next();
        mhs.setnamaMhs(nama);
        }
        }
         
        System.out.println("\nData Mahasiswa Setelah di Update");
        for(Mahasiswa mhs:arrm)
        {
            System.out.println("NIM = "+ mhs.getnimMhs());
            System.out.println("Nama = "+mhs.getnamaMhs());
            System.out.println("Alamat = "+mhs.getalamatMhs());
            System.out.println("Kelas : "+mhs.getkelasMhs());
            System.out.println("Umur : "+mhs.getumurMhs());
        }
        
        System.out.println("\nRemove Data Mahasiswa");
        System.out.print("Masukkan NIM = ");
        cariNim = input.nextInt();
        for(Mahasiswa mhs:arrm)
        {
        if (mhs.getnimMhs() == cariNim)
        {
        arrm.indexOf(mhs);
        arrm.remove(arrm.indexOf(mhs));
        break;
        }
        }
        
        System.out.println("\nData Mahasiswa Setelah di Hapus");
        for(Mahasiswa mhs:arrm)
        {
            System.out.println("NIM = "+ mhs.getnimMhs());
            System.out.println("Nama = "+mhs.getnamaMhs());
            System.out.println("Alamat = "+mhs.getalamatMhs());
            System.out.println("Kelas : "+mhs.getkelasMhs());
            System.out.println("Umur : "+mhs.getumurMhs());
            System.out.println("---------------------");
        }
        
        
        /*System.out.println("Menampilkan Data Mahasiswa");
        for (Mahasiswa mhs: arrm)
        {
            if(mhs.getnimMhs() == 1001)
            {
               arrm.indexOf(mhs);
               arrm.remove(arrm.indexOf(mhs));
               break;
            }
            System.out.println(mhs.getnimMhs()+" - "+ mhs.getnamaMhs());
        } 
        */
    }
} 