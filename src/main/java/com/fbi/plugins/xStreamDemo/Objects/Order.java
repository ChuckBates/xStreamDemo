package com.fbi.plugins.xStreamDemo.Objects;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * User: cbates
 */
@XStreamAlias("order")
public class Order {
    @XStreamAlias("orderId")
    private int orderId;
    @XStreamAlias("customer_type")
    private int customer_type;
    @XStreamAlias("po")
    private String po;
    @XStreamAlias("shipMethod")
    private String shipMethod;
    @XStreamAlias("billConvReq")
    private boolean billConvReq;
    @XStreamAlias("show_price")
    private boolean show_price;
    @XStreamAlias("shipto")
    private ShipToAddress shipTo;
    @XStreamAlias("billto")
    private BillToAddress billTo;

    @XStreamImplicit
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

    public String getShipMethod() {
        return shipMethod;
    }

    public void setShipMethod(String shipMethod) {
        this.shipMethod = shipMethod;
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
