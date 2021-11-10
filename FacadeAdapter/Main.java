public class Main {

    public static void main(String[] args) {
        ConsultantFacade consultantFacade = new ConsultantFacade();
        consultantFacade.huaweiSale();
        System.out.println("------------");
        consultantFacade.iPhoneSale();
        System.out.println("------------");
        consultantFacade.samsungSale();
    }
}
