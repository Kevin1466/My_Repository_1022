package pattern;

import pattern.compound.Quackable;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		AbstractGooseFactory gooseFactory = new CountingGooseFactory();
//		simulator.simulate();
		simulator.simulate(duckFactory);
	}
	
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable gooseDuck = new GooseAdapter(new Goose());
//		Quackable goose = gooseFactory
		
		System.out.println("\nDuck simulator: with Composite - Flocks");
		
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallards = new Flock();
		
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck simulator: Whole Flock Simulation");
		simulate(flockOfDucks);
		
		System.out.println("\nDuck simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);
		
//		simulate(mallardDuck);
//		simulate(redheadDuck);
//		simulate(rubberDuck);
//		simulate(duckCall);
//		simulate(gooseDuck);
		
		System.out.println("The ducks quacked "+QuackCounter.getQuacks() + " times");
	}
	
	void simulate() {
		
		/**
		 * ���ڵ����⣺ֻ�а�װ�Ķ���ſ�ͳ�Ƶ�����������
		 * �Ľ���������Ѽ�ӵĳ�������һ���ط�������������װ�εĹ��̰�װ������
		 */
		Quackable mallardDuck = new QuackCounter(new MallardDuck()); 
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable rubberDuck = new QuackCounter (new RubberDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(rubberDuck);
		simulate(duckCall);
		simulate(gooseDuck);
		
		System.out.println("The ducks quacked "+QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}

}
