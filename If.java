public class If {
    public static void main(String[] args) {
        //if statement
        int m = 34;
        int n = 23;
        if(m > n){
            System.out.println( m+ " is greter than " + n);
        }
        else{
            System.out.println(m + " is less than " + n);
        }


        //switchcase statement 
        String color = "g";
        switch (color) {
            case "p":
                System.out.println("This is pink");
                break;
            case "g":
                System.out.println("this is green");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
    
}

