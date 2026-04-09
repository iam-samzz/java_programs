import java.io.*;

class StudentFile {


    static void saveStudent(String name, int age) throws Exception {
        FileWriter fw = new FileWriter("student.txt");
        fw.write(name + "," + age);
        fw.close();
    }

    static void readStudent() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("student.txt"));
        String data = br.readLine();
        br.close();

        String[] parts = data.split(",");
        System.out.println("Name: " + parts[0]);
        System.out.println("Age: " + parts[1]);
    }

    public static void main(String[] args) throws Exception {
        saveStudent("John", 20);
        readStudent();
    }
}