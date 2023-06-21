package com.example.jpaaa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface JPARepo extends JpaRepository<employe, Long> {


    @Query("select e.username from Employee e  where e.id = ?1")
    String getUsername(long id);

    @Query("select e.phonenumber from Employee e  where e.id = ?1")
    String getPhonenumber(long id);

    @Query("select e.emailId from Employee e  where e.id = ?1")
    String getEmailId(long id);

    boolean existsByUsername(String username);
    boolean existsByPhonenumber(String phoneNumber);
    boolean existsByEmailId(String emailid);

}
