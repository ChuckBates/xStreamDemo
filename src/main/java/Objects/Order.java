package Objects;

import java.util.List;

/**
 * User: cbates
 */
public class Order {
    private int orderId;
    private int customer_type;
    private String po;
    private String shipMetod;
    private boolean billConvReq;
    private boolean show_price;
    private ShipToAddress shipTo;
    private BillToAddress billTo;
    private List<Item> items;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(int customer_type) {
        this.customer_type = customer_type;
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }

    public String getShipMetod() {
        return shipMetod;
    }

    public void setShipMetod(String shipMetod) {
        this.shipMetod = shipMetod;
    }

    public boolean isBillConvReq() {
        return billConvReq;
    }

    public void setBillConvReq(boolean billConvReq) {
        this.billConvReq = billConvReq;
    }

    public boolean isShow_price() {
        return show_price;
    }

    public void setShow_price(boolean show_price) {
        this.show_price = show_price;
    }

    public ShipToAddress getShipTo() {
        return shipTo;
    }

    public void setShipTo(ShipToAddress shipTo) {
        this.shipTo = shipTo;
    }

    public BillToAddress getBillTo() {
        return billTo;
    }

    public void setBillTo(BillToAddress billTo) {
        this.billTo = billTo;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
