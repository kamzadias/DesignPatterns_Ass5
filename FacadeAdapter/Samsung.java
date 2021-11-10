public class Samsung implements PhoneShop{
    @Override
    public void showModel() {
        System.out.println("Samsung S21");
    }
    @Override
    public void price() {
        System.out.println("269 990 ₸");
    }

    @Override
    public void showCharacteristics() {
        System.out.println("Model Year 2020. " +
                "Display diagonal, 6.5 inch Display. " +
                "resolution 1080 x 2400. " +
                "Matrix Type Super AMOLED. " +
                "The amount of RAM, GB6. " +
                "The amount of internal memory, GB128");
    }

}