package common;

public class Contents {

	/** 接口定义参数（测试环境） **/
	public final static String ENCRYPTED_URL = "http://**.**.**.**:8085/lmis/PostToLmis?sign=";
	public final static String SECRET_KEY = "8695321";
	public final static String CONTACT_CODE = "Visitor_test";
	public final static String SYSTEM_KEY = "6953621";
	public final static String METHOD = "postVisitorInfo";
	public final static String VERSION = "1.0";

	/** 数据库中一些标志位常量 **/
	public final static int IS_DISABLED = 0; // 启动
	public final static int IS_NOT_DISABLED = 1; // 禁用
	public final static int IS_DELETED = 0; // 正常
	public final static int IS_NOT_DELETED = 1; // 删除

	/** 打印机名称 **/
	public final static String PRINTER_NAME = "MyPrint"; // 暂时先写死传入

	/** PEPPER机器人的发送图片存储路径 **/
	public final static String file_path = "C://photo/"; //window存储路径
//	public final static String file_path = "/home/file/vims_file/"; // linux存储路径

	/** 访客类型常量 **/
	public final static String INDIVIDUAL = "01"; // 个体

	public final static String GROUP = "02"; // 团体

}
