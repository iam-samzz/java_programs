class StringProcessing {

    // Concatenation
    static void concatenate() {
        int n = 10000;

        // String
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "a";
        }
        System.out.println("String time: " + (System.currentTimeMillis() - start));

        // StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        System.out.println("StringBuilder time: " + (System.currentTimeMillis() - start));

        // StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("a");
        }
        System.out.println("StringBuffer time: " + (System.currentTimeMillis() - start));
    }

    // Reverse
    static void reverse() {
        String str = "hello";

        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed (Builder): " + sb.reverse());

        StringBuffer sbf = new StringBuffer(str);
        System.out.println("Reversed (Buffer): " + sbf.reverse());
    }

    // Replace
    static void replace() {
        String str = "hello world hello";

        // String
        System.out.println("String: " + str.replace("hello", "hi"));

        // StringBuilder
        StringBuilder sb = new StringBuilder(str);
        int index;
        while ((index = sb.indexOf("hello")) != -1) {
            sb.replace(index, index + 5, "hi");
        }
        System.out.println("StringBuilder: " + sb);

        // StringBuffer
        StringBuffer sbf = new StringBuffer(str);
        while ((index = sbf.indexOf("hello")) != -1) {
            sbf.replace(index, index + 5, "hi");
        }
        System.out.println("StringBuffer: " + sbf);
    }

    public static void main(String[] args) {
        concatenate();
        reverse();
        replace();
    }
}