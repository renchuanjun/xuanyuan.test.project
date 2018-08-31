package org.open.model;

import java.util.Date;

public class XYParamModel implements java.io.Serializable{
    private String  id;

    private String excleType;

    private String companyId;

    private String dataBatch;

    private String headerField;

    private String dataId;

    private String userId;

    private String filePath;

    private Integer superAdmin;

    private Integer status;

    private Integer enabled;

    private String platformId;

    private String orgId;

    private String fullOrgId;

    private String businessId;

    private String createBy;

    private Date createOn;

    private String updateBy;

    private Date updateOn;

    private String datapermissionId;

    public String getExcleType() {
        return excleType;
    }

    public void setExcleType(String excleType) {
        this.excleType = excleType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getDataBatch() {
        return dataBatch;
    }

    public void setDataBatch(String dataBatch) {
        this.dataBatch = dataBatch;
    }

    public String getHeaderField() {
        return headerField;
    }

    public void setHeaderField(String headerField) {
        this.headerField = headerField;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(Integer superAdmin) {
        this.superAdmin = superAdmin;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getFullOrgId() {
        return fullOrgId;
    }

    public void setFullOrgId(String fullOrgId) {
        this.fullOrgId = fullOrgId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getDatapermissionId() {
        return datapermissionId;
    }

    public void setDatapermissionId(String datapermissionId) {
        this.datapermissionId = datapermissionId;
    }
}
