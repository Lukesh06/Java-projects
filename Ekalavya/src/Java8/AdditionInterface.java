package Java8;

@FunctionalInterface
public interface AdditionInterface {

	int add(int a, int b);

	static int substract(int x, int y) {
		return x - y;
	}
	
	default String sayHi(String name) {
		return "Hii "+ name;
	}

}
