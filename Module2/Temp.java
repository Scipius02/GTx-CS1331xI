package Module2;
public class Temp {
    public static void main(String args[]) {
        boolean x = true;
        boolean y = true;
        boolean z = false;

        System.out.println((x && !z));
        System.out.println(( y || z));
        System.out.println(((z || !x) && (y || z)));
        System.out.println((x || !x && z));
        System.out.println((x && !x || z));
    }
}
