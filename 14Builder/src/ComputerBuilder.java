public interface ComputerBuilder {
void buildProcessor(String type);
void buildRam(String type);
void buildHardDrive(String type);
void buildGraphicsCard(String type);
void buildOperationSystem();
void buildPowerSupply(String type);
Computer getComputer();
}
