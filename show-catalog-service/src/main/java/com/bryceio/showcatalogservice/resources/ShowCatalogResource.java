package com.bryceio.showcatalogservice.resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.bryceio.showcatalogservice.models.CatalogItem;
import com.bryceio.showcatalogservice.models.Rating;
import com.bryceio.showcatalogservice.models.Show;

@RestController
@RequestMapping("/catalog")
public class ShowCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
		
		
		List<Rating> ratings = Arrays.asList(
				new Rating("1234", 4),
				new Rating("4567",3)
		);
		
		return ratings.stream().map(rating -> {
//			Show show = restTemplate.getForObject("http://localhost:8082/shows/"+rating.getShowID(), Show.class);	
			webClientBuilder.build()
			.get()
			.uri("http://localhost:8082/shows/"+rating.getShowID())
			.retrieve()
			.bodyToMono(Show.class)
			.block();
			
			return new CatalogItem(show.getName(), "suspense",75, rating.getRating());
		})
				.collect(Collectors.toList());
		
			
	}

}
