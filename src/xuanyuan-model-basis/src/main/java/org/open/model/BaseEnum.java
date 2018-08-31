package org.open.model;


import java.util.*;

public class BaseEnum {
	public enum DictEnum {
		StarLevel("金鹿公务", "10000"), HotelType("酒店集团", "10010"), SzType("首直公务", "10100"), SfType("思福租赁", "11000"),
		ThType("通汇管理", "11100"), JDType("首航管理", "11110"), HUType("海南航空", "11111"), $8LType("祥鹏航空", "11112"),
		PNType("西部航空", "11113"), GSType("天津航空", "11114"), UQType("乌鲁木齐航空", "11115"), FUType("福州航空", "11116"),
		GXType("北部湾航空", "11117");

		// 成员变量
		private String name;
		private String index;

		// 构造方法
		private DictEnum(String name, String index) {
			this.name = name;
			this.index = index;
		}

		// 普通方法
		public static String getNameByIndex(String index) {
			for (DictEnum c : DictEnum.values()) {
				if (c.getIndex().equals(index)) {
					return c.name;
				}
			}
			return null;
		}

		// get set 方法
		public String getName() {
			return name;
		}

		public String getIndex() {
			return index;
		}
	}

	public enum BusinessType {
		SysNews(1), Hotel(2), HotelRoom(3), Contract(4);
		private Integer index;

		private BusinessType(Integer index) {
			this.index = index;
		}

		public Integer getValue() {
			return index;
		}
	}
	
	public enum SerialNumberType {
		Alliance(0), Hotel(1), MemberInfo(2);
		private Integer index;

		private SerialNumberType(Integer index) {
			this.index = index;
		}

		public Integer getValue() {
			return index;
		}
	}
	
	// 预算类型：1首航，2易生支付，3易生预付卡
	public enum AirIndicatorType {
		Income("收入", 1),SeatMeter("座公里收入",2),HourIncome("小时收入",3),Passengers("旅客量",4),SeatRate("客座率",5),AveragePrice("平均票价",6)
		,DiscountRate("平均折扣",7),FlightNo("班次",8),FlightHour("飞行时间",9);
		// 成员变量
		private String name;
		private Integer index;

		// 构造方法
		private AirIndicatorType(String name, Integer index) {
			this.name = name;
			this.index = index;
		}

		// 普通方法
		public static String getNameByIndex(Integer index) {
			for (AirIndicatorType c : AirIndicatorType.values()) {
				if (c.getIndex() == index) {
					return c.name;
				}
			}
			return null;
		}

		// get set 方法
		public String getName() {
			return name;
		}

		public Integer getIndex() {
			return index;
		}
	}
	
	// 预算类型：1首航，2易生支付，3易生预付卡
	public enum BudgetType {
		CAIncome("首航收入", 1), YSPay("易生支付",2), PrepaidCard("易生预付卡",3),CASeatMeter("首航座公里收入",4)
		,CAHourIncome("首航小时收入",5),CAPassengers("首航旅客量",6),CASeatRate("首航客座率",7),CAAveragePrice("首航平均票价",8)
		,CADiscountRate("首航平均折扣",9),CAFlightNo("首航班次",10),CAFlightHour("首航飞行时间",11);
		// 成员变量
		private String name;
		private Integer index;

		// 构造方法
		private BudgetType(String name, Integer index) {
			this.name = name;
			this.index = index;
		}

		// 普通方法
		public static String getNameByIndex(Integer index) {
			for (BudgetType c : BudgetType.values()) {
				if (c.getIndex() == index) {
					return c.name;
				}
			}
			return null;
		}

		// get set 方法
		public String getName() {
			return name;
		}

		public Integer getIndex() {
			return index;
		}
	}
	
	/**
	 * 报表类型
	 * @author lenovo
	 *
	 */
	public enum ReportType {
		Daily("日报",1),Monthly("月报",3),Yearly("年报",4);
		private String name;
		private Integer index;
		
		public String getName() {
			return name;
		}

		public Integer getIndex() {
			return index;
		}

