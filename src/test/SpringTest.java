package test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dave.dao.ExcelDao;
import com.dave.entity.Excel;

/**
 * Spring测试类
 * @author davewpw
 *
 */
public class SpringTest extends SpringTestBase {
	
	@Autowired
	private ExcelDao excelDao;
	
	@Test
	public void searchExcel(){
		String excelDate = null;
		String excelName = null;
		excelDate = "2019-03-21";
//		excelName = "HTHK-CALL CENTRE - (1033";
		List<Excel> excels = excelDao.searchExcel(excelDate, excelName);
		System.out.println(excels.get(0).getExcelName());
	}
	
}