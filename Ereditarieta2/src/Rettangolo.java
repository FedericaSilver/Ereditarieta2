public class Rettangolo extends Forma{
    private double base;
    private double altezza;
    @Override
    public void calcolaArea() {
        double area = base*altezza;
        System.out.println("L'area del rettangolo è " + area);
    }

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
}
