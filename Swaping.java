public class Swaping {
    public static void main(String[] args) {
        int a = 15;
        int b = 30;

       
        a = a + b;  
        b = a - b;  
        a = a - b;  

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
