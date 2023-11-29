class Thrd1 extends Thread
{
    public void run()
    {
        for(int i = 1; i <=5; i++)
        {
            System.out.println("Thread1 is runnung" + " "+i);
        }
    }
}

class Thrd2 extends Thread
{
    public void run()
    {
        for(int j = 1; j <=5; j++)
        {
            System.out.println("Thread2 is running" + " "+j);
        }
    }
}

class Thrd3 extends Thread
{
    public void run()
    {
        for(int k = 1; k <=5; k++)
        {
            System.out.println("Thread3 is running" + " "+k);
        }
    }
}


public class MessagePassingDemo
{

    public static void main(String args[])
    {
        Thrd1 th1 = new Thrd1();
        Thrd2 th2 = new Thrd2();
        Thrd3 th3 = new Thrd3();
        th1.start();
    }
}