package com.bryceio.showinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bryceio.showinfoservice.models.Show;

@RestController
@RequestMapping("/shows")
public class ShowResource {

	@RequestMapping("/{showId}")
	public Show getShowInfo(@PathVariable("showId")String showId) {
		return new Show(showId, "Test");
	}
}
