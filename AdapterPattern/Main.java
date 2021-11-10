public class Main {

    public static void main(String[] args) {
        iPhone iPhone = new iPhone();
        AndroidCharger androidPhone = new AndroidPhone();
        AndroidCharger adapter = new iPhoneAdapter(iPhone);

        iPhone.useLightning();
        System.out.println("----------------------------");


        androidPhone.useTypeC();

        System.out.println("----------------------------");
        System.out.println("iPhone Adapter");
        adapter.useTypeC();
    }
}
