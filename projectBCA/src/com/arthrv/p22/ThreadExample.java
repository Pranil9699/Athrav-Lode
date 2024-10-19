package com.arthrv.p22;

//File: ThreadExample.java
public class ThreadExample {
 public static void main(String[] args) {
     // Create two threads
     MyThread thread1 = new MyThread("Thread 1");
     MyThread thread2 = new MyThread("Thread 2");

     // Start the threads
     thread1.start();
     thread2.start();
 }
}
