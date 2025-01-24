
public class InfoScreen3 implements Observer {
    private WeatherStation  weatherStation;

    public InfoScreen3 (WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update(Boolean reliableTemperature){
        if(reliableTemperature){
        System.out.println("Infoscreen3 temperature: "+ weatherStation.getTemperature());}
        else{
            System.out.println("Infoscreen3 temperature: Faulty temp  ");
        }
    }



}
