import java.io.File;
import java.io.FileNotFoundException;

public class Main {


    public static void main(String[] args) throws FileNotFoundException{
        InputParser parser = new InputParser(new File("a_example.in"));
        //parser.printParameters();
        //parser.printRides();
        RoadMap map = new RoadMap(parser);
        map.populate();
        map.printMap();
        map.ride(parser.getInput());
        map.printMap();
    }





}
