package org.dbhaskaran.menu.controller;

import lombok.extern.slf4j.Slf4j;
import org.dbhaskaran.menu.entity.MenuItem;
import org.dbhaskaran.menu.service.MenuItemService;
import org.dbhaskaran.menu.vo.ResponseTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/menuitems")
public class MenuItemController {
    @Autowired
    MenuItemService menuItemService;

    @PostMapping("/")
    public MenuItem saveMenuItem(@RequestBody MenuItem menuItem){
        log.info("Saving MenuItem to DB");
        return menuItemService.save(menuItem);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseTemplateVo findMenuItemWithRestaurant(@PathVariable(value="id") long menuItemId){
        return menuItemService.findMenuItemWithRestaurant(menuItemId);
    }

    @GetMapping(value = "/", produces = "application/json")
    public List<MenuItem> findAllMenuItems(){
        return menuItemService.findAllMenuItems();
    }
}
