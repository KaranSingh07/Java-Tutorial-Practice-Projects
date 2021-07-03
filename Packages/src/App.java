import ocean.Fish;                  // Importing Fish class from ocean package
import ocean.Seahorse;
import ocean.plants.Waterlilly;     // Importing class from plants subpackage of ocean
// import ocean.*;                  // Wildcard .* to import all classes of a package, it will ONLY import
                                    // classes inside ocean and DO NOT import any subpackage

public class App {
    public static void main(String args[]) {
        Fish fish = new Fish();
        Seahorse seahorse = new Seahorse();
        Waterlilly waterlilly = new Waterlilly();
    }
}
