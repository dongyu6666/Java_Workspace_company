package pojo;

public class PlatformLei {
    private String platform_name;
    private String class_name;
    private String cartype_name;

    public PlatformLei() {
    }

    public PlatformLei(String platform_name, String class_name, String cartype_name) {
        this.platform_name = platform_name;
        this.class_name = class_name;
        this.cartype_name = cartype_name;
    }

    public String getPlatform_name() {
        return platform_name;
    }

    public void setPlatform_name(String platform_name) {
        this.platform_name = platform_name;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getCartype_name() {
        return cartype_name;
    }

    public void setCartype_name(String cartype_name) {
        this.cartype_name = cartype_name;
    }

    @Override
    public String toString() {
        return "PlatformLei{" +
                "platform_name='" + platform_name + '\'' +
                ", class_name='" + class_name + '\'' +
                ", cartype_name='" + cartype_name + '\'' +
                '}';
    }
}
