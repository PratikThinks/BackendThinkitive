public class MethodLocalInnerClass {

    public static void main(String[] args){
        access();
    }

    public static void access(){
        class local{
            public static void getInfo(){ //we can not access this method local inner class outside the function
                System.out.println("we are inside the local method inner class");
            }
        }
        local.getInfo();


    }
}
