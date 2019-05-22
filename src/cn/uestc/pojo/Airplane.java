package cn.uestc.pojo;

/**
 * @Auther: cmz
 * @Date: 2019/5/22
 * @Description: cn.uestc.pojo
 * @version: 1.0
 */
public class Airplane {
    private Integer id;
    private String airno;
    private Integer time;
    private Double price;
    private Airport takePort;
    private Airport landPort;

    @Override
    public String toString() {
        return "Airplane{" +
                "id=" + id +
                ", airno='" + airno + '\'' +
                ", time=" + time +
                ", price=" + price +
                ", takePort=" + takePort +
                ", landPort=" + landPort +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAirno() {
        return airno;
    }

    public void setAirno(String airno) {
        this.airno = airno;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Airport getTakePort() {
        return takePort;
    }

    public void setTakePort(Airport takePort) {
        this.takePort = takePort;
    }

    public Airport getLandPort() {
        return landPort;
    }

    public void setLandPort(Airport landPort) {
        this.landPort = landPort;
    }
}