		private ReportType (String name,Integer index){
			this.name=name;
			this.index = index;
		}
		
		public static String getNameByIndex(Integer index){
			for (ReportType c : ReportType.values()) {
				if (c.getIndex() == index) {
					return c.name;
				}
			}
			return null;
		}
	}
	
	/**
	 * 报表类型（英文版）
	 * @author lenovo
	 *
	 */
	public enum ReportTypeEn {
		Daily("daily report",1),Monthly("monthly report",3),Yearly("annual report",4);
		private String name;
		private Integer index;
		
		public String getName() {
			return name;
		}

		public Integer getIndex() {
			return index;
		}

		private ReportTypeEn (String name,Integer index){
			this.name=name;
			this.index = index;
		}
		
		public static String getNameByIndex(Integer index){
			for (ReportTypeEn c : ReportTypeEn.values()) {
				if (c.getIndex() == index) {
					return c.name;
				}
			}
			return null;
		}
	}
	
	/**
	 * 航空公司指标类型
	 * @author lenovo
	 *
	 */
	public enum IndicatorType {
		Income("收入",1),AveragePrice("平均房价",2),RevPar("RevPar",3),RentRate("出租率",4);
		private String name;
		private Integer index;
		
		public String getName() {
			return name;
		}

		public Integer getIndex() {
			return index;
		}

		private IndicatorType (String name,Integer index){
			this.name=name;
			this.index = index;
		}
		
		public static String getNameByIndex(Integer index){
			for (IndicatorType c : IndicatorType.values()) {
				if (c.getIndex() == index) {
					return c.name;
				}
			}
			return null;
		}
	}
	
	
	//~~~~~~~~~~~~~~~~~report使用的枚举~~~~~~~~~~~~
	
	/**
	 * 报表报送状态
	 * 
	 * @author yt
	 * 
	 */
	public enum ReportStatus_Report {
		Success("成功", 1), Failure("失败", 0);
		private String name;
		private Integer index;

		private ReportStatus_Report(String name, Integer index) {
			this.name = name;
			this.index = index;
		}

		public String getName() {
			return this.name;
		}

		public Integer getIndex() {
			return this.index;
		}

		// 普通方法
		public static String getNameByIndex(Integer value) {
			for (ReportStatus_Report c : ReportStatus_Report.values()) {
				if (c.getIndex().equals(value)) {
					return c.name;
				}
			}
			return null;
		}
	}
	
	/**
	 * 报表类型
	 * 
	 * @author yt
	 * 
	 */
	public enum ReportType_Report {
		BudgetExecute("预算执行表",1), CashFlowExecute("现金流量执行表",2), Investment1("非并购类投资表", 3), Investment2("并购类投资表", 4), FinancingAccount("融资下账表", 5),
		FinancingExpend("融资性支出表", 6),ProductManage("生产经营表", 7),DebtStock("存量负债表", 8);
		private Integer value;
		private String name;

		private ReportType_Report(String name, int value) {
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return this.name;
		}

		public Integer getIndex() {
			return this.value;
		}
		
		//返回具体事例
		public static ReportType_Report getReportTypeInstance(Integer value){
			for (ReportType_Report c : ReportType_Report.values()) {
				if (c.getIndex().equals(value)) {
					return c;
				}
			}
			return null;
		}

		// 普通方法
		public static String getNameByIndex(Integer value) {
			for (ReportType_Report c : ReportType_Report.values()) {
				if (c.getIndex().equals(value)) {
					return c.name;
				}
			}
			return null;
		}

	}
	
	
	/**
	 * 上报频率类型(1年 2半年 3季度 4月 5旬 6周 7天)
	 * @author yt
	 *
	 */
	public enum TermType{
		Year("年",1),HalfYear("半年",2),Quarter("季度",3),Month("月",4),Nineties("旬",5),Week("周",6),Day("天",7);
		private String name;
		private Integer value;
		private TermType(String name, Integer value) {
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return this.name;
		}

		public Integer getValue() {
			return this.value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}
		
