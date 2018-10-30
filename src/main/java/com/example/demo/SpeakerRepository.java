package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Stephane Nicoll
 */
@Repository
@Profile("!repository")
public interface SpeakerRepository extends CrudRepository<Speaker, Long> {


}
