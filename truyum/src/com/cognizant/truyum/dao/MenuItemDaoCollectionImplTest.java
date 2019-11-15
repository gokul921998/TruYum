/**
 * 
 */
package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

/**
 * @Gokul
 *
 */
public class MenuItemDaoCollectionImplTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
		testModifyMenuItem();
		testGetMenuItem();

	}

	public static void testGetMenuItemListAdmin() {
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();
		List<MenuItem> menuItems = menuItemDaoCollectionImpl
				.getMenuItemListAdmin();
		for (MenuItem menuItem : menuItems) {
			System.out.println(menuItem);
		}
	}

	public static void testGetMenuItemListCustomer() {
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();
		List<MenuItem> menuItems = menuItemDaoCollectionImpl
				.getMenuItemListCustomer();
		for (MenuItem menuItem : menuItems) {
			System.out.println(menuItem);
		}
	}

	public static void testModifyMenuItem() {
		MenuItem menuItem = null;
		try {
			menuItem = new MenuItem(2, "Cake", 80.00f, true,
					DateUtil.convertToDate("23/12/2017"), "MainCourse", false);
		} catch (ParseException e) {
			System.out.println("Parse Exception: " + e.getMessage());
		}
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();
		MenuItemDao menuItemDao = menuItemDaoCollectionImpl;
		menuItemDao.modifyMenuItem(menuItem);
		System.out.println("The modified details are: "
				+ menuItemDao.getMenuItem((long) 2));
	}

	public static void testGetMenuItem() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the id: ");
		long id = in.nextLong();
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();
		MenuItemDao menuItemDao = menuItemDaoCollectionImpl;
		MenuItem menuItemForFetching = menuItemDao.getMenuItem(id);
		System.out.println(menuItemForFetching);
	}

}
