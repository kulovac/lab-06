package com.example.code;

/**
 * This is a class that defines a City.
 */
public class City {
    /**
     * The name of the city
     */
    private String city;
    /**
     * The name of the province the city belongs to
     */
    private String province;

    /**
     * @param city
     *      The name of the city
     * @param province
     *      The name of the province
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * @return the name of this city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     *      The name of the city to set this cities name to
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province name
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     *      The name of the province to set this city to
     */
    public void setProvince(String province) {
        this.province = province;
    }

}

