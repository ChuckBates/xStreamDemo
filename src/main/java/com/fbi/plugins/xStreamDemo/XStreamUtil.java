package com.fbi.plugins.xStreamDemo;

import com.fbi.plugins.xStreamDemo.Objects.Items;
import com.fbi.plugins.xStreamDemo.Objects.Order;
import com.fbi.plugins.xStreamDemo.Objects.Orders;
import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

/**
 * User: cbates
 */
public class XStreamUtil {

    public static List<Order> convertXmlFile(File file) throws FileNotFoundException {
        List<Order> orderList;

        FileReader fileReader = new FileReader(file.getAbsoluteFile());
        XStream xStream = new XStream();

        xStream.alias("orders", com.fbi.plugins.xStreamDemo.Objects.Orders.class);
        xStream.addImplicitCollection(Orders.class, "orders");
        xStream.alias("order", com.fbi.plugins.xStreamDemo.Objects.Order.class);

        xStream.alias("items", com.fbi.plugins.xStreamDemo.Objects.Items.class);
        xStream.addImplicitCollection(Items.class, "items");
        xStream.alias("item", com.fbi.plugins.xStreamDemo.Objects.Item.class);

        orderList = ((Orders) xStream.fromXML(fileReader)).getOrders();

        return orderList;
    }
}
