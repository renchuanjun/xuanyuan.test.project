package org.open.model;

import java.util.Date;
import java.util.UUID;

/**
 * 附件实体
 * @author Administrator
 *
 */
public class UploadModel implements java.io.Serializable{

	public UploadModel(){
		this.id = (UUID.randomUUID()).toString();
	}
	/**
	 * Guid，附件的主键
	 */
	private String id;
	/**
	 * 旧文件名称
	 */
	private String oldFileName;
	/**
	 * 新文件的名称
	 */
	private String newFileName;
	/**
	 * 下载路径
	 */
	private String filePath;
	/**
	 * 文件大小
	 */
	private long fileSize;
	/**
	 * 扩展名
	 */
	private String fileExt;
	/**
	 * 创建人主键
	 */
	private String createBy;
	/**
	 * 创建人姓名
	 */
	private String createByName;
	/**
	 * 创建日期
	 */
	private Date createOn;
	/**
	 * 分类
	 */
	private String categoryId;
	/**
	 * 业务数据主线
	 */
	private String objectId;
	/**
	 * 附件的操作状态(增1,删2,改3,查4)
	 */
	private Integer operateState;
	/***
	 * FastDFS的组
	 */
	private String group;

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOldFileName() {
		return oldFileName;
	}
	public void setOldFileName(String oldFileName) {
		this.oldFileName = oldFileName;
	}
	public String getNewFileName() {
		return newFileName;
	}
	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileExt() {
		return fileExt;
	}
	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getCreateByName() {
		return createByName;
	}
	public void setCreateByName(String createByName) {
		this.createByName = createByName;
	}
	public Date getCreateOn() {
		return createOn;
	}
	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public Integer getOperateState() {
		return operateState;
	}
	public void setOperateState(Integer operateState) {
		this.operateState = operateState;
	}
}
