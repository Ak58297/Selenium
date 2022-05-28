package ExcelTest.DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String args[]) throws IOException {
		// Identify Testcases coloum by scanning the entire 1st row
		// once coloumn is identified then scan entire testcase coloum to identify
		// purcjhase testcase row
		// after you grab purchase testcase row = pull all the data of that row and feed
		// into test

		FileInputStream fis = new FileInputStream("C:\\Users\\ABHISHEK KUMAR\\Desktop\\Jobs1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int NumberofSheet = workbook.getNumberOfSheets();//get total number of sheets
		System.out.println("Number of sheets in the excel :" + NumberofSheet);

		for (int i = 0; i < NumberofSheet; i++) {
			if (workbook.getSheetName(i).contains("Sheet1")) {
				XSSFSheet sheet = workbook.getSheetAt(i);//collection of rows

				Iterator<Row> rows = sheet.iterator();// collection of columns
				System.out.println("Row : " + (i+1));
				Row FirstRow =rows.next();
				Iterator<Cell> column=FirstRow.iterator();
				int k=0;
				int columnNumber=0;
				while(column.hasNext())
				{
					Cell ColumnName=column.next();
					if(ColumnName.getStringCellValue().equalsIgnoreCase("Job Profile"))
					{
						columnNumber=k;
					}
					k++;
					
				}
				System.out.println("Column at which job profile is present : "+columnNumber);
				
				
		//once column is identifies scan the column and then find the required value from that column
				
				
				
				while(rows.hasNext())
				{
					Row r1=rows.next();
					Row r2=rows.next();
					//Row r3=rows.next();
					
					if(r2.getCell(columnNumber).getStringCellValue().equalsIgnoreCase("Senior Test Engineer"))
					{
						//got the desired value in a column , now pull the complete row
						Iterator<Cell> c=r2.cellIterator();
						while(c.hasNext())
						{
							
							Cell cv=c.next();
							if(cv.getCellType()==CellType.STRING)
							{
								System.out.println(c.next().getStringCellValue());
							}
							else if(cv.getCellType()==CellType.NUMERIC)
							{
								System.out.println(c.next().getNumericCellValue());
							}
							else
							{
								System.out.println(c.next().getDateCellValue());
							}
								
							
							
						}
					}
				}
				
					
			}
		}

	}

}
