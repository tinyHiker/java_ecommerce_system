
/*
 * class ProductOrder defines an order of a specific product by a customer
 * 
 * The order number is generated by the system when a ProductOrder object is created.
 * 
 * Also stores any product options chosen by this customer (e.g. paperback book, certain size of a product etc)
 */
public class ProductOrder
{
	private String 		orderNumber;
	private Product 	product;
	private String    productOptions;
	private Customer 	customer;

	public ProductOrder(String orderNumber, Product product, Customer customer, String productOptions)
	{
		this.orderNumber = orderNumber;
		this.product = product;
		this.customer = customer;
		this.productOptions = productOptions;
	}

	public String getOrderNumber()
	{
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber)
	{
		this.orderNumber = orderNumber;
	}
	public Product getProduct()
	{
		return product;
	}
	public void setProduct(Product product)
	{
		this.product = product;
	}
	public Customer getCustomer()
	{
		return customer;
	}
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}

	public void print()
	{
		System.out.printf("\nOrder # %3s Customer Id: %3s Product Id: %3s Product Name: %12s Options: %8s", orderNumber, customer.getId(), product.getId(), product.getName(), 
				productOptions);
	}
	/*
	 * Two ProductOrder objects are equal if they have the same order number string.
	 */
	public boolean equals(Object other)
	{
		ProductOrder otherPO = (ProductOrder) other;
		return this.orderNumber.equals(otherPO.orderNumber);
	}
}
