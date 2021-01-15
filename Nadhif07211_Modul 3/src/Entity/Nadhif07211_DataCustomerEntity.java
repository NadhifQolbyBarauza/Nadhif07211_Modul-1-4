package Entity;

public class Nadhif07211_DataCustomerEntity {
    private Nadhif07211_CustomerEntity customer;
    private int indexService; 

    public Nadhif07211_DataCustomerEntity(int indexService, Nadhif07211_CustomerEntity customer) {
        this.indexService = indexService;
        this.customer = customer;
    }

      public Nadhif07211_CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(Nadhif07211_CustomerEntity customer) {
        this.customer = customer;
    }

    public int getIndexService() {
        return indexService;
    }

    public void setIndexService(int indexService) {
        this.indexService = indexService;
    }
}