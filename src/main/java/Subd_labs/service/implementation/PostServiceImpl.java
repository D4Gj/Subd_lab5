package Subd_labs.service.implementation;

import Subd_labs.entity.Post;
import Subd_labs.repository.PostRepository;
import Subd_labs.service.serviceInterfaces.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository PostRepository;
    @Override
    public Post addPost(Post post){
        Post savedPost = PostRepository.saveAndFlush(post);
        return savedPost;
    }
    @Override
    public void delete(int id){
        PostRepository.deleteById(id);
    }
    @Override
    public Optional<Post> getById(int id){
        return PostRepository.findById(id);
    }
    @Override
    public Post editPost(Post post){
        return PostRepository.saveAndFlush(post);
    }
    @Override
    public List<Post> getAll() {
        return PostRepository.findAll();
    }
}
