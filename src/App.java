public class App {

    public static void main(String[] args) {
        Service fakeMapService = new Service("Fake Map Service");
        Service fakeMarketingService = new Service("Fake Marketing Service");
        Service fakeSalesService = new Service("Fake Sales Service");

        Customer c1 = new Customer(fakeMapService); 
        Customer c2 = new Customer(fakeMarketingService); 
        Customer c3 = new Customer(fakeSalesService); 
        
        c1.viewCustomerService();
        c2.viewCustomerService();
        c3.viewCustomerService();

    }
}