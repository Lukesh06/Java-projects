package Java8;

public class MyTestClass {

	public static void main(String[] args) {
		
		AdditionImpl additionImpl = new AdditionImpl();
		int result = additionImpl.add(10, 20);
		System.out.println(result);
		
		
		AdditionInterface obj = (a,b) -> a+b;
		
		int resultOfLembda = obj.add(100, 200);
		System.out.println(resultOfLembda);
		
		
		AdditionInterface obj2 = (a , b) -> {
			System.out.println("Welcome in world od addition");
			return a+b;
		};
		
		int resultOfLembda2 = obj2.add(100, 200);
		System.out.println(resultOfLembda2);
		
		

	}

}


 class  AdditionImpl implements AdditionInterface{

	@Override
	public int add(int a, int b) {
		System.out.println("Welcome in world od addition");
		return a+b;
	}
	 
 }