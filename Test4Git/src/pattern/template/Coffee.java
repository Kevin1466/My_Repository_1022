package pattern.template;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Brewing coffee grinds");
	}

	@Override
	void addCondiments() {
		System.out.println("Add sugar and milk");
	}

}
