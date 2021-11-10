public class Huawei implements PhoneShop{
    @Override
    public void showModel() {
        System.out.println("HUAWEI P40");
    }
    @Override
    public void price() {
        System.out.println("349 890 ₸");
    }

    @Override
    public void showCharacteristics() {
        System.out.println("The state-of-the-art Kirin 990 5G processor will change your perception of speed. " +
                "The Leica UltraVision triple camera with improved artificial " +
                "intelligence capabilities takes photo and video shooting methods to a new level. " +
                "Feel the power of images and videos and let them speak for you.");
    }
}