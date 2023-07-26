package web.model;

public class Car {
    private String model;
    private int price;
    private int series;

    public Car() {
    }

    public Car(String model, int price, int series) {
        this.model = model;
        this.price = price;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car model: [" + model + "], car series: [" + series + "], car series: [" + price + "$]; \n";
    }
}
