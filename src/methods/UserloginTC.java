package methods;

import java.io.IOException;

public class UserloginTC {

	public static void main(String[] args) throws IOException 
	{
		OrgHRMLib om=new OrgHRMLib();
		
		String res=om.Org_Launch(om.url);
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("VignanKumar12345", "VignanKumar12345");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Close Successfull");

	}

}
