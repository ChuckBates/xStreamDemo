package Objects;

/**
 * User: cbates
 */
public class ShipToAddress {
    private String shipAddressee;
    private String shipAddr1;
    private String shipCity;
    private String shipCountry;
    private boolean shipIsResidential;
    private String shipState;
    private int shipZip;

    public String getShipAddressee() {
        return shipAddressee;
    }

    public void setShipAddressee(String shipAddressee) {
        this.shipAddressee = shipAddressee;
    }

    public String getShipAddr1() {
        return shipAddr1;
    }

    public void setShipAddr1(String shipAddr1) {
        this.shipAddr1 = shipAddr1;
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

    public int getShipZip() {
        return shipZip;
    }

    public void setShipZip(int shipZip) {
        this.shipZip = shipZip;
    }
}