		// 普通方法
		public static String getName(Integer value) {
			for (TermType c : TermType.values()) {
				if (c.getValue().equals(value)) {
					return c.name;
				}
			}
			return null;
		}
		//通过值获取没觉对象
		public static  TermType getTermType(Integer value) {
			for (TermType c : TermType.values()) {
				if (c.getValue().equals(value)) {
					return c;
				}
			}
			return null;
		}
	}
	
	//~~~~~~~~~~~~report结束~~~~~~~~~~~~
	
	/**
	 * 航空公司
	 * @author yt
	 * 公司英文简称http://www.hnagroup.com/index.php/industry?submenu=aviation
	 */
	public enum AirlineCompany{
		HU("9","HU","HNA","海南航空","海南航空股份有限公司","HAINAN AIRLINES","1","1"),
		JD("4477","JD","CBJ","首都航空","北京首都航空有限公司","Capital Airlines","9","124"),
		Y8("13","Y8","YZR","扬子江快运","扬子江快运航空有限公司","Yangtze River Airlines","5","99"),
		$8L("1990","8L","LKE","祥鹏航空","云南祥鹏航空有限责任公司","Luky Air","6","106"),
		PN("5732","PN","CHB","西部航空","西部航空有限责任公司","West Air","12","152" ),
		GS("4248","GS","GCR","天津航空","天津航空司有限责任公司","Tianjin Airlines","7","111"),
		CN("6381","CN","GDC","大新华航空","大新华航空有限公司","","1","1"),
		UQ("102024","UQ","CUH","乌鲁木齐航空","乌鲁木齐航空有限责任公司","Urumqi Air","17","236"),
		FU("102025","FU","FZA","福州航空","福州航空有限责任公司","FUZHOU AIRLINES","18","248"),
		GX("801775","GX","CBG","北部湾航空","广西北部湾航空司有限责任公司","GX Airlines","19","261"),
		$9H("11","9H","CGN","长安航空","长安航空有限责任公司","AIR CHAGNAN","",""),//未知值班类型，值班类型子类
		GT("801547","GT","CGH","桂林航空","桂林航空有限公司","Guilin Airlines & Tourism Group","20","285");
		
		private String nodeId;//公司编号
		private String airCode;//航空公司二字码
		private String yhsCompanyCode;//银湖系统公司代码
		private String companyShortName;//公司简称
		private String companyFullName;//公司全称
		private String companyEnglishName;//公司英文简称
		private String cniTypeId;//值班类型Id
		private String cnvcClassContent;//值班类型子类id
		
		private AirlineCompany(String nodeId, String airCode,String yhsCompanyCode,
				String companyShortName,String companyFullName,String companyEnglishName, String cniTypeId,String cnvcClassContent) {
			this.nodeId = nodeId;
			this.airCode = airCode;
			this.yhsCompanyCode = yhsCompanyCode;
			this.companyShortName = companyShortName;
			this.companyEnglishName = companyEnglishName;
			this.companyFullName = companyFullName;
			this.cniTypeId = cniTypeId;
			this.cnvcClassContent = cnvcClassContent;
		}
		/**
		 * 公司编号
		 * @return String 
		 */
		public String getNodeId() {
			return nodeId;
		}
		/**
		 * 航空公司二字码
		 * @return String 
		 */
		public String getAirCode() {
			return airCode;
		}
		
		/**
		 * 银湖系统公司代码
		 * @return
		 */
		public String getYhsCompanyCode() {
			return yhsCompanyCode;
		}
		/**
		 * 公司简称
		 * @return String 
		 */
		public String getCompanyShortName() {
			return companyShortName;
		}
		/**
		 * 公司英文简称
		 * @return
		 */
		public String getCompanyEnglishName() {
			return companyEnglishName;
		}
		/**
		 * 公司全称
		 * @return String 
		 */
		public String getCompanyFullName() {
			return companyFullName;
		}
		/**
		 * 值班类型Id
		 * @return
		 */
		public String getCniTypeId() {
			return cniTypeId;
		}
		/**
		 * 值班类型子类id
		 * @return
		 */
		public String getCnvcClassContent() {
			return cnvcClassContent;
		}
		/**
		 * 通过航空公司二字码获取枚举对象
		 * @param airCode 航空公司二字码
		 * @return
		 */
		public static AirlineCompany getHnaCompanyByAirCode(String airCode) {
			for (AirlineCompany c : AirlineCompany.values()) {
				if (c.getAirCode().equals(airCode)) {
					return c;
				}
			}
			return null;
		}
	}


