public class Customer {

    Service service;
    public Customer(Service service) {
        this.service = service; 
    }

    public String viewCustomerService() {
        System.out.println(service.getName());
        return service.getName();

    }
}