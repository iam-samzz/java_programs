class Library {

    String libraryName = "Main University Library";

    void displayLibrary() {
        System.out.println("Library: " + libraryName);
    }

    // Static Nested Class
    static class Department {
        String deptName = "Computer Science";

        void displayDepartment() {
            System.out.println("Department: " + deptName);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.displayLibrary();

        Library.Department dept = new Library.Department();
        dept.displayDepartment();
    }
}