package Assignment1;
import java.util.Scanner;

public class Patient {
    int patient_id;

    //First name G and S
    String firstname;
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    //Last name G and S
    String lastname;
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //City G and S
    String city;
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    //Province G and S
    String province;
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }

    //Address G and S
    String address;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    //Postal Code
    String postalcode;
    public String getPostalcode() {
        return postalcode;
    }
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    //Constructor
    public Patient (int id, String fname, String lname, String address, String city, String province, String pc)
    {
        this.patient_id=id;
        this.firstname=fname;
        this.lastname=lname;
        this.address=address;
        this.city=city;
        this.province=province;
        this.postalcode=pc;
    }

    //as Mentioned default cons
    public Patient() { }

    //String to return details in formatted manner
    String all;

    //Patient info method
    String getPatientinfo ()
    {
        all= "\nPatience Info.\nId- " + patient_id + "\nName- " + firstname + " "+ lastname + "\nAddress- "+ address + "\n"+ city + "\n" + province + "\n" + postalcode;
        return all;
    }
}
