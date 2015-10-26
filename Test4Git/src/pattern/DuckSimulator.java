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
		 * 存在的问题：只有包装的对象才可统计到叫声次数。
		 * 改进：将创建鸭子的程序集中在一个地方，即将创建和装饰的过程包装起来。
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
