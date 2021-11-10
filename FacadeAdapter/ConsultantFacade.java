public class ConsultantFacade {
    private PhoneShop iPhone;
    private PhoneShop samsung;
    private PhoneShop huawei;

    public ConsultantFacade(){
        iPhone = new iPhone();
        samsung = new Samsung();
        huawei = new Huawei();
    }
    public void iPhoneSale(){
        iPhone.showModel();
        iPhone.price();
        iPhone.showCharacteristics();
    }
    public void samsungSale(){
        samsung.showModel();
        samsung.price();
        samsung.showCharacteristics();
    }
    public void huaweiSale(){
        huawei.showModel();
        huawei.price();
        huawei.showCharacteristics();
    }
}
