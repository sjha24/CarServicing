import java.util.HashMap;

public interface CarService {
    HashMap<String,Pair>getServicePrice();
    int basicServiceing();
    int engineFixing();
    int clutchFixing();
    int breakFixing();
    int gearFixing();
}
