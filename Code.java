import java.util.Scanner;

// Tower of hanoi and its code

public class towerofHanoi {
    public static void towerH(int n, String source, String helper, String destination) {
    
        if (n == 1) {
            System.out.println("Transferred disk " + n + "from" + source + "to" + destination);
            return;
        }
        
        // Using Destination as Helper to move the disk..
        towerH(n - 1, source, destination, helper);
        System.out.println("Transferred disk " + n + "from" + source + "to" + destination);
        // Using Source as Helper to move the disk..
        towerH(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of disks: ");
        int n = sc.nextInt();
        towerH(n, "S", "H", "D");
    }
}
