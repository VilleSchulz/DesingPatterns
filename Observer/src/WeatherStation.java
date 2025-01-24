import java.util.ArrayList;
import java.util.List;

public class WeatherStation extends Thread {
    private double temperature = 0;
    private List<Observer> observers = new ArrayList<Observer>();
    private boolean running = true;
    final private int maxTemperature = 50;
    final private int minTemperature = -50;

    @Override
    public void run() {
        while (running) {
            double decreaseOrIncrease = Math.random();
            try {
                if (decreaseOrIncrease < 0.5) {
                    temperature -= 1;
                } else {
                    temperature += 1;
                }


                notifyObservers();


                Thread.sleep(5000);


            } catch (Exception e) {
                e.printStackTrace();


            }

        }

    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(!(temperature > maxTemperature) && !(temperature < minTemperature));

        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void stopRunning() {
        running = false;
    }
}
