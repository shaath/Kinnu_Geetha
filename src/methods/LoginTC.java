package methods;

import java.io.IOException;

public class LoginTC {

	public static void main(String[] args) throws IOException
	{
		OrgHRMLib om=new OrgHRMLib();
		
		String res=om.Org_Launch(om.url);
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Admin");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Close Successfull");

	}

}
