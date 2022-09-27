package lanzaproceso;

import java.io.IOException;

public class LanzaProceso {
    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder(args);

        try{
            Process p = pb.start();
            while (p.isAlive()){
                Thread.sleep(3000);
                System.out.println("La clase ProcesoLento se está ejecutando");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
