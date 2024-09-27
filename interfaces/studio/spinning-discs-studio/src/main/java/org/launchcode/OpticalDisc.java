package org.launchcode;

public interface OpticalDisc {

    void spin();
    void storeData();
    void laserEtchData(String data);
    String laserReadData();
    void recordMetaData();

}
