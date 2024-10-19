package com.arthrv.p22;

//File: MyThread.java
class MyThread extends Thread {
 private String threadName;

 // Constructor to assign a name to the thread
 MyThread(String name) {
     threadName = name;
 }

 // The run method contains the code that will be executed by the thread
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(threadName + " is running: " + i);
         try {
             Thread.sleep(500); // Pause for 500 milliseconds
         } catch (InterruptedException e) {
             System.out.println(threadName + " interrupted.");
         }
     }
     System.out.println(threadName + " finished.");
 }
}
