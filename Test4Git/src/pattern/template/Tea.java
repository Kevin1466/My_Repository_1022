package pattern.template;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Steaping tea leaves");
	}

	@Override
	void addCondiments() {
		System.out.println("Add lemon");
	}

}
