
/**
 * Write a description of class MaquinaDeVerificacion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MaquinaDeVerificacion
{
   public int calcularUltimoDigito(int Numero){
     int res1,res2,res3,res4,res5,res6;
     res1 = Numero % 1000000;
     res2 = res1 % 100000;
     res3 = res2 % 10000;
     res4 = res3 % 1000;
     res5 = res4 % 100;
     res6 = res5 % 10;
     return res6;
   }
}