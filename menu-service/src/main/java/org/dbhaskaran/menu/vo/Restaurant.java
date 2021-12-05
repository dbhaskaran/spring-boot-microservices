package org.dbhaskaran.menu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private long restaurantId;
    private String restaurantName;
    private String restaurantLocation;
    private int rating;
}
