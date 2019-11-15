/**
 * 
 */
package com.cognizant.truyum.model;

import java.util.List;

/**
 * @Gokul
 *
 */
public class Cart {
	private List<MenuItem> menuItemList;;
	private Double total;

	/**
	 * @param menuItemList
	 * @param total
	 */
	public Cart(List<MenuItem> menuItemList, Double total) {
		super();
		this.menuItemList = menuItemList;
		this.total = total;
	}

	/**
	 * @return the menuItemList
	 */
	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	/**
	 * @param menuItemList
	 *            the menuItemList to set
	 */
	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cart [menuItemList=" + menuItemList + ", total=" + total + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((menuItemList == null) ? 0 : menuItemList.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (menuItemList == null) {
			if (other.menuItemList != null)
				return false;
		} else if (!menuItemList.equals(other.menuItemList))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}

}
