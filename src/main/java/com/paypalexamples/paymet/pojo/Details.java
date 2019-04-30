package com.paypalexamples.paymet.pojo;

public class Details {
	private String insurance;
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getShipping() {
		return shipping;
	}
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}
	public String getShipping_discount() {
		return shipping_discount;
	}
	public void setShipping_discount(String shipping_discount) {
		this.shipping_discount = shipping_discount;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public String getHandling_fee() {
		return handling_fee;
	}
	public void setHandling_fee(String handling_fee) {
		this.handling_fee = handling_fee;
	}
	public String getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}
	private String shipping;
	private String shipping_discount;
	private String tax;
	private String handling_fee;
	private String subtotal;

}
