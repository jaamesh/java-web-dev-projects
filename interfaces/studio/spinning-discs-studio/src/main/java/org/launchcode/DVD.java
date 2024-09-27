package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String data) {
        super(data);
    }

    @Override
    public void spin() {

    }

    @Override
    public void storeData() {

    }

    @Override
    public void laserEtchData(String data) {
        this.data = "DVDLaserEtchEncoding: " + data;
    }

    @Override
    public String laserReadData()  {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        return data;
    }

    @Override
    public void recordMetaData() {

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
