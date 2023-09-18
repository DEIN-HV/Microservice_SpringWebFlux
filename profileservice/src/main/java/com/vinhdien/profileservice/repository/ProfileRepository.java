package com.vinhdien.profileservice.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.vinhdien.profileservice.data.Profile;

public interface ProfileRepository extends ReactiveCrudRepository<Profile, Long> {

}
