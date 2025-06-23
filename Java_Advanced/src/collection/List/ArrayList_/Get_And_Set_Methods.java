package collection.List.ArrayList_;

import java.util.ArrayList;

public class Get_And_Set_Methods {

	public static void main(String[] args) {
		ArrayList<String> company = new ArrayList<String>();
		company.add("Oracle");
		company.add("Microsoft");
		company.add("Fujitsu");
		company.add("Genpact");
		company.add("Infosys");
	
		ArrayList<String> company_details = new ArrayList<String>();

		for (int i = 0; i < company.size(); i++) {
			String name = company.get(i);

			if (name.equals("Oracle")) {
				name = name.concat(" Database");
				company_details.add(name);

			}
			if (name.equals("Microsoft")) {
				name = name.concat(" Office");
				company_details.add(name);

			}
			if (name.equals("Fujitsu")) {
				name = name.concat(" Lift");
				company_details.add(name);

			}
			if (name.equals("Genpact")) {

				name = name.concat(" Cora APFlow");
				company_details.add(name);

			}
			if (name.equals("Infosys")) {
				name = name.concat(" Finacle");
				company_details.add(name);

			}

		}
		
		int i =0;
		for (String cmpName : company_details)
		{
			
			System.out.println(company.get(i)+" Has Product  : "+cmpName);
			i++;
		}
		

	}

}
