


/**
 * Write a description of class LaBateria here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LaBateria
{
    private double bateria;
    private double BateriaActual;
    private double BateriaRestanteRedes;
    private double BateriaRestanteJuego;
    private double BateriaRestanteYoutobe;
    public LaBateria(double Bateria){
       bateria = Bateria;
    }
    public double GastoEnRedes(int Minutos, int Hora){
       int minutos;
       int res1;
       minutos = Hora * 60;
       minutos = Minutos + minutos;
       res1 = minutos / 15;
       BateriaRestanteRedes = res1 * 5;
       return BateriaRestanteRedes;
    }
    public double GastoEnJuegos(int Minutos, int Hora){
       int minutos;
       int res1;
       minutos = Hora * 60;
       minutos = Minutos + minutos;
       res1 = minutos / 15;
       BateriaRestanteJuego = res1 * 5;
       return BateriaRestanteJuego;
    }
    public double GastoEnYoutobe(int Minutos, int Hora){
       int minutos;
       int res1;
       minutos = Hora * 60;
       minutos = Minutos + minutos;
       res1 = minutos / 5;
       BateriaRestanteYoutobe = res1 * 1.25;
       return BateriaRestanteYoutobe;
    }
    public double bateriaActual(){
       double res;
       res = BateriaRestanteYoutobe + BateriaRestanteRedes + BateriaRestanteRedes;
       BateriaActual = bateria - res;
       return BateriaActual;
    }
}
