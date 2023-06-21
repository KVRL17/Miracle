package com.example.jpaa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.jpaa.user;

@Repository
public interface UserRepository extends CrudRepository<user, Integer>  {
}
