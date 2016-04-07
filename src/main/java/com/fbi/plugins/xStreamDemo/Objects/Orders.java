package com.fbi.plugins.xStreamDemo.Objects;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * User: cbates
 */
@XStreamAlias("orders")
public class Orders {
    @XStreamImplicit(itemFieldName = "order")
    private List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
