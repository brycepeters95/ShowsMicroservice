package com.bryceio.ratingsdataservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bryceio.ratingsdataservice.model.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

	@RequestMapping("/{showId}")
	public Rating getRating(@PathVariable("showId") String showId) {
		return new Rating(showId, 4);
	}
}
