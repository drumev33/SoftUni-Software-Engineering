public class Extra3 {
    static class MyClass {
        int digit;

        MyClass(int digit) {
            this.digit = digit;
        }

        void scale(int factor) {
            digit *= factor;
        }
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(5);
        System.out.println(myClass.digit);
        myClass.scale(2);
        System.out.println(myClass.digit);
    }
}
