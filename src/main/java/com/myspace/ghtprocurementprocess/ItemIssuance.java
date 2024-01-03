package com.myspace.ghtprocurementprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ItemIssuance implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "itemCode")
	private java.lang.String itemCode;
	@org.kie.api.definition.type.Label(value = "itemDiscription")
	private java.lang.String itemDiscription;
	@org.kie.api.definition.type.Label(value = "requestedQuantity")
	private java.lang.Integer requestedQuantity;
	@org.kie.api.definition.type.Label(value = "issueDate")
	private java.util.Date issueDate;
	@org.kie.api.definition.type.Label(value = "issueQuantity")
	private java.lang.Integer issueQuantity;
	@org.kie.api.definition.type.Label(value = "requesterName")
	private java.lang.String requesterName;
	@org.kie.api.definition.type.Label(value = "department")
	private java.lang.String department;

	public ItemIssuance() {
	}

	public java.lang.String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(java.lang.String itemCode) {
		this.itemCode = itemCode;
	}

	public java.lang.String getItemDiscription() {
		return this.itemDiscription;
	}

	public void setItemDiscription(java.lang.String itemDiscription) {
		this.itemDiscription = itemDiscription;
	}

	public java.lang.Integer getRequestedQuantity() {
		return this.requestedQuantity;
	}

	public void setRequestedQuantity(java.lang.Integer requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}

	public java.util.Date getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(java.util.Date issueDate) {
		this.issueDate = issueDate;
	}

	public java.lang.Integer getIssueQuantity() {
		return this.issueQuantity;
	}

	public void setIssueQuantity(java.lang.Integer issueQuantity) {
		this.issueQuantity = issueQuantity;
	}

	public java.lang.String getRequesterName() {
		return this.requesterName;
	}

	public void setRequesterName(java.lang.String requesterName) {
		this.requesterName = requesterName;
	}

	public java.lang.String getDepartment() {
		return this.department;
	}

	public void setDepartment(java.lang.String department) {
		this.department = department;
	}

	public ItemIssuance(java.lang.String itemCode,
			java.lang.String itemDiscription,
			java.lang.Integer requestedQuantity, java.util.Date issueDate,
			java.lang.Integer issueQuantity, java.lang.String requesterName,
			java.lang.String department) {
		this.itemCode = itemCode;
		this.itemDiscription = itemDiscription;
		this.requestedQuantity = requestedQuantity;
		this.issueDate = issueDate;
		this.issueQuantity = issueQuantity;
		this.requesterName = requesterName;
		this.department = department;
	}

}