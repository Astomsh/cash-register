<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>小票打印设置</title>
</head>

<body
	style="width: 600px; margin: 0 auto; font-family: 'Microsoft YaHei';">
	<div id="receiptPrintSetDiv" v-cloak>
		<h3>小票打印设置</h3>
		<div>
			<form class="form-horizontal layerForm">
				<div class="form-group col-xs-12">
					<div class="input-group">
                    <span class="input-group-addon">收银小票宽度</span>
                    <span class="input-group-addon">
                    	<input type="radio" v-model="receipt_width" value="580">580
                    </span>
                    <span class="input-group-addon">
                    	<input type="radio" v-model="receipt_width" value="800">800
                    </span>
                    <span class="input-group-btn"><button class="btn btn-primary" type="button" @click="update_receipt_width">确定</button></span>
                </div>
				</div>
			</form>
		</div>
	</div>
	<script src="${ctx}/static/js/frontstage/_receiptPrint-set.js"></script>
</body>

</html>