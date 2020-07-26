package Apachepoi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelRead {

	public static void main(String[] args) throws Exception {
		
	//	C:\Users\SuperUserVenkat\Documents\QA Naga\testbook.xlxs
		File src = new File("C:\\Users\\SuperUserVenkat\\Documents\\QA Naga\\testbook.xlsx");
		FileInputStream fis =new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sht1 = wb.getSheetAt(0);
		 int rowcount = sht1.getLastRowNum();
		 int columncount = sht1.getRow(0).getPhysicalNumberOfCells();
		 
		 System.out.println("No of Row " + rowcount );
		 
		 System.out.println("No of columns  " + columncount );
		 
		 for (int i = 0; i <rowcount ; i++)
		 {
		
	
				//for (int y = 0; y < columncount ; y++ )
				//{
					
					String data0 = sht1.getRow(i).getCell(0).getStringCellValue();
					System.out.println("Data is" + data0);
				//}
				
		
		 }
		wb.close();
	}

}
