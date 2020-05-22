package Subd_labs.repository;

import Subd_labs.entity.Clients;
import Subd_labs.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}