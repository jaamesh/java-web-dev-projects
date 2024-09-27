package org.launchcode;



public class CD extends BaseDisc implements OpticalDisc {
    public CD(String data) {
        super(data);
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void spin() {

    }

    @Override
    public void storeData() {

    }

    @Override
    public void laserEtchData(String data) {
        this.data = this.data + "CDLaserEtchEncoding: " + data;
    }

    @Override
    public String laserReadData()  {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        return data;
    }

    @Override
    public void recordMetaData() {

    }

    @Override
    public void hitLovedOneInHead() {
        //super.hitLovedOneInHead();
        System.out.println("That really hurt!");
    }
}
