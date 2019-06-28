public class RemoveA {
	public String remove(String s) {
		String res = "";
		if(s == "")
			return res;
		if(s.charAt(0) =='A') {
			if(s.charAt(1) == 'A') {
				for(int i = 2;i < s.length();i++)
					res += s.charAt(i);
			}
			else if(s.charAt(1) != 'A') {
				for(int i = 1;i < s.length();i++)
					res += s.charAt(i);
			}
		}
		if(s.charAt(0) != 'A') {
			if(s.charAt(1) == 'A') {
				res += s.charAt(0);
				for(int i = 2;i < s.length();i++)
					res += s.charAt(i);
			}
			if(s.charAt(1) != 'A') {
				res = s;
			}
		}
		return res;
	}
}

