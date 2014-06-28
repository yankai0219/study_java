package com.list;
import java.util.List;
import com.list.Preference;

public class GenericItemPrefereceArray {
	public GenericItemPrefereceArray(List<? extends Preference> prefs) {
		int size = prefs.size();
		System.out.println("size:" + size);
	}

	static public void main(String[] args) {
		
	//	GenericItemPrefereceArray pref = new GenericItemPrefereceArray();
	}
}