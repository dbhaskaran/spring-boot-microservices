package org.dbhaskaran.menu.service;

import org.dbhaskaran.menu.entity.MenuItem;
import org.dbhaskaran.menu.repos.MenuItemRepository;
import org.dbhaskaran.menu.vo.ResponseTemplateVo;
import org.dbhaskaran.menu.vo.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MenuItemService {
    @Autowired
    private MenuItemRepository menuItemRepository;
    @Autowired
    private RestTemplate restTemplate;

    public MenuItem save(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public ResponseTemplateVo findMenuItemWithRestaurant(long menuItemId) {
        ResponseTemplateVo resp = new ResponseTemplateVo();
        MenuItem menuItem = menuItemRepository.findById(menuItemId).isPresent() ? menuItemRepository.findById(menuItemId).get() : null;
        resp.setMenuItem(menuItem);
        Restaurant restaurant = restTemplate.getForObject("http://RESTAURANT-SERVICE/restaurants/" +
                menuItem.getRestaurantId(), Restaurant.class);
        resp.setRestaurant(restaurant);
        return resp;
    }

    public List<MenuItem> findAllMenuItems() {
        return menuItemRepository.findAll();
    }
}
