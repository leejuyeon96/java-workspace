package com.youtube.model;

import java.util.Date;

public class Video {

	private String title;
	private String comment;
	private Date uploadAt;
	private int count;
	private String imgUrl;
	private String fileUrl;
	
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

	public Video() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getUploadAt() {
		return uploadAt;
	}

	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
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

	@Override
	public String toString() {
		return "Video [title=" + title + ", comment=" + comment + ", uploadAt=" + uploadAt + ", count=" + count
				+ ", imgUrl=" + imgUrl + ", fileUrl=" + fileUrl + "]";
	}

}

