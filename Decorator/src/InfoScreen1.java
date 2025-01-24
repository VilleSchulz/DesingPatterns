public class InfoScreen1 implements Observer {
    private WeatherStation  weatherStation;

    public InfoScreen1 (WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update(Boolean reliableTemperature){
        if(reliableTemperature){
            System.out.println("Infoscreen 1 temperature: "+ weatherStation.getTemperature());}
        else{
            System.out.println("Infoscreen 1 temperature: Faulty temp  ");
        }
    }



}
