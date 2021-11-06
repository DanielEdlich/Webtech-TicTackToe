package htw.berlin.webtech.ticktacktoe.persistence;

import htw.berlin.webtech.ticktacktoe.api.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    List<User> findAllByName(String Name);

}
