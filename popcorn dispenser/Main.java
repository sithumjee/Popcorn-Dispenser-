package paper2020.question3;

public class Main {
    public static void main(String[] args){
        PopcornDispencer dispencer=new PopcornDispencer();
        Bell bell=new Bell();
        var light=new Light();
        Thread cooker1=new Cooker(dispencer);
        Thread cooker2=new Cooker(dispencer);
        Thread roboarm=new RobotArm(dispencer,bell,light);

        cooker1.start();
        cooker2.start();
        roboarm.start();
    }
}
