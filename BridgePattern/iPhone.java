class iPhone extends Phone {
    public iPhone(Color color)
    {
        super(color);
    }

    @Override
    public void applyColor()
    {
        System.out.print("iPhone design with new color called ");
        color.applyColor();
    }
}