package ro.fasttrackit.curs21.curs21;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private int throttle;

    public Engine(){
        System.out.println("Engine constructed");
    }
    public int getThrottle() {
        return throttle;
    }

    public void setThrottle(int throttle) {
        this.throttle = throttle;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "throttle=" + throttle +
                '}';
    }

    public void throttleUp() {
        throttle++;
    }
}
