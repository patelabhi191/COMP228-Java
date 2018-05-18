import java.util.Scanner;

public class Patient {
    int patient_id;
    int postalcode;

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

    //Multiple Constructor
    public Patient (int id, String fname, String lname, String address, String city, String province, int pc)
    {
        this.patient_id=id;
        this.firstname=fname;
        this.lastname=lname;
        this.address=address;
        this.city=city;
        this.province=province;
        this.postalcode=pc;
    }

    public Patient ()
    {
        return;
    }

    //String to return details in formatted manner
    String all;
    //Patient info method
    String getPatientinfo ()
    {
        all= "Patience Info.\nName- " + patient_id + "\nFirst Name- " + firstname + "\nLast Name- "+ lastname + "\nAddress- "+ address + "\nCity- "+ city + "\nProvince- " + province + "\nPostal Code- " + postalcode;
        return all;
    }
}
