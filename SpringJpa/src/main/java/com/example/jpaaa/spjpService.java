package com.example.jpaaa;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//annotation for service class
@Service
public class spjpService {

    @Autowired
    JPARepo js;

    //this method inserts data into DB
    public employe insertData(employe e) {
        return js.save(e);
    }

    //this method brings all the data from DB of emp table
    public List<employe> getData() {
        return js.findAll();
    }
    //this method brings the data of employe from DB from a particular ID
    public Optional<employe> getDataById(long id) {
        return js.findById(id);
    }

    //this method brings the Username from DB of a particular ID
    public String getUserNameById(long id) {
        return js.getUsername(id);
    }

    //this method brings the Phone number from DB of a particular ID
    public String getPhoneNumberById(long id) {
        return js.getPhonenumber(id);
    }

    //this method brings the email id from DB of a particular ID
    public String getEmailIdById(long id) {
        return js.getEmailId(id);
    }
    
    //this method checks whether usename exists in DataBase
    public boolean isUsernameExists(String username) {
        return js.existsByUsername(username);
    }

    //this method checks whether phonenumber exists in DataBase
    public boolean isPhoneNumberExists(String phonenumber) {
        return js.existsByPhonenumber(phonenumber);
    }

    //this method checks whether emailId exists in DataBase
    public boolean isEmailIdExists(String email) {
        return js.existsByEmailId(email);
    }
}
