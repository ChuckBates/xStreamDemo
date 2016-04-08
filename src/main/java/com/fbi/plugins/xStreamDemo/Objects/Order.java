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
    @XStreamAlias("shipping_instr")
    private String shipping_instr;
    @XStreamAlias("shipMethod")
    private String shipMethod;
    @XStreamAlias("billConvReq")
    private boolean billConvReq;
    @XStreamAlias("show_price")
    private boolean show_price;
    @XStreamAlias("shipto")
    private ShipToAddress shipto;
    @XStreamAlias("billto")
    private BillToAddress billto;
    @XStreamAlias("payment_method")
    private String payment_method;

    @XStreamImplicit(itemFieldName = "items")
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

    public String getShipping_instr() {
        return shipping_instr;
    }

    public void setShipping_instr(String shipping_instr) {
        this.shipping_instr = shipping_instr;
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

    public ShipToAddress getShipto() {
        return shipto;
    }

    public void setShipto(ShipToAddress shipto) {
        this.shipto = shipto;
    }

    public BillToAddress getBillto() {
        return billto;
    }

    public void setBillto(BillToAddress billto) {
        this.billto = billto;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private String getItemsString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Item item : items) {
            stringBuilder.append(item.toString());
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Order:" + "\n" +
                "   orderId = " + orderId + "\n" +
                "   customer_type = " + customer_type + "\n" +
                (po != null ? ("   po = '" + po + '\'' + "\n") : "") +
                (shipping_instr != null ? ("   shipping_instr = '" + shipping_instr + '\'' + "\n") : "") +
                (shipMethod != null ? ("   shipMethod = '" + shipMethod + '\'' + "\n") : "") +
                "   billConvReq = " + billConvReq + "\n" +
                "   show_price = " + show_price + "\n" +
                (shipto != null ? ("   shipto: "  + "\n" + shipto.toString()) : "") +
                (billto != null ? ("   billto: "  + "\n" + billto.toString()) : "") +
                (payment_method != null ? ("   payment_method = '" + payment_method + '\'' + "\n") : "") +
                "   items: "  + "\n" + getItemsString() +
                "";
    }
}
