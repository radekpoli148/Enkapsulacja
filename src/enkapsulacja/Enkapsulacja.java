/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enkapsulacja;

public class Enkapsulacja {

    
    public static void main(String[] args) {
        /*
            Enkapsulacja - pakowanie Właściwości w taki sposób 
                           by nie było do nich bezpośredniego dostępu
                           z innych klas.
        */
        KontoBankowe oszczednosciowe = new KontoBankowe();
        oszczednosciowe.wplac(5000);
        
        if (oszczednosciowe.wyplac(2455))
        {
            System.out.println("Wypłacono");
        }
        else
            System.out.println("Brak odpowiednich środków");
        
        
        System.out.println(oszczednosciowe.getSaldo());
    }
    
}

class KontoBankowe
{
    private int saldo;
    
    public KontoBankowe()
    {
        saldo = 1000;
    }
    
    int getSaldo()
    {
        return saldo;
    }
    
    private void setSaldo(int saldo)
    {
        this.saldo = saldo;
    }
    
    boolean wyplac(int ile)
    {
        if (saldo < ile)
            return false;
        else
            setSaldo(saldo - ile);
        
        return true;
    }
    
    boolean wplac(int ile)
    {
        setSaldo(saldo + ile);
        return true;
    }
}