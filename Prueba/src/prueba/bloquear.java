package prueba;
//todo este codigo me lo vole de un página que no me acuerdo cual era xd
//lo bueno es que ya viene comentado y no es necesario comentarlo io xd
//Este codigo funciona para Principal, Docente, Encuesta y Registro
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;

public class bloquear {
     private JFrame jframe=null;
    
    /**
     * Constructor de clase
     */
    public bloquear( JFrame f )
    {
        this.jframe = f;
    }
    
    /**
     * ejecuta una tarea cada "n" tiempo
     * Para evitar que el usuario utilice las teclas (WINDOWS + D)(TAB) y asi perder el foco
     * de la aplicación, cada 50 milisegundos se envia el JFrame al frente y se cambia su propiedad a maximizado
     */
    public void block()
    {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(this::front, 500, 50 , TimeUnit.MILLISECONDS ); //comienza dentro de 1/2 segundo y luego se repite cada N segundos
    }
    
    /**
     * 
     */
    public void front()
    {
       jframe.setExtendedState( JFrame.MAXIMIZED_BOTH );//maximizado
        jframe.toFront();
    }
}
