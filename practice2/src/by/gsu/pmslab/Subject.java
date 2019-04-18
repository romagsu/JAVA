package by.gsu.pmslab;

public class Subject {
    private final static String name = "wire";
    private Material material;
    private double volume;

    public Subject(Material material, double volume){
        this.material = material;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public double getMass(){
        return material.getDensity()*volume;
    }

    public String toString(){
        return name + ";"+ material + ";" + volume + ";" + getMass();
    }
}
