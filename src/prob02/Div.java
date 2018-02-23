package prob02;

public class Div implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0)
		{
			System.out.println("[0으로 나눌수 없습니다.]");
			return 0;
		}
		return a/b;
	}

}