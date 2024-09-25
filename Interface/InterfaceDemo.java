package Interface;

public class InterfaceDemo {
    public static void main(String[] args) {
        
    }
    
}


interface Hospital{
    void account();
    void pharmacy();
    void softwareTeam();
}

abstract class PratikHospital implements Hospital{
    public void account(){
        System.out.println("I have to build the account department");
    }
    public void pharmacy(){

    }
    public abstract void softwareTeam() ;
}
