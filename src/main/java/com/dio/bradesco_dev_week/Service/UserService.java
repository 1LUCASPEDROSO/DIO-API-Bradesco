package com.dio.bradesco_dev_week.Service;

import com.dio.bradesco_dev_week.Domain.Entity.User;

public interface UserService {
     User findById(Long id);
     User create(User userCreate);
}
