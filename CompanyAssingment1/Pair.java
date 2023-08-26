public class Pair {
    private String service;
    private int price;
    public Pair(String service, int price) {
        this.service = service;
        this.price = price;
    }
    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
