package Subd_labs.service.serviceInterfaces;

import Subd_labs.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface PostService {
    Post addPost(Post post);
    void delete(int id);
    Optional<Post> getById(int id);
    Post editPost(Post post);
    List<Post> getAll();
}
