package com.fbi.plugins.xStreamDemo.Objects;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * User: cbates
 */
@XStreamAlias("billto")
public class BillToAddress {
    @XStreamAlias("billAddr1")
    private String billAddr1;
    @XStreamAlias("billAddressee")
    private String billAddressee;
    @XStreamAlias("billCity")
    private String billCity;
    @XStreamAlias("billState")
    private String billState;
    @XStreamAlias("billZip")
    private int billZip;

    public String getBillAddr1() {
        return billAddr1;
    }

    public void setBillAddr1(String billAddr1) {
        this.billAddr1 = billAddr1;
    }

    public String getBillAddressee() {
        return billAddressee;
    }

    public void setBillAddressee(String billAddressee) {
        this.billAddressee = billAddressee;
    }

    public String getBillCity() {
        return billCity;
    }

    public void setBillCity(String billCity) {
        this.billCity = billCity;
    }

    public String getBillState() {
        return billState;
    }

    public void setBillState(String billState) {
        this.billState = billState;
    }

    public int getBillZip() {
        return billZip;
    }

    public void setBillZip(int billZip) {
        this.billZip = billZip;
    }
}
