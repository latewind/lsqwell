package com.latewind.domain;
// Generated 2016-5-13 16:11:26 by Hibernate Tools 4.3.1.Final

/**
 * Materials generated by hbm2java
 */
public class Materials  {

	private Integer id;
	private String name;
	private String model;
	private Integer num;
	private String unit;
	private String prince;
	private Integer totalprice;
	private Integer userId;
	private Integer applicantId;
	private String sort;
	private String remark;
	private int userinfoId;
	private String status;
	private String processesInfo;

	public Materials() {
	}

	public Materials(int userinfoId) {
		this.userinfoId = userinfoId;
	}

	public Materials(String name, String model, Integer num, String unit, String prince, Integer totalprice,
			Integer userId, Integer applicantId, String sort, String remark, int userinfoId) {
		this.name = name;
		this.model = model;
		this.num = num;
		this.unit = unit;
		this.prince = prince;
		this.totalprice = totalprice;
		this.userId = userId;
		this.applicantId = applicantId;
		this.sort = sort;
		this.remark = remark;
		this.userinfoId = userinfoId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPrince() {
		return this.prince;
	}

	public void setPrince(String prince) {
		this.prince = prince;
	}

	public Integer getTotalprice() {
		return this.totalprice;
	}

	public void setTotalprice(Integer totalprice) {
		this.totalprice = totalprice;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getApplicantId() {
		return this.applicantId;
	}

	public void setApplicantId(Integer applicantId) {
		this.applicantId = applicantId;
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getUserinfoId() {
		return this.userinfoId;
	}

	public void setUserinfoId(int userinfoId) {
		this.userinfoId = userinfoId;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the processesInfo
	 */
	public String getProcessesInfo() {
		return processesInfo;
	}

	/**
	 * @param processesInfo the processesInfo to set
	 */
	public void setProcessesInfo(String processesInfo) {
		this.processesInfo = processesInfo;
	}

}
