public class iPhoneAdapter implements AndroidCharger {

    iPhoneCharger iPhoneCharger;

    public iPhoneAdapter(iPhoneCharger iPhoneCharger) {
        this.iPhoneCharger = iPhoneCharger;
    }

    @Override
    public void useTypeC() {
        iPhoneCharger.useLightning();
    }

}