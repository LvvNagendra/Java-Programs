package java8;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	void test() ;
	//void nani();
	default void nani() {
		System.out.println("defultMethod");
	}

}
