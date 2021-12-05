package org.dbhaskaran.restaurant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long restaurantId;
	private String restaurantName;
	private String restaurantLocation;
	private int rating;

}
