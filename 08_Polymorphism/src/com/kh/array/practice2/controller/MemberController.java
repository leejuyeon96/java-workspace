package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {

	private Member[] mArr = new Member[3];

	public int count = 0;

	public void insertMember(Member m) {

		mArr[count++] = new Member(m.getId(), m.getName(), m.getPassword(), m.getEmail(), m.getGender(), m.getAge());
		// new Member(id, name, password, email, gender, age);
	}

	public boolean updateMember(String id, String name, String password, String email) {// checkId 활용! <--index //추가처럼
																						// 수정도 같은 방식 해당인덱스 값에 넣는 방식
																						// setter 이용!

		int index = this.checkId(id);
		if (index != -1) {
			mArr[index].setName(name);
			mArr[index].setPassword(password);
			mArr[index].setEmail(email);
			return true;

		}
		return false;
	}

	public int checkId(String id) { // 객체 배열 값들 for 문 돌려서 일치한지 확인해서 return 값
		for (int i = 0; i < mArr.length; i++) {

			if (mArr[i] != null && mArr[i].getId().equals(id)) {
				return i;
			}

		}
		return -1;
	}

	public Member[] printAll() {
		return mArr;
	}

}
