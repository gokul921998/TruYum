/**
 * 
 */
package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

/**
 * @Gokul
 *
 */
public interface CartDao {

	public void addCartItem(Long userId, Long menuItemId);

	public List<MenuItem> getAllCartItems(Long userId)
			throws CartEmptyException;

	public void removeCartItem(Long userId, Long menuItemId);
}
