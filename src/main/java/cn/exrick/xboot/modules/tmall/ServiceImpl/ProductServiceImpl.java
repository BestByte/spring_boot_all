package cn.exrick.xboot.modules.tmall.ServiceImpl;

import cn.exrick.xboot.base.XbootBaseDao;
import cn.exrick.xboot.modules.tmall.model.Product;
import cn.exrick.xboot.modules.tmall.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {


    @Override
    public Product getProductById(long id) {
        return null;
    }

    @Override
    public Product createProduct(String name, int price) {
        return null;
    }

    @Override
    public Product updateProduct(long id, Map<String, Object> fieldMap) {
        return null;
    }

    @Override
    public boolean deleteProductById(long id) {
        return false;
    }

    @Override
    public List<Product> getProductList() {
        return null;
    }

    @Override
    public XbootBaseDao<Product, String> getRepository() {
        return null;
    }
}
