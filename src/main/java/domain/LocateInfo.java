package domain;

/**
 * @Author: 李旺旺
 * @Date: 2021/3/30 21:07
 * @Description: 位置信息实体类
 */
public class LocateInfo {
    private int locateId;                   //位置id
    private String locateName;              //位置名称
    private String LongitudeAndLatitude;    //经纬度

    public LocateInfo() {}

    public LocateInfo(String locateName, String longitudeAndLatitude) {
        this.locateName = locateName;
        LongitudeAndLatitude = longitudeAndLatitude;
    }

    public int getLocateId() {
        return locateId;
    }

    public void setLocateId(int locateId) {
        this.locateId = locateId;
    }

    public String getLocateName() {
        return locateName;
    }

    public void setLocateName(String locateName) {
        this.locateName = locateName;
    }

    public String getLongitudeAndLatitude() {
        return LongitudeAndLatitude;
    }

    public void setLongitudeAndLatitude(String longitudeAndLatitude) {
        LongitudeAndLatitude = longitudeAndLatitude;
    }

    @Override
    public String toString() {
        return "LocateInfo{" +
                "locateId=" + locateId +
                ", locateName='" + locateName + '\'' +
                ", LongitudeAndLatitude='" + LongitudeAndLatitude + '\'' +
                '}';
    }
}
