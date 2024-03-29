package  com.jxk.oto.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import  com.jxk.oto.entity.Shop;

public interface ShopDao {
	
	
	/**分页查询店铺 可输入条件有：店铺名（迷糊），店铺状态，店铺类别，区域Id,owner
	 * @param shopCondition
	 * @param rowIndex从第几行开始取数据
	 * @param paeSize返回的条数
	 * @return
	 */
	List<Shop> queryShopList(@Param("shopCondition")Shop shopCondition,@Param("rowIndex")int rowIndex,
			@Param("pageSize") int paeSize);
	/**返回queryShopList总数
	 * @param shopCondition
	 * @return
	 */
	int queryShopCount(@Param("shopCondition") Shop shopCondition);
	//通过id查询店铺
	
	/**
	 * @param shopId
	 * @return
	 */
	
	Shop queryByShopId(Long shopId);
	int insertShop(Shop shop);
	int updateShop(Shop shop);

}
