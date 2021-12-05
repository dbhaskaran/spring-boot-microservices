package org.dbhaskaran.restaurant.controller;

import org.dbhaskaran.restaurant.entity.Restaurant;
import org.dbhaskaran.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
@Slf4j
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	@PostMapping("/")
	public Restaurant saveRestaurant(@RequestBody Restaurant restaurant) {
		log.info("Saving Restaurant to DB");
		return restaurantService.saveRestaurant(restaurant);
	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public Restaurant findRestaurantById(@PathVariable(value="id") long restaurantId){
		return restaurantService.findRestaurantById(restaurantId);
	}

	@GetMapping(value = "/", produces = "application/json")
	public List<Restaurant> findAllRestaurants(){
		return restaurantService.findAllRestaurants();
	}

}
