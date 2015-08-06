package com.cvte.dao;

import java.util.ArrayList;

import com.cvte.Entity.ItemData;

public interface BomMapper {
	void insertItem(ItemData itemData);
	void updateItem(ItemData itemData);
	void deleteItem(ItemData itemData);
	ArrayList<ItemData> selectItems();
}
