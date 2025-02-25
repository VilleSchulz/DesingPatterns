public class ComputerDirector {
    ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder){
        this.builder = builder;

    }
    public void constructHiEnd(){
        builder.buildProcessor("HiEnd");
        builder.buildRam("HiEnd");
        builder.buildHardDrive("HiEnd");
        builder.buildGraphicsCard("HiEnd");
        builder.buildOperationSystem();
        builder.buildPowerSupply("HiEnd");

    }

    public void constructLowEnd(){
        builder.buildProcessor("LowEnd");
        builder.buildRam("LowEnd");
        builder.buildHardDrive("LowEnd");
        builder.buildGraphicsCard("LowEnd");
        builder.buildOperationSystem();
        builder.buildPowerSupply("LowEnd");

    }


}
