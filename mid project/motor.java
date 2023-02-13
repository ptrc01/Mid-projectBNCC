import javax.sound.sampled.SourceDataLine;

public class motor extends vehicle{
    
    private int helm, price;
    
    public motor (String jenis, String brand, String name, String license, int speed, int gas, int wheel, String tipe, int helm){
        super(jenis, brand, name, license, speed, gas, wheel, tipe);
        this.helm = helm;
    }

    public int getHelm(){
        return helm;
    }

    public void show() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Name: " + getName());
        System.out.println("License Number: " + getLicense());
        System.out.println("Top Speed: " + getSpeed());
        System.out.println("Gas Capacity: " + getGas());
        System.out.println("Wheel: " + getWheel());
        System.out.println("Type: " + getTipe());
        System.out.println("Entertainment System:" + getHelm());
        special();
    }
    
    public void special(){
        System.out.println (getName() + "is standing!");
    }
}
