package com.dave.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dave.entity.Excel;
import com.dave.entity.ExcelAll;
import com.dave.entity.ExcelTotal;

/**
 * Excel数据持久层接口
 * 
 * @author Dave
 *
 */
public interface ExcelDao {
	/**
	 * 根据 ExcelID 查询所有 Excel内容
	 * 
	 * @param excelId
	 * @return
	 */
	List<ExcelAll> selectExcelAll(int excelId);
	/**
	 * 根据 ExcelID 查询 Excel
	 * 
	 * @param excelId
	 * @return
	 */
	Excel selectExcelById(int excelId);
	/**
	 * 添加 Excel
	 * 
	 * @param excel
	 * @return
	 */
	int addExcel(Excel excel);
	/**
	 * 更改 Excel, 添加 Occupancy Rate 的内容
	 * 
	 * @param excel
	 * @return
	 */
	int updateExcel(Excel excel);
	/**
	 * 根据 Excel名称查询, 最新的自增 ExcelID
	 * 
	 * @param excelName
	 * @return
	 */
	int selectExcelByName(String excelName);
	/**
	 * 添加 Excel内容
	 * 
	 * @param excelAll
	 * @return
	 */
	int addExcelAll(ExcelAll excelAll);
	/**
	 * 根据 ExcelID 查询 Excel内容
	 * 
	 * @param excelId
	 * @return
	 */
	List<ExcelAll> selectExcelAllById(int excelId);
	/**
	 * 根据 ExcelID 删除 Excel内容
	 * 
	 * @param excelId
	 * @return
	 */
	int deleteExcelAll(int excelId);
	/**
	 * 根据 ExcelID 删除 Excel
	 * 
	 * @param excelId
	 * @return
	 */
	int deleteExcel(int excelId);
	/**
	 * 根据 ExcelID 查询 Excel 内容, 获取需要的Total
	 * 
	 * @param excelId
	 * @return
	 */
	ExcelTotal selectExcelAllTotal(int excelId);
	/**
	 * 查询框功能查询所有 Excel,以及页面初始数据查询
	 * 
	 * @param excelDate
	 * @param excelName
	 * @return
	 */
	List<Excel> searchExcel(@Param("excelDate")String excelDate, @Param("excelName")String excelName);
	/**
	 * 根据 Excel名称查询 Excel Occupancy Rate 的最大数
	 * 
	 * @param excelName
	 * @return
	 */
	List<Excel> searchExcelMax(String excelName);
	/**
	 * 根据 ExcelID 查询 Excel Occupancy Rate 的最大数
	 * 
	 * @param excelId
	 * @return
	 */
	ExcelAll selectExcelAllMax(int excelId);
}