package cn.exrick.xboot.modules.tmall.response;

import cn.exrick.xboot.modules.tmall.model.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductResponse {
    @JsonProperty("items")
    private List<Product> productList;

    private int total;
}
