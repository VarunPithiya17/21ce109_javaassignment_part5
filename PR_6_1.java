//Created By 21ce109 VARUN PITHIYA

// Write a program to create thread which display “Hello World” message.
// A. by extending Thread class
// B. by using Runnable interface.

//Github Link = https://github.com/abhii14758/JAVA-PRACTICAL-PART_6

class MyThread extends Thread{
    
    public void run()
    {
        try {
                System.out.println("Hello World");
        } catch (Exception e) {
            System.out.println("Exception Occured");
        }
    }
}

public class PR_6_1_1 {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        t1.start();
    }
}







	By Implementing Runnable Interface
CODE :-- 
//Created By 21ce109 VARUN PITHIYA

// Write a program to create thread which display “Hello World” message.
// A. by extending Thread class
// B. by using Runnable interface.

//Github Link = https://github.com/abhii14758/JAVA-PRACTICAL-PART_6

class MyThread1 implements Runnable{
    
    public void run()
    {
        try {
                System.out.println("Hello World 1 "+Thread.currentThread().getName());
        } catch (Exception e) {
            System.out.println("Exception Occured");
        }
    }
}
public class PR_6_1_2 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        Thread t = new Thread(t1);
        t.run();
    }
}

