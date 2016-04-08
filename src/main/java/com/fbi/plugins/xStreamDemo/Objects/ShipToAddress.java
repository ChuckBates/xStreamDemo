package com.fbi.plugins.xStreamDemo.Objects;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * User: cbates
 */
@XStreamAlias("shipto")
public class ShipToAddress {
    @XStreamAlias("shipAddressee")
    private String shipAddressee;
    @XStreamAlias("shipAttention")
    private String shipAttention;
    @XStreamAlias("shipAddr1")
    private String shipAddr1;
    @XStreamAlias("shipAddr2")
    private String shipAddr2;
    @XStreamAlias("shipCity")
    private String shipCity;
    @XStreamAlias("shipCountry")
    private String shipCountry;
    @XStreamAlias("shipIsResidential")
    private boolean shipIsResidential;
    @XStreamAlias("shipState")
    private String shipState;
    @XStreamAlias("shipZip")
    private String shipZip;
    @XStreamAlias("shipPhone")
    private String shipPhone;

    public String getShipAddressee() {
        return shipAddressee;
    }

    public void setShipAddressee(String shipAddressee) {
        this.shipAddressee = shipAddressee;
    }

    public String getShipAttention() {
        return shipAttention;
    }

    public void setShipAttention(String shipAttention) {
        this.shipAttention = shipAttention;
    }

    public String getShipAddr1() {
        return shipAddr1;
    }

    public void setShipAddr1(String shipAddr1) {
        this.shipAddr1 = shipAddr1;
    }

    public String getShipAddr2() {
        return shipAddr2;
    }

    public void setShipAddr2(String shipAddr2) {
        this.shipAddr2 = shipAddr2;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public boolean isShipIsResidential() {
        return shipIsResidential;
    }

    public void setShipIsResidential(boolean shipIsResidential) {
        this.shipIsResidential = shipIsResidential;
    }

    public String getShipState() {
        return shipState;
    }

    public void setShipState(String shipState) {
        this.shipState = shipState;
    }

    public String getShipZip() {
        return shipZip;
    }

    public void setShipZip(String shipZip) {
        this.shipZip = shipZip;
    }

    public String getShipPhone() {
        return shipPhone;
    }

    public void setShipPhone(String shipPhone) {
        this.shipPhone = shipPhone;
    }

    @Override
    public String toString() {
        return  (shipAddressee != null ? ("      shipAddressee = '" + shipAddressee + '\''  + "\n") : "") +
                (shipAttention != null ? ("      shipAttention = '" + shipAttention + '\''  + "\n") : "") +
                (shipAddr1 != null ? ("      shipAddress1 = '" + shipAddr1 + '\''  + "\n") : "") +
                (shipAddr2 != null ? ("      shipAddress2 = '" + shipAddr2 + '\''  + "\n") : "") +
                (shipCity != null ? ("      shipCity = '" + shipCity + '\''  + "\n") : "") +
                (shipCountry != null ? ("      shipCountry = '" + shipCountry + '\''  + "\n") : "") +
                "      shipIsResidential = " + shipIsResidential  + "\n" +
                (shipState != null ? ("      shipState = '" + shipState + '\''  + "\n") : "") +
                (shipZip != null ? ("      shipZip = '" + shipZip + '\''  + "\n") : "") +
                (shipPhone != null ? ("      shipPhone = '" + shipPhone + '\''  + "\n") : "") +
                "";
    }
}
