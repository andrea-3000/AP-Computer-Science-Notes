package rebaserPk;

import java.util.ArrayList;

public class Rebaser {
	
	private String str;

	public Rebaser() {
		str = "0";
	}
	
	public Rebaser(String value) {
		str = value;
	}
	
	public void setValue(String n) {
		str = n;
	}
	
	public String getValue() {
		return str;
	}
	
	public String convertToBaseN(int n) {
		int baseTen = Integer.parseInt(str);
		int temp = baseTen/n;
		int mod = baseTen % n;
		int completed = 0;
		
		int count = 0;
		while (temp > 0) {
			mod = baseTen % n;
			completed += mod*(int)Math.pow(10, count);
			count++;
			
			temp = temp/n;
		}
		
		String converted = Integer.toString(completed);
		return converted;
		
	}
		
	
	public String convertToBaseTen(int n) {
		String converted = "";
		int number = 0;
		int count = 0;
		
		
		for (int i = str.length()-1; i > -1; i --) {
			int temp = Integer.parseInt("" + str.charAt(i));
			
			if (temp >= n || n < 0 || temp < 0){
				converted = "-1";
			} else {
				number += temp*(int)Math.pow(n, count);
				count++;
			}
		}
		
		converted = Integer.toString(number);
		return converted;
		
	}
	
}
