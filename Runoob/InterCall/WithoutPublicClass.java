class WithoutPublicClass {
    public static void main(String [] args) {
        System.out.println("Hello, World!");
        InterCallA a = new InterCallA();
        InterCallB b = new InterCallB();
        a.show();
        b.show();
    }
}