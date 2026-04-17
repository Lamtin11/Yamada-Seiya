package kadai2_29jikkou;

public class Jikkou {
    private String name;
    private String capital;
    private double area;

    public Jikkou(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }
}