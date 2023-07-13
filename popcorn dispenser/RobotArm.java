package paper2020.question3;

public class RobotArm extends Thread {
    private PopcornDispencer dispender;
    private Bell bell;
    private Light light;

    public RobotArm(PopcornDispencer dispencer,Bell bell,Light light){
        this.bell=bell;
        this.dispender=dispencer;
        this.light=light;
    }

    @Override
    public void run(){
        try {
            while(true){
                dispender.pick();
                bell.bell();
                light.blink();
                System.out.println("");
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

