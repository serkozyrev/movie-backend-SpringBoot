package collegeproject.moviebackend.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<UserModel, String> {


    UserModel findByUsername(String username);
}
