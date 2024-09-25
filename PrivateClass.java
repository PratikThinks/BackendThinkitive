import java.util.Arrays;

public class PrivateClass {
    public static void main(String[] args) {
     
    }
}

class Earth{
      private class India{
        int states = 27;
        static int central = 9;
    }
    void getStates(){
          India i = new India();
        System.out.println(i.states);
    }
}