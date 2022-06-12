package com.zephyr.models;

public class Table {

	private String tableNumber;
	private String tableStatus;

	public Table(String tableNumber, String tableStatus) {
		this.tableNumber = tableNumber;
		this.tableStatus = tableStatus;
	}

	public String getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}

	public String getTableStatus() {
		return tableStatus;
	}

	public void setTableStatus(String tableStatus) {
		this.tableStatus = tableStatus;
	}

	@Override
	public String toString() {
		return "Table [tableNumber=" + tableNumber + ", tableStatus=" + tableStatus + "]";
	}

}
