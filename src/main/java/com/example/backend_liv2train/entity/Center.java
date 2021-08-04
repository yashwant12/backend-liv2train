package com.example.backend_liv2train.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="center")
public class Center {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Length(max = 40, message = "The field must be less than 40 characters")
    @Column(name="center_name")
    private String centerName;


    @Pattern(regexp="^[a-zA-Z0-9]{12}", message="only 12 character alphanumeric")
    @Column(name="center_code")
    private String centerCode;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="address_id")
    private Address address;

    @Column(name="student_capacity")
    private int studentCapacity;

    @Column(name="courses_offered")
    private String coursesOffered;

    @Column(name="created_on")
    private long createdOn;

    @Email(message = "must enter valid email")
    @Column(name="contact_email")
    private String email;

    @Pattern(regexp="(^$|[0-9]{10})", message = "must enter 10 digit valid phone number")
    @Column(name="contact_phone")
    private String phone;

    public Center(){

    }

    public Center(String centerName, String centerCode, int studentCapacity, String coursesOffered, long createdOn, String email, String phone) {
        this.centerName = centerName;
        this.centerCode = centerCode;
        this.studentCapacity = studentCapacity;
        this.coursesOffered = coursesOffered;
        this.createdOn = createdOn;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public String getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(String coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Center{" +
                "id=" + id +
                ", centerName='" + centerName + '\'' +
                ", centerCode='" + centerCode + '\'' +
                ", address=" + address +
                ", studentCapacity=" + studentCapacity +
                ", coursesOffered='" + coursesOffered + '\'' +
                ", createdOn=" + createdOn +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
