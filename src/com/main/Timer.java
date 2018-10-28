package com.main;

/**
 * 计时器
 * @author Wang
 *
 */

public class Timer {
	/**
	 * 回合数
	 */
	int time;
	public Timer() {
		time = 0;
	}
	/**
	 * 进入下个回合
	 */
	void timegoby()
	{
		time++;
	}
}
