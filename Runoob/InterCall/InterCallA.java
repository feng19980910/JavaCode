public class InterCallA {
    void show() {
        System.out.println("I'm A, I wouldn't give you any useful information");
    }
    public static void main(String [] args) {
        InterCallB callb = new InterCallB();
        callb.show();
    }
}