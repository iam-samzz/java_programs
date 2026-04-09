import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        try {
            int amount = sc.nextInt();

            if (amount <= 0) {
                throw new IllegalArgumentException();
            }

            if (amount > balance) {
                throw new ArithmeticException();
            }

            balance -= amount;
            System.out.println(balance);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } catch (ArithmeticException e) {
            System.out.println("Insufficient Balance");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Amount");
        } finally {
            System.out.println("Transaction Completed");
        }
    }
}