package collection.List.ArrayList;

import java.util.ArrayList;

public class Get_Element {

	public static void main(String[] args) {
		
		ArrayList<String> dataList = new ArrayList<String>();

		dataList.add("Sapna");
		dataList.add("Divakar");
		dataList.add("Evanshi");
		dataList.add("Shahmeer");
		
		System.out.println(dataList.get(2)+" is sister of "+dataList.get(3));

	}

}
