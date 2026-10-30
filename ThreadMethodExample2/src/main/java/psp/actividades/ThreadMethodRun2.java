/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp.actividades;

/**
 *
 * @author Salvador Pareja Asín
 */
public class ThreadMethodRun2 extends Thread{
    
    
    

    public ThreadMethodRun2() {
        
    }

    public static int getMIN_PRIORITY() {
        return MIN_PRIORITY;
    }

    public static int getNORM_PRIORITY() {
        return NORM_PRIORITY;
    }

    public static int getMAX_PRIORITY() {
        return MAX_PRIORITY;
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

    @Override
    public String toString() {
        return "ThreadMethodRun2{" + '}';
    }

    public ThreadMethodRun2(Runnable task) {
        super(task);
    }

    public ThreadMethodRun2(String name) {
        super(name);
    }
    
    public ThreadMethodRun2(ThreadGroup group, Runnable task) {
        super(group, task);
    }

    public ThreadMethodRun2(ThreadGroup group, String name) {
        super(group, name);
    }

    
    
    
    
    
}
