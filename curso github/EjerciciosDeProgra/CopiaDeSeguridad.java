
/**
 * Write a description of class CopiaDeSeguridad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CopiaDeSeguridad
{
   private int TamArchivo;
   private int espacioPorCD;
   private int numeroDeCDs;
   public CopiaDeSeguridad(int TamañoEnGbDelArchivo){
      TamArchivo   = TamañoEnGbDelArchivo;
      espacioPorCD = 700;
      numeroDeCDs  = 1;
   }
   public int calcularNumDeCDs(){
      int tamañoAcumulado;
      TamArchivo = TamArchivo * 1024;
      tamañoAcumulado = espacioPorCD * numeroDeCDs;
      if(TamArchivo < tamañoAcumulado){
         numeroDeCDs = 
      }
   }
}
