class OddNumbers implements Runnable {
    public void run(){
        for(int i=1;i<=20;i+=2)
                System.out.println(i);
    }
}
class EvenNumbers implements Runnable {
    public void run(){
        for(int i=2;i<=20;i+=2)
                System.out.println(i);
    }
}
class PrintNum{
    public static void main(String[] args) {
        OddNumbers o = new OddNumbers();
        EvenNumbers e =new EvenNumbers();
        Thread t1 = new Thread(o,"OddNumbers");
        Thread t2 = new Thread(e,"EvenNumbers");
        t1.start();
        t2.start();

    }
}