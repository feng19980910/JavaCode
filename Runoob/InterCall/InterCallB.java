public class InterCallB {
    int a = 'b';
    String str = "B of called";
    void show() {
        System.out.println("I have a number, it's " + a);
        System.out.println("And a string : " + str);
    }
    public static void main(String[] agrs) {
        InterCallA calla = new InterCallA();
        calla.show();
    }
}