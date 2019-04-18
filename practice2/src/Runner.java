import by.gsu.pmslab.Material;
import by.gsu.pmslab.Subject;

public class Runner {

    public static void main(String[] args){
        System.out.println(Material.STEEL + "\n");
        Subject wire=new Subject(Material.STEEL,0.03);
        System.out.println(wire);
        wire.setMaterial(Material.COPPER);
        System.out.println("The mass of copper wire is " + wire.getMass());
    }

}
