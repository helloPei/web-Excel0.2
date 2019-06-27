<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Excel</title>
</head>
<body>
<h3>${excel.excelName}</h3>
<h4>${excel.excelDate}-${excel.week}</h4>
<div class="table-responsive" style="margin-top: 20px">
    <table class="table" border="1">
        <thead class="Table cell">
            <td>Time</td>
            <td>Incoming Call Answer</td>
            <td>Incoming Average Holding Time Per Call (sec)</td>
            <td>Incoming Total Seconds In The Hour (sec)</td>
            <td>Outgoing Call Answer</td>
            <td>Outgoing Average Holding Time Per Call (sec)</td>
            <td>Outgoing Total Seconds In The Hour (sec)</td>
            <td>Service Capacity</td>
            <td>Capacity Needed</td>
            <td>Occupancy Hour(hour)</td>
            <td>Occupancy Rate(%)</td>
        </thead>
        <tbody>
            <c:forEach var="excel" items="${excelAll}">
                <tr class="success">
                    <td>${excel.time}</td>
                    <td>${excel.inCallAnswer}</td>
                    <td>${excel.inAverageHoldingTPC}</td>
                    <td>${excel.inTotalHour}</td>
                    <td>${excel.outCallAnswer}</td>
                    <td>${excel.outAverageHoldingTPC}</td>
                    <td>${excel.outTotalHour}</td>
                    <td>${excel.serviceCapacity}</td>
                    <td>${excel.capacityNeeded}</td>
                    <td>${excel.occupancyHour}</td>
                    <td>${excel.occupancyRate}%</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="javascript:doExport()"><button type="button" class="btn btn-primary">导出</button></a>
    <a href="doIndexUI.do"><button type="button" class="btn btn-primary">返回</button></a>
</div>
</body>
<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript">
function doExport(){
	var excelId = ${excel.excelId};
    window.location.href="doExport.do?excelId="+excelId;
}    
</script>
</html>