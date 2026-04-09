public class Main4 {

    static void checkEligibility(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not Eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}