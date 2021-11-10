public class Samsung extends Phone {
    public Samsung(Color color) {
        super(color);
    }

    @Override
    public void applyColor(){
            System.out.print("Samsung design with new color called ");
            color.applyColor();
    }
}