	/**
	 * 报表类型(业态)
	 *
	 * @author yt 
	 *
	 */
	public enum OperateIndustry {
		/**
		 *运营_银行业
		 */
		BankingDustry("IND006"),
		/**
		 * 运营_担保业
		 */
		GuaranteeIndustry("IND007"),
		/**
		 * 运营_信托业
		 */
		TrustIndustry("IND005"),
		/**
		 * 运营_证券业
		 */
		SecuritiesIndustry("IND004"),
		/**
		 * 运营_租赁业
		 */
		LeasingIndustry("IND001"),
		/**
		 * 运营_人寿保险业
		 */
		LifeinsuranceIndustry("IND002"),
		/**
		 * 运营_财产保险业
		 */
		PropertyInsurance("IND003");



		private String value;



		OperateIndustry(String value) {
			this.value = value;

		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}



	}




	/**
	 * 公司编号
	 *
	 */
	public enum CompanyInfo{
		
		/**
		 * 公司名称:Avolon
		 */
		CP001("CP001","Avolon"),
		/**
		 * 公司名称:Seaco
		 */
		CP002("CP002","Seaco"),
		/**
		 * 公司名称:Sino
		 */
		CP003("CP003","Sino"),
		/**
		 * 公司名称:TIP
		 */
		CP004("CP004","TIP"),
		/**
		 * 公司名称:安徽肥东农村商业银行
		 */
		CP005("CP005","安徽肥东农村商业银行"),
		/**
		 * 公司名称:安徽肥西农村商业银行
		 */
		CP006("CP006","安徽肥西农村商业银行"),
		/**
		 * 公司名称:保险工作组
		 */
		CP007("CP007","保险工作组"),
		/**
		 * 公司名称:本源基金筹备组
		 */
		CP008("CP008","本源基金筹备组"),
		/**
		 * 公司名称:渤海担保
		 */
		CP009("CP009","渤海担保"),
		/**
		 * 公司名称:渤海金控
		 */
		CP010("CP010","渤海金控"),
		/**
		 * 公司名称:渤海金控投资股份有限公司（整体）
		 */
		CP01001("CP01001","渤海金控整体"),
		/**
		 * 公司名称:渤海金控投资股份有限公司（含三家）
		 */
		CP01002("CP01002","渤海金控含三家"),
		/**
		 * 公司名称:渤海金控投资股份有限公司（上市公司）
		 */
		CP01003("CP01003","渤海金控上市公司"),
		/**
		 * 公司名称:渤海人寿
		 */
		CP011("CP011","渤海人寿"),
		/**
		 * 公司名称:渤海信托
		 */
		CP012("CP012","渤海信托"),
		/**
		 * 公司名称:渤海租赁
		 */
		CP013("CP013","渤海租赁"),
		/**
		 * 公司名称:海航珺府
		 */
		CP014("CP014","海航珺府"),
		/**
		 * 公司名称:海航资本集团
		 */
		CP015("CP015","海航资本集团"),
		/**
		 * 公司名称:海航二总部数据
		 */
		CP01501("CP01501","海航二总部数据"),
		/**
		 * 公司名称:华安财险数据
		 */
		CP01502("CP01502","华安财险数据"),
		/**
		 * 公司名称:联讯证券数据
		 */
		CP01503("CP01503","联讯证券数据"),
		/**
		 * 公司名称:中合融资担保
		 */
		CP016("CP016","中合融资担保"),
		/**
		 * 公司名称:营口沿海银行
		 */
		CP017("CP017","营口沿海银行"),
		/**
		 * 公司名称:燕山创投
		 */
		CP018("CP018","燕山创投"),
		/**
		 * 公司名称:香港国际租赁
		 */
		CP019("CP019","香港国际租赁"),
		/**
		 * 公司名称:皖江金租
		 */
		CP020("CP020","皖江金融"),
		/**
		 * 公司名称:通汇&扬子江
		 */
		CP021("CP021","通汇&扬子江"),
		/**
		 * 公司名称:通汇
		 */
		CP02101("CP02101","通汇"),
		/**
		 * 公司名称:扬子江
		 */
		CP02102("CP02102","扬子江"),
		/**
		 * 公司名称:天津滨海农村商业银行
		 */
		CP022("CP022","天津滨海农村商业银行"),
		/**
		 * 公司名称:天航金融
		 */
		CP023("CP023","天航金融"),
		/**
		 * 公司名称:联讯证券
		 */
		CP024("CP024","联讯证券"),
		/**
		 * 公司名称:聚宝金控-小贷
		 */
		CP025("CP025","聚宝金控-小贷"),
		/**
		 * 公司名称:聚宝金控
		 */
		CP026("CP026","聚宝金控"),
		/**
		 * 公司名称:聚宝互联
		 */
		CP027("CP027","聚宝互联"),
		/**
		 * 公司名称:华安财险
		 */
		CP028("CP028","华安财险"),
		/**
		 * 公司名称:横琴租赁
		 */
		CP029("CP029","横琴租赁"),
		/**
		 * 纽约二部
		 */
		CP030("CP030","纽约二部");
		
