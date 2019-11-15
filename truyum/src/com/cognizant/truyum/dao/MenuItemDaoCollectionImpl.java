/**
 * 
 */
package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

/**
 * @Gokul
 *
 */
public class MenuItemDaoCollectionImpl implements MenuItemDao {

	private List<MenuItem> menuItemList;

	/**
	 * @throws ParseException
	 * 
	 */
	public MenuItemDaoCollectionImpl() {
		if (menuItemList == null) {
			menuItemList = new ArrayList<MenuItem>();
			try {
				menuItemList.add(new MenuItem(1, "Sandwich", 99.00f, true,
						DateUtil.convertToDate("15/03/2017"), "MainCourse",
						true));

				menuItemList.add(new MenuItem(2, "Burger", 129.00f, true,
						DateUtil.convertToDate("23/12/2017"), "MainCourse",
						false));

				menuItemList.add(new MenuItem(3, "Pizza", 149.00f, true,
						DateUtil.convertToDate("07/02/2017"), "MainCourse",
						false));

				menuItemList
						.add(new MenuItem(4, "French Fries", 57.00f, false,
								DateUtil.convertToDate("09/02/2017"),
								"Starters", true));

				menuItemList.add(new MenuItem(5, "Chocolate Brownie", 32.00f,
						true, DateUtil.convertToDate("25/01/2022"), "Dessert",
						true));
			} catch (ParseException e) {
				System.out.println("Parse Exception: " + e.getMessage());
			}
		}
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cognizant.truyum.dao.MenuItemDao#getMenuItemListAdmin()
	 */
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		// TODO Auto-generated method stub
		return menuItemList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cognizant.truyum.dao.MenuItemDao#getMenuItemListCustomer()
	 */
	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		List<MenuItem> menuItemListCust = new ArrayList<MenuItem>();
		Date today = new Date();
		for (MenuItem menuItem : menuItemList) {
			if (menuItem.getDateOfLaunch().getTime() <= today.getTime()
					&& menuItem.isActive()) {
				menuItemListCust.add(menuItem);
			}
		}
		return menuItemListCust;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cognizant.truyum.dao.MenuItemDao#modifyMenuItem(com.cognizant.truyum
	 * .model.MenuItem)
	 */
	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		for (MenuItem menuItemForModification : menuItemList) {
			if (menuItem.getId() == menuItemForModification.getId()) {
				menuItemForModification.setName(menuItem.getName());
				menuItemForModification.setCategory(menuItem.getCategory());
				menuItemForModification.setDateOfLaunch(menuItem
						.getDateOfLaunch());
				menuItemForModification.setFreeDelivery(menuItem
						.isFreeDelivery());
				menuItemForModification.setPrice(menuItem.getPrice());
				menuItemForModification.setActive(menuItem.isActive());
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cognizant.truyum.dao.MenuItemDao#getMenuItem(java.lang.Long)
	 */
	@Override
	public MenuItem getMenuItem(Long menuItemId) {
		for (MenuItem menuItemForFetching : menuItemList) {
			if (menuItemId == menuItemForFetching.getId()) {
				return menuItemForFetching;
			}
		}
		return null;
	}

}
