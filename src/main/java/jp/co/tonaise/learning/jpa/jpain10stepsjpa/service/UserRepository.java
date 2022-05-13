package jp.co.tonaise.learning.jpa.jpain10stepsjpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.tonaise.learning.jpa.jpain10stepsjpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
