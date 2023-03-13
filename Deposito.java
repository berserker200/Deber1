package Cajero;
/**
 *
 * @author David_Acaro
 */
import java.util.Scanner;
public class Deposito extends Cuenta{
    Scanner scn =new Scanner(System.in);
    //Atributos
    double s_aux;
    //Metodos
    @Override
    public void calcular(){
        System.out.println("Cuanto desea depositar?");
        s_aux = scn.nextInt();
        setSaldo(getSaldo()+s_aux);
        System.out.println("Ha Depositado: "+s_aux);
        s_aux=0;
    }
    @Override
    public void mostrar(){
        System.out.println("Su Saldo Actual es de: "+getSaldo()+"\n========================");
    }
}
