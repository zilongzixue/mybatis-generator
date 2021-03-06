package com.example.demo.entity;

import java.io.Serializable;

public class UserInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.id
     *
     * @mbg.generated Mon Mar 18 16:02:54 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_name
     *
     * @mbg.generated Mon Mar 18 16:02:54 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.password
     *
     * @mbg.generated Mon Mar 18 16:02:54 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.phone
     *
     * @mbg.generated Mon Mar 18 16:02:54 CST 2019
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_info
     *
     * @mbg.generated Mon Mar 18 16:02:54 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.id
     *
     * @return the value of user_info.id
     *
     * @mbg.generated Mon Mar 18 16:02:54 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.id
     *
     * @param id the value for user_info.id
     *
     * @mbg.generated Mon Mar 18 16:02:54 CST 2019
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_name
     *
     * @return the value of user_info.user_name
     *
     * @mbg.generated Mon Mar 18 16:02:54 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_name
     *
     * @param userName the value for user_info.user_name
     *
     * @mbg.generated Mon Mar 18 16:02:54 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.password
     *
     * @return the value of user_info.password
     *
     * @mbg.generated Mon Mar 18 16:02:54 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.password
     *
     * @param password the value for user_info.password
     *
     * @mbg.generated Mon Mar 18 16:02:54 CST 2019
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.phone
     *
     * @return the value of user_info.phone
     *
     * @mbg.generated Mon Mar 18 16:02:54 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.phone
     *
     * @param phone the value for user_info.phone
     *
     * @mbg.generated Mon Mar 18 16:02:54 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}