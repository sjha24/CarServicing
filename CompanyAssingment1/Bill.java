import java.util.List;

public class Bill {
    private CarService carService;
    private List<String>serviceCodes;
    private StringBuilder sb = new StringBuilder();
    private int totalBill = 0;
    public Bill(CarService carService, List<String> serviceCodes) {
        this.carService = carService;
        this.serviceCodes = serviceCodes;
    }
    public CarService getCarService() {
        return carService;
    }
    public void setCarService(CarService carService) {
        this.carService = carService;
    }
    public List<String> getServiceCodes() {
        return serviceCodes;
    }
    public void setServiceCodes(List<String> serviceCodes) {
        this.serviceCodes = serviceCodes;
    }
    public StringBuilder getSb() {
        return sb;
    }
    public void setSb(StringBuilder sb) {
        this.sb = sb;
    }
    public int getTotalBill() {
        return totalBill;
    }
    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public String calculateBill(){
        if(carService instanceof SUV){
            for(String s : serviceCodes){
                sb.append("Charges for "+carService.getServicePrice().get(s).getService()+" - "+carService.getServicePrice().get(s).getPrice());
                sb.append("\n");
                totalBill+=carService.getServicePrice().get(s).getPrice();
            }
        }else if(carService instanceof Hatchback){
            for(String s : serviceCodes){
                sb.append("Charges for "+carService.getServicePrice().get(s).getService()+" - "+carService.getServicePrice().get(s).getPrice());
                sb.append("\n");
                totalBill+=carService.getServicePrice().get(s).getPrice();
            }
        }else if(carService instanceof Sedan){
            for(String s : serviceCodes){
                sb.append("Charges for "+carService.getServicePrice().get(s).getService()+" - "+carService.getServicePrice().get(s).getPrice());
                sb.append("\n");
                totalBill+=carService.getServicePrice().get(s).getPrice();
            }
        }
        // return totalBill;
        
        if(totalBill>10000){
            sb.append("Charges for complimentary cleaning (Free of cost) - 0");
            sb.append("\n");        
            sb.append("Total Bill  - "+totalBill);
            return sb.toString();
        }else{
            sb.append("\n");
            sb.append("Total Bill - "+ totalBill);
            return sb.toString();
        }
    }
}
