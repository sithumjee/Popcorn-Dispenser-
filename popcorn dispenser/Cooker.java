package paper2020.question3;

public class Cooker extends Thread{
    private PopcornDispencer dispencer;

    public Cooker(PopcornDispencer dispencer){
        this.dispencer=dispencer;
    }

    @Override
    public void run(){
        try{
            while(true){
                dispencer.Cook();
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
