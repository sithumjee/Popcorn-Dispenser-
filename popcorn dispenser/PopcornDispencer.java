package paper2020.question3;

import java.util.ArrayList;
import java.util.List;

public class PopcornDispencer {
    private  int maxPopcorn=3;
    private int minPopcorn=0;
    private List<String> table=new ArrayList<>();

    public synchronized void Cook() throws InterruptedException{
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        while(table.size()==maxPopcorn){
            wait();
        }
        String Popcorn=Thread.currentThread().getName()+"produced popcorn ==";
        table.add(Popcorn);
        System.out.println(Popcorn+table.size());
        notifyAll();
    }


    public synchronized void pick() throws InterruptedException{
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        while(table.isEmpty()){
            wait();
        }
        String Popcorn=Thread.currentThread().getName()+"pick popcorn ==";
        table.remove(0);
        System.out.println(Popcorn+table.size());
        notifyAll();
    }



}
