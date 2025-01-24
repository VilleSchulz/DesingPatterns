public class InfoScreen2 implements Observer {
    private WeatherStation  weatherStation;

    public InfoScreen2 (WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update(Boolean reliableTemperature){
        if(reliableTemperature){
            System.out.println("Infoscreen 2 temperature: "+ weatherStation.getTemperature());}
        else{
            System.out.println("Infoscreen 2 temperature: Faulty temp  ");
        }
    }



}
