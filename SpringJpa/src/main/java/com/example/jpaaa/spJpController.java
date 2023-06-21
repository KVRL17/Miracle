package com.example.jpaaa;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class spJpController {

    @Autowired
    private spjpService jc;

    @PostMapping("/insert")
    public ResponseEntity<String> insert(@RequestBody employe e) {
// Check if username already exists in the database
        String username = e.getuname();
        boolean usernameExists = jc.isUsernameExists(username);
        if (usernameExists) {
            return ResponseEntity.badRequest().body("Username already exists");
        }
// Check if username already exists in the database
        String phonenumber = e.getphn_no();
        boolean PhoneNumberExists = jc.isPhoneNumberExists(phonenumber);
        if (PhoneNumberExists) {
            return ResponseEntity.badRequest().body("Phone Number already exists");
        }

// Check if username already exists in the database
        String emailID = e.getEmailId();
        boolean emailIdExists = jc.isEmailIdExists(emailID);
        if (emailIdExists) {
            return ResponseEntity.badRequest().body("Email Id already exists");
        }

// Proceed with inserting the data into the database
        employe insertedemploye = jc.insertData(e);
        if (insertedemploye != null) {
            return ResponseEntity.ok("User Registered successfully");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to Register User,check with the details");
        }
}



    @GetMapping("/retrieve")
    public List<employe> putData() {
        return jc.getData();
    }

    @GetMapping("/retrieveById/{id}")
    public Optional<employe> putDataById(@PathVariable("id") long id) {
        return jc.getDataById(id);
    }

    @GetMapping("/retrieveName/{id}")
    public String putNameById(@PathVariable("id") long id) {
        return jc.getUserNameById(id);
    }

    @GetMapping("/retrievePhoneNumber/{id}")
    public String putPhoneNumberById(@PathVariable("id") long id) {
        return jc.getPhoneNumberById(id);
    }

    @GetMapping("/retrieveEmailId/{id}")
    public String putEmailIdById(@PathVariable("id") long id) {
        return jc.getEmailIdById(id);
    }
}