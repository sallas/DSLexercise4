package dataSource;

import domain.Order;
import domain.OrderDetail;

public interface OrderMapperInterface {

  //== load an order and the associated order details
  Order getOrder(int ono);

  //== Insert new order (tuple)
  boolean saveNewOrder(Order o);

  //== Insert new order detail (tuple)
  boolean saveNewOrderDetail(OrderDetail od);
  
}
