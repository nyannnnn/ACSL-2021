
public class contest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "RGBWY";
		int fib[] = { 1, 1, 2, 3, 5 };
		String[] b = a.split("");
		int h = 0, m = 0, s = 0;

		// looping through 5 letters
		for (int i = 0; i < 5; i++) {

			// checking which color it belongs to
			if (b[i].equals("R"))
				h += fib[i];
			if (b[i].equals("G"))
				m += fib[i] * 5;
			if (b[i].equals("B"))
				s += fib[i] * 5;
			if (b[i].equals("Y")) {
				h += fib[i];
				m += fib[i] * 5;
			}
			if (b[i].equals("M")) {
				h += fib[i];
				s += fib[i] * 5;
			}
			if (b[i].equals("C")) {
				m += fib[i] * 5;
				s += fib[i] * 5;
			}

		}

		//checking if valid and if overbound
		while(h >= 12) {
			h -= 12;
		}
		while(m >= 60) {
			m -= 60;
			h++;
		}
		while(s >= 60) {
			s -= 60;
			m++;
		}
		
        System.out.println(String.format("%02d:%02d:%02d",h,m,s));


	}

}
