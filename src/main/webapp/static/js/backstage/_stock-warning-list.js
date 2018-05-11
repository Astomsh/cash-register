var option = {
    url: basePath + '/admin/stock/warning/queryGoods',
    datatype: "json",
    mtype: "post",
    colModel: [{
        label: '商品ID',
        name: 'id',
        hidden: true,
        key: true
    }, {
        label: '商品名称',
        name: 'goodsName',
        index: 'goods_Name',
        width: 180,
        formatter: function(value, options, row) {
        	if (isBlank(row['goodsColor']) && isBlank(row['goodsSize'])) {
                return value;
            } else {
                return value + '(' + row['goodsColor'] + ', ' + row['goodsSize'] + ')';
            }
        }
    }, {
        label: '条码',
        name: 'barCode',
        index: 'bar_Code',
        width: 160
    }, {
        label: '货号',
        name: 'productNumber',
        index: 'product_Number',
        width: 150
    }, {
        label: '拼音码',
        name: 'pinyinCode',
        index: 'pinyin_Code',
        width: 80
    }, {
        label: '分类',
        name: 'categoryName',
        index: 'category_Name',
        width: 80
    }, {
        label: '库存',
        name: 'goodsStock',
        index: 'goods_Stock',
        width: 60
    }, {
        label: '主单位',
        name: 'quantityUnit',
        index: 'quantity_Unit',
        width: 60
    }, {
        label: '进货价',
        name: 'averageImportPrice.amount',
        index: 'average_Import_Price',
        width: 80,
        formatter: "number",
        formatoptions: {
            thousandsSeparator: ','
        }
    }, {
        label: '销售价',
        name: 'salesPrice.amount',
        index: 'sales_Price',
        width: 80,
        formatter: "number",
        formatoptions: {
            thousandsSeparator: ','
        }
    }, {
        label: '批发价',
        name: 'tradePrice.amount',
        index: 'trade_Price',
        width: 80,
        formatter: function(value, options, row) {
        	if (isBlank(value) || value == 0) {
                return '-';
            } else {
                return value;
            }
        }
    }, {
        label: '会员价',
        name: 'vipPrice.amount',
        index: 'vip_Price',
        width: 80,
        formatter: function(value, options, row) {
        	if (isBlank(value) || value == 0) {
                return '-';
            } else {
                return value;
            }
        }
    }, {
        label: '会员折扣',
        name: 'isVipDiscount',
        index: 'is_Vip_Discount',
        width: 80,
        formatter: function(value, options, row) {
            if (value) {
                return '是';
            } else {
                return '否';
            }
        }
    }, {
        label: '供货商',
        name: 'supplierName',
        index: 'supplier_Name',
        width: 100
    }, {
        label: '生产日期',
        name: 'productionDate',
        index: 'production_Date',
        width: 100
    }, {
        label: '保质期',
        name: 'qualityGuaranteePeriod',
        index: 'quality_Guarantee_Period',
        width: 100
    }, {
        label: '创建日期',
        name: 'gmtCreate',
        index: 'gmt_Create',
        width: 150,
        formatter: "date",
        formatoptions: {
            srcformat: 'Y-m-d H:i:s',
            newformat: 'Y-m-d H:i:s'
        }
    }],
    viewrecords: true,
    height: "auto",
    width: "100%",
    rowNum: 10,
    rowList: [10, 30, 50],
    rownumbers: true,
    rownumWidth: 45,
    shrinkToFit: false,
    autowidth: true,
    multiselect: true,
    sortname: "gmt_Update",
    sortorder: "desc",
    pager: "#jqGridPager",
    jsonReader: {
        root: "page.list",
        page: "page.pageNum",
        total: "page.pages",
        records: "page.total"
    },
    prmNames: {
        page: "pageNum",
        rows: "pageSize",
        order: "order"
    },
    postData: {
        'warningType': "less",
    },
}

$(function() {
    $("#jqGrid").jqGrid(option);
});

var vm = new Vue({
    el: '#goodsListDiv',
    data: {
    	q: {
            categoryName: '',
            supplierName: '',
            warningType: 'less'
        },
    	goods_categorys: [], // 全部分类
        goods_suppliers: [], // 全部供货商
    },
    methods: {
        search: function() {
        	this.reloadPage();
        },
        resetSearch: function() {
        	this.q.categoryName = '';
        	this.q.supplierName = '';
        	this.q.warningType = 'less';
        	this.reloadPage();
        },
        reloadPage: function() {
            var page = $("#jqGrid").jqGrid('getGridParam', 'page');
            var _self = this;
            $("#jqGrid").jqGrid('setGridParam', {
                postData: {
                    'categoryName': _self.q.categoryName,
                    'supplierName': _self.q.supplierName,
                    'warningType': _self.q.warningType,
                },
                page: page
            }).trigger("reloadGrid");
        },
        loadGoodsCategorys: function() { // 加载所有商品分类列表
        	var _self = this;
            $.ajax({
                url: basePath + "/admin/goods/getGoodsCategoryList",
                data:  { 'parentCategoryId': 0 },
                success: function(result) {
                    if (result.code == "00") {
                    	_self.goods_categorys = result.list;
                    } else {
                        layer.alert("加载商品分类列表出错" + result.msg);
                    }
                }
            });
        },
        loadGoodsSuppliers: function() { // 加载所有供货商列表
        	var _self = this;
        	$.ajax({
        		type: "GET",
        		url: basePath + "/admin/supplier/queryAllSupplierNames",
        		success: function(result) {
        			if (result.code == "00") {
        				_self.goods_suppliers = result.names;
        			} else {
        				layer.alert("加载供货商列表出错" + result.msg);
        			}
        		}
        	});
        },
    },
    mounted: function() {
    	this.loadGoodsCategorys();
    	this.loadGoodsSuppliers();
    }
});

