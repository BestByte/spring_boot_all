package cn.exrick.xboot.modules.tmall.model;

import cn.exrick.xboot.base.XbootBaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name="t_product")
public class Product  extends XbootBaseEntity {

   // private long id;
    private String name;
    private int price;
    private long created;

}
