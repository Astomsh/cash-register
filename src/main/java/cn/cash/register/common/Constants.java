package cn.cash.register.common;

/**
 * 常量类
 * 
 * @author 51
 * @version $Id: CashRegisterConstants.java, v 0.1 2018年4月17日 下午2:29:04 51 Exp $
 */
public class Constants {

    /**
     * 收银员登录后存入session中的用户字段
     */
    public static final String LOGIN_FLAG_SELLER           = "seller";

    /**
     * 收银员登录后存入session中的登录时间字段
     */
    public static final String SELLER_LOGIN_TIME           = "seller_login_time";

    /**
     * 管理员登录后存入session中的用户字段
     */
    public static final String LOGIN_FLAG_ADMIN            = "admin";

    /**
     * 登录以后保存的当前交接班id
     */
    public static final String CURRENT_JOB_ID              = "current_job_id";

    /**
     * 商品资料导出文件名
     */
    public static final String GOODS_INFO_EXPORT_FILE_NAME = "商品资料.xls";

    /**
     * null字符串
     */
    public static final String NULL_STR                    = "null";

    /**
     * 密钥文件名
     */
    public static final String AUTH_CODE_FILE              = "auth_code";

    public static final String TRUE                        = "true";

    public static final String FALSE                       = "false";

    public static final int    RECEIPT_WIDTH_580           = 580;

    /************************系统参数表param_code字段************************/

    /** 商店名 */
    public static final String SHOP_NAME                   = "SHOP_NAME";

    /** 备用金开关 */
    public static final String PETTY_AMOUNT                = "PETTY_AMOUNT";

    /** 注册时间 */
    public static final String REGISTER_TIME               = "REGISTER_TIME";

    /** 有效期截止时间 */
    public static final String INVALID_TIME                = "INVALID_TIME";

    /** 绑定邮箱 */
    public static final String RELATED_EMAIL               = "RELATED_EMAIL";

    /** 联系电话 */
    public static final String PHONE                       = "PHONE";

    /** 联系地址 */
    public static final String ADDRESS                     = "ADDRESS";

    /** 系统是否已授权 */
    public static final String IS_AUTHORIZED               = "IS_AUTHORIZED";

    /** 系统是否已初始化 */
    public static final String IS_INIT                     = "IS_INIT";

    /** 收银小票宽度，分为580mm和800mm两种 */
    public static final String RECEIPT_WIDTH               = "RECEIPT_WIDTH";

    /*********************************end***********************************/

    /**
     * 导出数据时文件存储相对路径
     */
    public static final String EXPORT_FILE_RELATIVE_PATH   = "export-file-temp";

    /**
     * 导入数据时文件存储相对路径
     */
    public static final String IMPORT_FILE_RELATIVE_PATH   = "import-file-temp";
}
