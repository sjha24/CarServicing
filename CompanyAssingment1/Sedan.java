import java.util.HashMap;

public class Sedan implements CarService {
    HashMap<String,Pair>map;

    public HashMap<String,Pair>getServicePrice(){
        map = new HashMap<>();
        map.put("BS01",new Pair("Basic Servicing", 4000));
        map.put("EF01",new Pair("Engine Fixing", 8000));
        map.put("CF01",new Pair("Clutch Fixing", 4000));
        map.put("BF01",new Pair("Brake Fixing", 1500));
        map.put("GF01",new Pair("Gear Fixing", 6000));
        return map;
    }
    @Override
    public int basicServiceing(){
        return map.get("BS01").getPrice();
    }

    @Override
    public int engineFixing(){
        return map.get("EF01").getPrice();
    }

    @Override
    public int clutchFixing(){
        return map.get("CF01").getPrice();
    }

    @Override
    public int breakFixing(){
        return map.get("BF01").getPrice();
    }

    @Override
    public int gearFixing(){
        return map.get("BF01").getPrice();
    }
}
