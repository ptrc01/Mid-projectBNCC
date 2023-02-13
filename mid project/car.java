public class car extends vehicle {
    private int system;

    public car (String jenis, String brand, String name, String license, int speed, int gas, int wheel, String tipe, int system){
        super(jenis, brand, name, license, speed, gas, wheel, tipe);
        this.system = system;
    }

    public int getSystem(){
        return system;
    }

    
    public void show() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Name: " + getName());
        System.out.println("License Number: " + getLicense());
        System.out.println("Top Speed: " + getSpeed());
        System.out.println("Gas Capacity: " + getGas());
        System.out.println("Wheel: " + getWheel());
        System.out.println("Type: " + getTipe());
        System.out.println("Entertainment System:" + getSystem());
        special();
    }
    
    public void special(){
        System.out.println("Turning on entertainment system...");
        if (getJenis().equals("Supercar")) {
            System.out.println("Boosting!");
        }
    }

    
}