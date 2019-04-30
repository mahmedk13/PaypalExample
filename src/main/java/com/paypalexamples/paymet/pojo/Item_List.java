package com.paypalexamples.paymet.pojo;

import java.util.List;

public class Item_List {
	private Shipping_address shipping_address;
	private List<Items> items;
	public Shipping_address getShipping_address() {
		return shipping_address;
	}
	public void setShipping_address(Shipping_address shipping_address) {
		this.shipping_address = shipping_address;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
}
