public class Constructor {
    public static void main(String[] args) {
        Ex e = new Ex(4);
    }
    
}


class Ex{
    Ex(){

    }
    Ex(int i){
        System.out.println("this is parameterised constructor");
    }
}
