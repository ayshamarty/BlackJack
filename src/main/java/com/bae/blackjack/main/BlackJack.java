package com.bae.blackjack.main;


public class BlackJack {
	public static void main(String[] args) {

	}
	
	public int play(int player, int dealer) {
		int winner = 0;
		if ((player > 30 && dealer > 21) || (player < 4 || dealer < 4 || player > 30 || dealer > 30)) {
			winner = -1;
		}		
		else if (player > 21 && dealer > 21) {
			winner = 0;
		}
		else if (player > 21 && dealer < 16) {
			int twist = twist();
			if(twist == 11 && dealer + twist > 21) {
				twist = 1;
				}
			dealer += twist;
			winner = dealer;
		}
		else if ((player > dealer && player <= 21) || dealer > 21) {
			winner = player;
		} else if ((dealer >= player && dealer <= 21) || (player > 21)) {
			winner = dealer;
		} 
		return winner;	
	}
	public int twist() {
		int a = (int) (Math.random()*10) + 2;
		System.out.println(a);
		return a;
	}
}
