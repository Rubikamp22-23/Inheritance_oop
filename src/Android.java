public class Android extends Mobile{

    private double ram;
    private String model = "Open source";
    public double getRam(){
        return ram;
    }
    public void setRam (double ram){
        this.ram = ram;
    }
    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public void call() {
        super.call();
    }

    @Override
    public void getPhoto() {
        super.getPhoto();
    }
}
