
/**
 * Write a description of class ModuloRObotico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ModuloRobotico{
    private int limitSavia,limitReflejoLagrima;
    private int cantSavia, cantReflejoLagrima;
    private int estado;
    public ModuloRobotico(){
        limitSavia          = 90;
        cantSavia           = 0;
        limitReflejoLagrima = 20;
        cantReflejoLagrima  = 0;
        estado         = 0;
    }
    public void setApagar(){
        estado = 0;
    }
    public void setEncender(){
        estado = 1;
    }
    public void recolectarSavia(int saviaRecolectada){
        if(estado == 1){
            if(saviaRecolectada <= limitSavia && cantReflejoLagrima <= limitReflejoLagrima ){
                  cantSavia = (cantSavia + saviaRecolectada)%50;
                  cantReflejoLagrima =cantReflejoLagrima +(saviaRecolectada / 50);
                  System.out.println("la accion ha sido completada con exito");
            }else{
                  System.out.println("la accion no pudo realizarce");
            }
        }
        
    }
    public void setVaciarMaquina(){
        cantSavia = 0;
        cantReflejoLagrima = 0;
    }
    
}
