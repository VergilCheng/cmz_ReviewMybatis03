package cn.uestc.pojo;

/**
 * @Auther: cmz
 * @Date: 2019/5/22
 * @Description: cn.uestc.pojo
 * mybatis04能力提升，机场类
 * @version: 1.0
 */
public class Airport {
    private Integer id;
    private String portName;
    private String cityName;

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", portName='" + portName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
