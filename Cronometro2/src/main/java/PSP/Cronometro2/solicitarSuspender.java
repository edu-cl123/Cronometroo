package PSP.Cronometro2;

public class solicitarSuspender {
    private boolean suspendido; //false el hilo esta corriendo cuando este en true el hilo esta detenido 
    
    /**
     * 
     * @param b Colocanos un true o un false dependiendo si esta suspendido o no
     */
    public synchronized void setSuspendido(boolean b){
        this.suspendido=b;        
        notifyAll();
        
    }
    
    public synchronized void waitReanudar() throws InterruptedException{
        while(this.suspendido){
            wait();
        }
    }

    public boolean getSuspendido() {
        return suspendido;
    }
    
    
}