public class GamingComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public GamingComputerBuilder(){
        this.computer = new Computer();

    }


    @Override
    public void buildProcessor(String type) {
        if(type.equals("HiEnd")){
            computer.setName("HiEnd Gaming Computer");
            computer.addComponent(new Component("AMD Ryzen 9800x",1));

        }
        else if(type.equals("LowEnd")){
            computer.setName("LowEnd Gaming Computer");
            computer.addComponent(new Component("AMD Ryzen 5800x",1));

        }


    }

    @Override
    public void buildRam(String type) {
        if(type.equals("HiEnd")){
            computer.addComponent(new Component("GB Kingston DDR5",32));

        }
        else if(type.equals("LowEnd")){
            computer.addComponent(new Component("GB Kingston DDR5",16));

        }

    }

    @Override
    public void buildHardDrive(String type) {
        if(type.equals("HiEnd")){
            computer.addComponent(new Component("TB Samsung SSD",10));
        }
        else if(type.equals("LowEnd")){
            computer.addComponent(new Component("TB Samsung SSD",1));
        }


    }

    @Override
    public void buildGraphicsCard(String type) {
        if(type.equals("HiEnd")){
            computer.addComponent(new Component("Nvidia 5090Ti",1));

        }
        else if(type.equals("LowEnd")){
            computer.addComponent(new Component("Nvidia 5060Ti",1));
        }

    }

    @Override
    public void buildOperationSystem() {
        computer.addComponent(new Component("Windows 11 Gaming- edition",1));


    }

    @Override
    public void buildPowerSupply(String type) {
        if(type.equals("HiEnd")){
            computer.addComponent(new Component("1000W Power supply",1));
        }
        else if(type.equals("LowEnd")){
            computer.addComponent(new Component("750W Power supply",1));

        }

    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
