package jb.springbootlearn.socialmedia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepository extends CrudRepository< SocialMedia, String>{

}
