/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package psp.actividades;

import java.util.ArrayList;

/**
 *
 * @author Salvador Pareja Asín
 */
public class ThreadMethodExample3 {

    public static void main(String[] args) {
        
        ThreadMethodRun3 hiloMain = new ThreadMethodRun3();
        
        Thread hiloMainThread = new Thread(hiloMain);
        
        ArrayList<Thread> arrayProcesos = new ArrayList<>();
        
        
        hiloMainThread.currentThread().setName("Main");
        
        System.out.println(hiloMainThread.currentThread().getName());
        System.out.println(hiloMainThread.currentThread().toString());

        ThreadGroup even = new ThreadGroup("Even threads");
        ThreadGroup odd = new ThreadGroup("Odd threads");

        ThreadMethodRun3 localThread = null;
        Thread hiloLocalThread = null;
        for (int i=0; i<10; i++) {
            
            localThread = new ThreadMethodRun3();
            
            
            hiloLocalThread = new Thread((i%2==0)?even:odd, localThread, "Thread"+i);
            hiloLocalThread.setPriority(i+1);
            hiloLocalThread.start();
            arrayProcesos.add(hiloLocalThread);
        }

        try {
            for (int i = 0; i < arrayProcesos.size(); i++) {
                arrayProcesos.get(i).join();  // --> Will wait until last thread ends 
                                                   // like a waitFor() for processes
                
            }
            System.out.println("Todo acabo");
            
        
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            System.err.println("The main thread was interrupted while waiting for " 
            + localThread.toString() + "to finish");
        }
        System.out.println("Main thread ending");
    }
}
