public class IOS extends Mobile{

    private String model = "Closed source";
    private String developer = "Apple Company";

    @Override
    public int getLength() {
        return 180;
    }

    @Override
    public int getWidth() {
        return 79;
    }

    @Override
    public String getManufacturing_Country() {
        return "USA";
    }

    @Override
    public void call() {
        super.call();
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
