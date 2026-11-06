
public class program1{
    public static void main(String[] args) {
        System.out.println("0");


        int x = 99;

        double y = (double) x;

        System.out.println(y);


        String name = "Samaran.S";

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(3));
        System.out.println(name.toCharArray());

        String n2 = "Arun Vijay";
        n2 = "Samaran.S";
        System.out.println(n2);

        StringBuilder s[] = {
        new StringBuilder("hello") , 
        new StringBuilder("i") , 
        new StringBuilder("am"), 
        new StringBuilder("Sam")};

        for(StringBuilder element : s){
            System.out.println(element);
        }

        for (var element : s){
            System.out.println(element);
        }

        for(int i = 0 ; i < s.length ; i++){
            System.out.println(s[i]);
        }
    }
} 