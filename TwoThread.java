class Morning implements Runnable {
    public void run(){
        for(int i=0;i<10;i++){
            try{
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Afternoon implements Runnable {
    public void run(){
        for(int i=0;i<10;i++){
            try{
                System.out.println("Good Afternoon");
                Thread.sleep(3000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class TwoThread{
    public static void main(String[] args) {
        Morning m = new Morning();
        Afternoon a =new Afternoon();
        Thread t1 = new Thread(m,"Morning");
        Thread t2 = new Thread(a,"Morning");
        t1.start();
        t2.start();

    }
}