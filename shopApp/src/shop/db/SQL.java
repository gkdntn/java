package shop.db;

public class SQL {
	
	// customer
	public static final String INSERT_CUSTOMER = "insert into `customer` set "
											   + "`custId`=?, "
											   + "`name`=?, "
											   + "`hp`=?, "
											   + "`addr`=?, "
											   + "`rdate`=now() ";
	public static final String SELECT_CUSTOMER = "select * from `customer` where `custId`=?";
	public static final String SELECT_CUSTOMERS = "select * from `customer`";
	public static final String UPDATE_CUSTOMER = "update `customer` set"
											   + "`name`=?, "
											   + "`hp`=?, "
											   + "`addr`=?, "
											   + "where `custId`=?";
	public static final String DELETE_CUSTOMER = "delete from `customer` where `custId`=?";
	
	// order
	public static final String INSERT_ORDER = "insert into `order` set"
											  + "`orderId`=?, "
											  + "`orderProduct`=?, "
											  + "`orderCount`=?, "
											  + "`orderDate`=now()";
	public static final String SELECT_ORDERS_BY_ORDERID = "select "
														+ "`orderNo`, "
														+ "`orderProduct`, "
														+ "`prodName`, "
														+ "`orderCount`, "
														+ "`name`, "
														+ "`orderDate` "
														+ "from `order` as a "
														+ "join `product` as b on a.orderProduct = b.prodNo "
														+ "join `customer` as c on a.orderId = c.custId "
														+ "where `orderID`=?";
	public static final String SELECT_ORDER = "select * from `order` where `orderNo`=?";
	public static final String SELECT_ORDERS = "select * from `order`";
			
	// product

	public static final String SELECT_PRODUCT = "select * from `product` where `productNo`=?";
	public static final String SELECT_PRODUCTS = "select * from `product`";

	
}