		private String corpId;
		
		private String corpName;
		
		
		public String getCorpId() {
			return corpId;
		}


		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}


		public String getCorpName() {
			return corpName;
		}


		public void setCorpName(String corpName) {
			this.corpName = corpName;
		}


		private CompanyInfo(String corpId, String corpName) {
			this.corpId = corpId;
			this.corpName = corpName;
		}
		
		public static String CorpName(String corpId){
			for (CompanyInfo c : CompanyInfo.values()) {
				if (c.getCorpId().equals(corpId)) {
					return c.getCorpName();
				}
			}
			return "#";
		}

	}

	/**
	 * 项目阶段
	 *
	 */
	public enum ProjectStageEnum {

		//1.潜在项目 2.签署NDA（保密协议）的项目 3.签署意向性协议的项目 4.签署SPA（交易协议）的项目

		/**
		 * 潜在项目
		 */
		POTENTIALPROJECT(1, "潜在项目"),


		/**
		 * 签署NDA（保密协议）的项目
		 */
		SIGNNDAAGREEMENT(2, "签署NDA（保密协议）"),

		/***
		 * 签署意向性协议的项目
		 */
		SIGNINTENTIONAGREEMENT(3, "签署意向性协议"),

		/***
		 * 签署SPA（交易协议）的项目
		 */
		SIGNSPAAGREEMENT(4, "签署SPA（交易协议）"),
		/***
		 * 已中止的项目
		 */
		SUSPEND(5, "已中止"),

		/***
		 * 已结束的项目
		 */
		FINISHED(6, "已结束");
		private Integer stageId;
		private String stageName;


		ProjectStageEnum(Integer stageId, String stageName) {
			this.stageId = stageId;
			this.stageName = stageName;
		}

		public Integer getStageId() {
			return stageId;
		}

		public void setStageId(Integer stageId) {
			this.stageId = stageId;
		}

		public String getStageName() {
			return stageName;
		}

		public void setStageName(String stageName) {
			this.stageName = stageName;
		}

		/**
		 * 根据stageId 得到枚举类型项目状态
		 *
		 * @param stageId
		 * @return
		 */
		public static List<Map<String, String>> getProjectStatusEnumByStageId(Integer stageId) {
			List<Map<String, String>> list = new ArrayList<Map<String, String>>();

			for (ProjectStageEnum s : ProjectStageEnum.values()) {
				if(s.stageId >= stageId) {
					Map<String, String> map = new HashMap();
					map.put(s.stageId.toString(), s.stageName);
					list.add(map);
				}
			}

			return list;
		}

	}
	
}

