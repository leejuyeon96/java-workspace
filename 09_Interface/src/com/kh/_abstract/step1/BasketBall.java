package com.kh._abstract.step1;

public class BasketBall extends Sports{

	public BasketBall(int numberOfplayers) {
		super(numberOfplayers);
		
	}

	@Override //강제
	public void rule() {
		
		System.out.println("BasketBall의 선수는" + this.numberOfplayers + "명, 공을 던져서 링에 넣어야한다.");
	}

}
