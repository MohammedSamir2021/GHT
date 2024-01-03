package com.myspace.ghtprocurementprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ItemInformation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "itemCode")
	private java.lang.String itemCode;
	@org.kie.api.definition.type.Label(value = "itemDescription")
	private java.lang.String itemDescription;
	@org.kie.api.definition.type.Label(value = "quantity")
	private java.lang.Integer quantity;
	@org.kie.api.definition.type.Label(value = "unitCost")
	private java.lang.Integer unitCost;
	@org.kie.api.definition.type.Label(value = "amount")
	private java.lang.Integer amount;

	public ItemInformation() {
	}

	public java.lang.String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(java.lang.String itemCode) {
		this.itemCode = itemCode;
	}

	public java.lang.String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(java.lang.String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public java.lang.Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(java.lang.Integer quantity) {
		this.quantity = quantity;
	}

	public java.lang.Integer getUnitCost() {
		return this.unitCost;
	}

	public void setUnitCost(java.lang.Integer unitCost) {
		this.unitCost = unitCost;
	}

	public java.lang.Integer getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.Integer amount) {
		this.amount = amount;
	}

	public ItemInformation(java.lang.String itemCode,
			java.lang.String itemDescription, java.lang.Integer quantity,
			java.lang.Integer unitCost, java.lang.Integer amount) {
		this.itemCode = itemCode;
		this.itemDescription = itemDescription;
		this.quantity = quantity;
		this.unitCost = unitCost;
		this.amount = amount;
	}

}