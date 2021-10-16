package org.dbhaskaran.menu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dbhaskaran.menu.entity.MenuItem;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {
    private MenuItem menuItem;
    private Restaurant restaurant;
}
