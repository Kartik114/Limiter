package com.example.limiter;

public class User {

    public int uid;
    public String first_name;
    public String last_name;
    public String email;
    public String mobileNo;
    public String password;

    public User()
    {
        uid =-1;
        first_name="";
        last_name="";
        email="";
        mobileNo="";
        password="";

    }

    public User( int uid,String first_name, String last_name, String email, String mobileNo, String password)
    {
        this.uid = uid;
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
        this.mobileNo=mobileNo;
        this.password=password;
    }


}
