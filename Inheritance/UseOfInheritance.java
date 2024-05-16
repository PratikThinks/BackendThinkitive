package Inheritance;


// In the following code I have show the use of inheritace in the daily life softwares and it took less time to code child class due to inheritance

// it is also example of the hierarical inheritance 
public class UseOfInheritance {
    public static void main(String[] args) {
        HeartPatient h = new HeartPatient();
        h.age = 34;
        h.desease="Heart Attack";
        h.location = "maharashtra";
        h.bookAppointment();
        
    }
}

class Patient{
    String name;
    String location;
    String desease;
    int age;
    public void fillRegisterationForm(){
        System.out.println("filing registeration form");
    }

    public void payBill(){
        System.out.println("redirecting to the online payment");
    }

    public void bookAppointment(){
        System.out.println("booking appoitment");
    }
}

class CancerPatient extends Patient{
    String cancerType;

    public void getChemoTherapyInfo(){
        System.out.println("calling our expert for the info");
    }
    
}

class HeartPatient extends Patient{
    public void getECG(){
        System.out.println("bookig appointment for the ECG facility");
    }
}

// we can add different type of the patients here and extends the Patient class 