package cn.exrick.xboot.modules.tmall.service;

import cn.exrick.xboot.base.XbootBaseService;
import cn.exrick.xboot.modules.tmall.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface ProductService extends XbootBaseService<Product,String> {


    /**
     * 通过id查找查找
     * 默认升序
     * @param id
     * @return
     */
 public  Product getProductById(long id);

    /**
     * 创建产品
     * @param name
     * @param price
     * @return Product
     */
    public Product createProduct(String name ,int price);

    /**
     * 更新产品
     * @param id
     * @param fieldMap
     * @return
     */
    public Product updateProduct(long id, Map<String,Object> fieldMap);

    /**
     * 通过ID删除产品
     * @param id
     * @return
     */
    public boolean deleteProductById(long id);

    /**
     * 获得列表
     * @return
     */
    public List<Product> getProductList();
}
