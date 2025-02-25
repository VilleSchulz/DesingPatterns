public class Main {
    public static void main(String[] args) {
        ComputerBuilder pelitietokone = new GamingComputerBuilder();
        ComputerBuilder toimistorotta = new OfficeComputerBuilder();
        ComputerDirector tirehtori1 = new ComputerDirector(pelitietokone);
        ComputerDirector tirehtori2 = new ComputerDirector(toimistorotta);

        //do gaming computers
        tirehtori1.constructHiEnd();
        // print details of the computer
        Computer HiEndGaming = pelitietokone.getComputer();
        System.out.println(HiEndGaming);
        tirehtori1.constructLowEnd();
        // print details of the computer
        Computer LowEndGaming = pelitietokone.getComputer();
        System.out.println(LowEndGaming);
        //do office computers
        tirehtori2.constructLowEnd();
        // print details of the computer
        Computer LowEndOffice = toimistorotta.getComputer();
        System.out.println(LowEndOffice);
        tirehtori2.constructHiEnd();
        // print details of the computer
        Computer HiEndOffice = toimistorotta.getComputer();
        System.out.println(HiEndOffice);

    }


}
