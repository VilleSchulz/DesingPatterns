public class Main {
    public static void main (String [] args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation();
        InfoScreen1 infoScreen1 = new InfoScreen1(weatherStation);
        InfoScreen2 infoScreen2 = new InfoScreen2(weatherStation);
        InfoScreen3 infoScreen3 = new InfoScreen3(weatherStation);
        //add observers to the weather station
        weatherStation.addObserver(infoScreen1);
        weatherStation.addObserver(infoScreen2);
        weatherStation.addObserver(infoScreen3);
        Thread thread = new Thread(weatherStation);
        thread.start();
        // Let the program run for 60 seconds
        Thread.sleep(60000);
        weatherStation.stopRunning();


    }
}
