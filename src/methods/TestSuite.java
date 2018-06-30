package methods;

import java.io.IOException;

public class TestSuite {

	public static void main(String[] args) throws IOException
	{
		OrgHRMLib om=new OrgHRMLib();
		//Login
		String res=om.Org_Launch(om.url);
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Close Successfull");
		
		//Emp Reg
		res=om.Org_Launch(om.url);
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_Empreg("Apple", "12345", "A52453");
		System.out.println("Employee Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Close Successfull");

		//User Reg
		res=om.Org_Launch(om.url);
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_Userreg("Apple 12345", "Apple1234512345", "Apple1234512345", "Apple1234512345");
		System.out.println("User Registration "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Close Successfull");
		
		//Userlogin
		res=om.Org_Launch(om.url);
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Apple1234512345", "Apple1234512345");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Close Successfull");
	}

}
