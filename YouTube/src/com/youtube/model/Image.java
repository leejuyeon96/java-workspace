package com.youtube.model;

import java.util.Date;

public class Image {
private String title;
	public User user;
	private Date uploadAt;
	private int views;
	private String imgUrl;
	private String fileUrl;
	private String desc;
	public Image() {
		
	}
	public Image(String title, Date uploadAt, int views, String imgUrl, String fileUrl, String desc) {
		
		this.title = title;
		this.uploadAt = uploadAt;
		this.views = views;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
		this.desc = desc;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getUploadAt() {
		return uploadAt;
	}
	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Image [title=" + title + ", uploadAt=" + uploadAt + ", views=" + views + ", imgUrl=" + imgUrl
				+ ", fileUrl=" + fileUrl + ", desc=" + desc + "]";
	}
	
	
}
