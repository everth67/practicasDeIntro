
/**
 * Write a description of class Insomnio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Insomnio
{
   public int calcular(int horaDurmio, int minutoDurmio, int horaDesperto, int minutoDesperto){
       int resultado;
       int resultadoDurmio;
       int resultadoDesperto;
       resultadoDurmio = (horaDurmio*60) + minutoDurmio;
       resultadoDesperto = (horaDesperto*60) + minutoDesperto;
       resultado = Math.abs(resultadoDurmio - resultadoDesperto);
       return resultado;
   }
}
