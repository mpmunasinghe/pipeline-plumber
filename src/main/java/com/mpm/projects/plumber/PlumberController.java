package com.mpm.projects.plumber;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlumberController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/plumber")
	public Plumb plumber(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Plumb(counter.incrementAndGet(), String.format(template, name));
	}
}
