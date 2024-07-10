package Module2;
class PrimitiveOperations {
    public static void main(String args[]) {
        // section 1
        int a = 2;
        float b = 2.5f;

        System.out.println(a);
        System.out.println(b);

        float c = a*b;
        System.out.println(c);

        float d = (float)a;
        System.out.println(d);

        int e = (int)b;
        System.out.println(e);

        char f = 'V';
        System.out.println(f);

        System.out.println((char)((int) f + 32));
    }
}

class StringOperations {
    public static void main(String args[]) {
        // section 2
        String victor = new String("Victor"); // doing the annoying way to underscore that it's an object
        System.out.println(victor);

        victor = 'A' + victor.substring(1, 5) + 'Z';
        System.out.println(victor);

        String webAddy = "www.gatech.edu";
        System.out.println(webAddy);

        webAddy = webAddy.split("\\.")[1] + "1331";
        System.out.println(webAddy);

    }
}