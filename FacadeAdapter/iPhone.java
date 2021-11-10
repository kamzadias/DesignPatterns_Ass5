public class iPhone implements PhoneShop{
    @Override
    public void showModel() {
        System.out.println("iPhone 13");
    }
    @Override
    public void price() {
        System.out.println("514 990 ₸");
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Super-fast A15 Bionic chip." +
                "An even brighter display\n" +
                "Super Retina XBM.");
    }
}
