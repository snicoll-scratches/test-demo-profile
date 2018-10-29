package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Stephane Nicoll
 */
@Repository
@Profile("!repository")
public class DemoRepository {

	public String findById(String id) {
		return "yolo";
	}

}
