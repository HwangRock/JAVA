public class calculate {
	public int result;
	public int calculator(int a,int b, char c) {
		switch(c) {
			case '+': result=a+b;
				break;
			case '-': result=a-b;
				break;
			case '*': result=a*b;
				break;
			case '/': result=a/b;
				break;
			case '%': result=a%b;
				break;
		}
		return result;
	}
}