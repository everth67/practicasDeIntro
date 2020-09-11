
/**
 * Write a description of class LibrumMemoriae here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibrumMemoriae{
    private String tarea;
    private int contador;
    private boolean estado;
    private String mensaje;
    public LibrumMemoriae(String tareaActual){
       tarea    = tareaActual;
       contador = 0;
       estado   = false;
       mensaje  = "";
    }
    public void setTareaConcluida(){
        tarea    =""; 
        contador = contador + 1;
        estado   = true;
        mensaje  = "tarea concluida";
        System.out.println("tarea concluida");
    }
    public void setNuevaTarea(String NuevaTarea){
       if(estado){
           tarea = NuevaTarea;
           mensaje = "nueva tarea asignada";
           System.out.println("nueva tarea asignada");
        }else{
           mensaje = "complete su tarea";
           System.out.println("complete su tarea");
        }
    }
    public int getTareasRealizadas(){
         return contador;
    }
    public String getTareaActual(){
         return tarea;
    }
    private String getMensaje(){
        return mensaje;
    }
}
