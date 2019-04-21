package com.example.android.holaspunk;

public class Users
{
    int userscount=0;
    String id,firstname,lastname,email,username,password,phonenumber;
    String location;
    public double lat ,lon ;
    //String trustedcontacts[]=new String[5];

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setlatlong(double lat , double lon){
        this.lat = lat ;
        this.lon = lon ;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /*public String[] getTrustedContacts() {
        return trustedcontacts;
    }

    public void setTrustedContacts(String[] trustedcontacts) {
        this.trustedcontacts = trustedcontacts;
    }*/

    public void setCount(int userscount) {
        this.userscount = userscount;
    }


}

