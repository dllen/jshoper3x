package com.jshop.entity;

// Generated 2013-9-19 19:12:29 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ImgT generated by hbm2java
 */
@Entity
@Table(name = "img_t", catalog = "jshoper3")
public class ImgT implements java.io.Serializable {

	private String imgId;
	private String imgName;
	private String usedGoodsid;
	private String imgType;
	private String imgHref;
	private String des;
	private String imgTypeId;
	private String imgTypeName;
	private String usedPositionName;
	private String usedPositionId;
	private Integer versiont;
	private String usedGoodsname;
	private Date createtime;
	private String creatorid;
	private String state;

	public ImgT() {
	}

	public ImgT(String imgId, String imgHref, Date createtime,
			String creatorid, String state) {
		this.imgId = imgId;
		this.imgHref = imgHref;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.state = state;
	}

	public ImgT(String imgId, String imgName, String usedGoodsid,
			String imgType, String imgHref, String des, String imgTypeId,
			String imgTypeName, String usedPositionName, String usedPositionId,
			Integer versiont, String usedGoodsname, Date createtime,
			String creatorid, String state) {
		this.imgId = imgId;
		this.imgName = imgName;
		this.usedGoodsid = usedGoodsid;
		this.imgType = imgType;
		this.imgHref = imgHref;
		this.des = des;
		this.imgTypeId = imgTypeId;
		this.imgTypeName = imgTypeName;
		this.usedPositionName = usedPositionName;
		this.usedPositionId = usedPositionId;
		this.versiont = versiont;
		this.usedGoodsname = usedGoodsname;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.state = state;
	}

	@Id
	@Column(name = "IMG_ID", unique = true, nullable = false, length = 20)
	public String getImgId() {
		return this.imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	@Column(name = "IMG_NAME", length = 45)
	public String getImgName() {
		return this.imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	@Column(name = "USED_GOODSID", length = 20)
	public String getUsedGoodsid() {
		return this.usedGoodsid;
	}

	public void setUsedGoodsid(String usedGoodsid) {
		this.usedGoodsid = usedGoodsid;
	}

	@Column(name = "IMG_TYPE", length = 10)
	public String getImgType() {
		return this.imgType;
	}

	public void setImgType(String imgType) {
		this.imgType = imgType;
	}

	@Column(name = "IMG_HREF", nullable = false, length = 225)
	public String getImgHref() {
		return this.imgHref;
	}

	public void setImgHref(String imgHref) {
		this.imgHref = imgHref;
	}

	@Column(name = "DES", length = 100)
	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	@Column(name = "IMG_TYPE_ID", length = 20)
	public String getImgTypeId() {
		return this.imgTypeId;
	}

	public void setImgTypeId(String imgTypeId) {
		this.imgTypeId = imgTypeId;
	}

	@Column(name = "IMG_TYPE_NAME", length = 45)
	public String getImgTypeName() {
		return this.imgTypeName;
	}

	public void setImgTypeName(String imgTypeName) {
		this.imgTypeName = imgTypeName;
	}

	@Column(name = "USED_POSITION_NAME", length = 45)
	public String getUsedPositionName() {
		return this.usedPositionName;
	}

	public void setUsedPositionName(String usedPositionName) {
		this.usedPositionName = usedPositionName;
	}

	@Column(name = "USED_POSITION_ID", length = 20)
	public String getUsedPositionId() {
		return this.usedPositionId;
	}

	public void setUsedPositionId(String usedPositionId) {
		this.usedPositionId = usedPositionId;
	}

	@Column(name = "VERSIONT")
	public Integer getVersiont() {
		return this.versiont;
	}

	public void setVersiont(Integer versiont) {
		this.versiont = versiont;
	}

	@Column(name = "USED_GOODSNAME", length = 100)
	public String getUsedGoodsname() {
		return this.usedGoodsname;
	}

	public void setUsedGoodsname(String usedGoodsname) {
		this.usedGoodsname = usedGoodsname;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}