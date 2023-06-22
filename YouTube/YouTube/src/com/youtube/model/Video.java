package com.youtube.model;

import java.util.Date;
import java.util.List;

public class Video {

	private String title;
	public User user;
	private Date uploadAt;
	private int views;
	private String imgUrl;
	private String fileUrl;
	private String desc;
	private char kind; //shorts & video 둘 중 하나!
	
	private List<Comment> comments;
	private Category category;
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
	public char getKind() {
		return kind;
	}
	public void setKind(char kind) {
		this.kind = kind;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	//Create 추가 Read 읽기 Update 수정 Delete 삭제
	//로그인
	//회원가입
	//프로필 보기
	//프로필 수정
	//계정 삭제
	
	
	/*영상 업로드
	 *영상 목록
	 *영상 1개 보기
	 *동영상 수정
	 *동영상 삭제
	 */

}