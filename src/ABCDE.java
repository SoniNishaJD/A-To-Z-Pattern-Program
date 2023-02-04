
public class ABCDE {

	public static void main(String[] args) {

		ABCDE pattern001 = new ABCDE();
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		pattern001.text(str);
		System.out.println();
		// str="PQRSTUVWXYZ";
		// pattern001.text(str);
	}

	public void text(String str) {
		int r = 5;
		int c = 8;
		// String str = "ABCDEFGHIJKLMNOP";
		String word = "";
		for (int i = 0; i < r; i++) {
			for (int k = 0; k < str.length(); k++) {
				if (str.charAt(k) == 'A') {
					word = AA[i];
				} else if (str.charAt(k) == 'B') {
					word = BB[i];
				} else if (str.charAt(k) == 'C') {
					word = CC[i];
				} else if (str.charAt(k) == 'D') {
					word = DD[i];
				} else if (str.charAt(k) == 'E') {
					word = EE[i];
				} else if (str.charAt(k) == 'F') {
					word = FF[i];
				} else if (str.charAt(k) == 'G') {
					word = GG[i];
				} else if (str.charAt(k) == 'H') {
					word = HH[i];
				} else if (str.charAt(k) == 'I') {
					word = II[i];
				} else if (str.charAt(k) == 'J') {
					word = JJ[i];
				} else if (str.charAt(k) == 'K') {
					word = KK[i];
				} else if (str.charAt(k) == 'L') {
					word = LL[i];
				} else if (str.charAt(k) == 'M') {
					word = MM[i];
				} else if (str.charAt(k) == 'N') {
					word = NN[i];
				} else if (str.charAt(k) == 'O') {
					word = OO[i];
				} else if (str.charAt(k) == 'P') {
					word = PP[i];
				} else if (str.charAt(k) == 'Q') {
					word = QQ[i];
				} else if (str.charAt(k) == 'R') {
					word = RR[i];
				} else if (str.charAt(k) == 'S') {
					word = SS[i];
				} else if (str.charAt(k) == 'T') {
					word = TT[i];
				} else if (str.charAt(k) == 'U') {
					word = UU[i];
				} else if (str.charAt(k) == 'V') {
					word = VV[i];
				} else if (str.charAt(k) == 'W') {
					word = WW[i];
				} else if (str.charAt(k) == 'X') {
					word = XX[i];
				} else if (str.charAt(k) == 'Y') {
					word = YY[i];
				} else if (str.charAt(k) == 'Z') {
					word = ZZ[i];
				} else {
					continue;
				}

				System.out.print("  ");
				for (int j = 0; j < c; j++) {
					if (word.charAt(j) == '1') {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
			}
			System.out.println();
		}

	}

	String AA[] = { "00011000", "00100100", "01000010", "01111110", "01000010" };
	String BB[] = { "01111000", "01000100", "01111000", "01000100", "01111000" };
	String CC[] = { "01111100", "10000000", "10000000", "10000000", "01111100" };
	String DD[] = { "01111100", "00100010", "00100010", "00100010", "01111100" };
	String EE[] = { "01111100", "01000000", "01111100", "01000000", "01111100" };
	String FF[] = { "11111111", "10000000", "11111000", "10000000", "10000000" };
	String GG[] = { "01111110", "10000000", "10000111", "10000001", "01111110" };
	String HH[] = { "10000001", "10000001", "11111111", "10000001", "10000001" };
	String II[] = { "11111111", "00011000", "00011000", "00011000", "11111111" };
	String JJ[] = { "11111111", "00001000", "00001000", "00001000", "00110000" };
	String KK[] = { "11000010", "11001100", "11110000", "11001100", "11000010" };
	String LL[] = { "10000000", "10000000", "10000000", "10000000", "11111111" };
	String MM[] = { "10000001", "10100101", "10011001", "10000001", "10000001" };
	String NN[] = { "10000001", "10110001", "10011001", "10001101", "10000001" };
	String OO[] = { "00111100", "01000010", "01000010", "01000010", "00111100" };
	String PP[] = { "11111100", "10000010", "11111100", "10000000", "10000000" };
	String QQ[] = { "00111100", "01000010", "01001010", "01000110", "00111001" };
	String RR[] = { "11111100", "11000110", "11111000", "11001100", "11000011" };
	String SS[] = { "01111111", "11000000", "01111110", "00000011", "11111110" };
	String TT[] = { "11111111", "00011000", "00011000", "00011000", "00011000" };
	String UU[] = { "10000001", "10000001", "10000001", "01000010", "00111100" };
	String VV[] = { "11000011", "01100110", "01100110", "00011000", "00011000" };
	String WW[] = { "10000001", "01000010", "01000010", "01011010", "00100100" };
	String XX[] = { "10000001", "00100100", "00011000", "00100100", "10000001" };
	String YY[] = { "11000011", "00100100", "00011000", "00011000", "00011000" };
	String ZZ[] = { "11111111", "00000110", "00011000", "01100000", "11111111" };

}
