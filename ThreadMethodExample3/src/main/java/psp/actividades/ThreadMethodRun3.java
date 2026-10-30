/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp.actividades;

/**
 *
 * @author Salvador Pareja Asín
 */
public class ThreadMethodRun3 implements Runnable{

    public ThreadMethodRun3() {
    }

    @Override
    public String toString() {
        return "ThreadMethodRun3{" + '}';
    }
    
    
    
    
    
    

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("["+threadName+"] " + "Inside the thread");
        System.out.println("["+threadName+"] " + "Priority: " 
        + Thread.currentThread().getPriority());
        Thread.yield();
        System.out.println("["+threadName+"] " + "Id: " 
        + Thread.currentThread().getId());
        System.out.println("["+threadName+"] " + "ThreadGroup: " 
        + Thread.currentThread().getThreadGroup().getName());
        System.out.println("["+threadName+"] " + "ThreadGroup count: " 
        + Thread.currentThread().getThreadGroup().activeCount());
    }

    
}
