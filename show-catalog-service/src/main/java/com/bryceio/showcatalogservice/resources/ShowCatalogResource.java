package com.bryceio.showcatalogservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bryceio.showcatalogservice.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class ShowCatalogResource {
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
		
		return Collections.singletonList(
				new CatalogItem("breaking bad", "suspense",75, 4)
				);
			
	}

}
