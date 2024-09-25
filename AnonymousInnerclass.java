public class AnonymousInnerclass {
    public static void main(String[] args){
        Tech a = new Tech(){

            public void showInfo(){
                System.out.println("I can not show you the info now");
            }
        };   // we can directly override any funciton by using anonymous inner class
        a.showInfo();

    }


}

class Tech{
    public void showInfo(){
        int n = 34;
        System.out.println("I will show you all the info insid the function here");
    }
}
