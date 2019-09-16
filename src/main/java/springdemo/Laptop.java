package springdemo;


import org.springframework.stereotype.Component;

@Component
public class Laptop implements Model {

	Laptop() {
		System.out.println("Laptop Instance Created");
	}

	@Override
	public void processing() {
        System.out.println("Laptop doing processing");
	}
}
