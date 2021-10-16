package org.dbhaskaran.restaurant.service;

import org.dbhaskaran.restaurant.entity.Restaurant;
import org.dbhaskaran.restaurant.repos.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepository;

	public Restaurant saveRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	public Restaurant findRestaurantById(Long restaurantId) {
		return restaurantRepository.findById(restaurantId).get();
	}

    public List<Restaurant> findAllRestaurants() {
		return restaurantRepository.findAll();
    }
}
