package StringAndStringBuffer;

public class StringObjecr {
    public static void main(String[] args) {
        String name = new String("India");
        String name2 = new String("India");
        String name3 = "India";
        String name4 = "India";
        System.out.println("name and name2 are pointing to the diffrent object in the heap area and name3 and name4 are pointing to the object in the SCP which is created by the name ");
    }
    
}
