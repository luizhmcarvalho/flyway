package com.example.flywaydemo.repository;

//import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.flywaydemo.domain.User;

public interface IUserRepository extends PagingAndSortingRepository<User, Long> {


}