package cn.cash.register.dao.domain;

import java.util.Date;

import cn.cash.register.util.AssertUtil;

public class SupplierInfo extends BaseDomain {
    /**  */
    private static final long serialVersionUID = 7651373595491664603L;

    private Long              id;

    private String            supplierCode;

    private String            supplierName;

    private String            pinyinCode;

    private String            contactName;

    private String            contactPhone;

    private String            contactEmail;

    private Boolean           status;

    private Double            deliveryRebate;

    private Double            regularRebate;

    private String            supplierAddress;

    private String            remark;

    private Date              gmtUpdate;

    private Date              gmtCreate;

    public void validate() {
        AssertUtil.assertNotBlank(supplierCode, "供货商编号不能为空");
        AssertUtil.assertNotBlank(supplierName, "供货商名称不能为空");
        AssertUtil.assertNotNull(status, "供货商状态不能为空");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode == null ? null : pinyinCode.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getDeliveryRebate() {
        return deliveryRebate;
    }

    public void setDeliveryRebate(Double deliveryRebate) {
        this.deliveryRebate = deliveryRebate;
    }

    public Double getRegularRebate() {
        return regularRebate;
    }

    public void setRegularRebate(Double regularRebate) {
        this.regularRebate = regularRebate;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress == null ? null : supplierAddress.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}