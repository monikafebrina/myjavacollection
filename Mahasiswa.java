
/**
 * Write a description of class Mahasiswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Mahasiswa
{
    // instance variables - replace the example below with your own
    private int nim,umur;
    private String nama,alamat,kelas;
    
    public Mahasiswa(int nim, String nama ,String kelas,int umur , String alamat)
    {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.umur = umur;
        this.alamat = alamat;
        
    }
    public int getnimMhs()
    {
         return this.nim;
    }
     public String getnamaMhs()
    {
         return this.nama;
    }
    public String getkelasMhs()
    {
        return this.kelas;
    }
    public int getumurMhs()
    {
        return this.umur;
    }
    public String getalamatMhs()
    {
        return this.alamat;
    }
     public void setnimMhs(int nim)
    {
        this.nim = nim;
    }
     public void setnamaMhs(String nama)
    {
        this.nama = nama;
    }
    public void setkelasMhs(String kelas)
    {
        this.kelas = kelas;
    }
    public void setumurMhs(int umur)
    {
        this.umur = umur;
    }
    public void setalamatMhs(String alamat)
    {
        this.alamat = alamat;
     }
    }