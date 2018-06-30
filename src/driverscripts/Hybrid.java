package driverscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import methods.OrgHRMLib;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hybrid {

	public static void main(String[] args) throws IOException {

		Date d=new Date();
//		System.out.println(d);
		SimpleDateFormat formate=new SimpleDateFormat("ddMMyyyyHHmmss");
		String x=formate.format(d);
//		System.out.println(x);
		OrgHRMLib om=new OrgHRMLib();
		String res=null;
		String xlpath="F:\\KinnuRecordings\\Workspace\\SeleniumProject\\src\\testdata\\Hybrid.xlsx";
		String xlout="F:\\KinnuRecordings\\Workspace\\SeleniumProject\\src\\results\\Hybridres"+x+".xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("Testdata");
		XSSFSheet ws3=wb.getSheet("EmpReg");
		
		int TcRc=ws.getLastRowNum();
		int TsRc=ws1.getLastRowNum();
		int EmpRc=ws3.getLastRowNum();
		
		for (int i = 1; i < TcRc; i++) 
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String TcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= TsRc; j++) 
				{
					String TsTcId=ws1.getRow(j).getCell(0).getStringCellValue();
					if (TcId.equalsIgnoreCase(TsTcId))
					{
						String keywod=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (keywod) 
						{
						case "Launch":
							String url=ws2.getRow(1).getCell(0).getStringCellValue();
							res=om.Org_Launch(url);
							break;
						case "login":
							String u=ws2.getRow(1).getCell(1).getStringCellValue();
							String p=ws2.getRow(1).getCell(2).getStringCellValue();
							res=om.Org_Login(u, p);
							break;
						case "logout":
							res=om.Org_Logout();
							om.Org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= EmpRc; k++)
							{
								String f=ws3.getRow(k).getCell(0).getStringCellValue();
								String l=ws3.getRow(k).getCell(1).getStringCellValue();
								String Eid=ws3.getRow(k).getCell(2).getStringCellValue();
								res=om.Org_Empreg(f, l, Eid);
								ws3.getRow(k).createCell(3).setCellValue(res);
							}
							
							break;
						case "Usereg":
							String ename=ws2.getRow(1).getCell(6).getStringCellValue();
							String uname=ws2.getRow(1).getCell(7).getStringCellValue();
							String pswd=ws2.getRow(1).getCell(8).getStringCellValue();
							String cpswd=ws2.getRow(1).getCell(9).getStringCellValue();
							res=om.Org_Userreg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":
							String un=ws2.getRow(1).getCell(7).getStringCellValue();
							String ps=ws2.getRow(1).getCell(8).getStringCellValue();
							res=om.Org_Login(un, ps);
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}	
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}

}
