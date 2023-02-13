public class vehicle {
    private String jenis, brand, name, license, tipe;
    private int speed, gas, wheel;

    public vehicle(String jenis, String brand, String name, String license, int speed, int gas, int wheel, String tipe){
        this.jenis = jenis;
        this.brand = brand;
        this.name = name;
        this.license = license;
        this.speed = speed;
        this.gas = gas;
        this.wheel = wheel;
        this.tipe = tipe;
    }

    public String getJenis() {
        return jenis;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getLicense() {
        return license;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGas() {
        return gas;
    }

    public int getWheel() {
        return wheel;
    }
    
    public String getTipe(){
        return tipe;
    }
}
