//Write a test suite for this code, covering as many different outcomes as you can.
//
//Feel free to improve the blackjack code as well, but remember to test any improvements you've made!

package com.liambass.junitexercises;

public class Blackjack {
	public static int play(int dealer, int player) {

		if (dealer < 2 || player < 2) {
			return -1;
		} else if (dealer > 21 && player > 21) {
			return 0;
		} else if (dealer > 21) {
			return player;
		} else if (player > 21) {
			return dealer;
		}
		return Math.max(dealer, player);
	}
}
