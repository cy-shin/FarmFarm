package edu.kh.farmfarm.order.model.service;

import java.util.List;

import edu.kh.farmfarm.mypage.model.vo.Order;
import edu.kh.farmfarm.order.model.vo.Return;
import edu.kh.farmfarm.productDetail.model.vo.Product;

public interface OrderService {

	/** 반품 등록
	 * @param returnInfo
	 * @return
	 */
	int insertReturn(Return returnInfo, List<Product> productList);

	/** 주문하기
	 * @param order
	 * @param pList
	 * @return
	 */
	int orderProduct(Order order, List<Product> pList);

}
