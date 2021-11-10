public class Main {

    public static void main(String[] args) {
        Phone phone1 = new iPhone(new BlackColor());
        phone1.applyColor();

        Phone phone2 = new Samsung(new WhiteColor());
        phone2.applyColor();
    }
}
