/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package psp.actividades;

/**
 *
 * @author Salvador Pareja Asín
 */
public class ThreadMethodExample2 {

    public static void main(String[] args) {
        
        ThreadMethodRun2 hilo = new ThreadMethodRun2();
        
        
        hilo.currentThread().setName("Main");
        
        System.out.println(hilo.currentThread().getName());
        System.out.println(hilo.currentThread().toString());

        ThreadGroup even = new ThreadGroup("Even threads");
        ThreadGroup odd = new ThreadGroup("Odd threads");

        ThreadMethodRun2 localThread = null;
        for (int i=0; i<10; i++) {
            
            localThread = new ThreadMethodRun2((i%2==0)?even:odd, "Thread"+i);
            localThread.setPriority(i+1);
            localThread.start();
        }

        try {
            localThread.join(); // --> Will wait until last thread ends 
        // like a waitFor() for processes
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            System.err.println("The main thread was interrupted while waiting for " 
            + localThread.toString() + "to finish");
        }
        System.out.println("Main thread ending");
    }
}
