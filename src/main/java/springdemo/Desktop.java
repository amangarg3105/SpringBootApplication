package springdemo;


import org.springframework.stereotype.Component;

public class Desktop implements Model {

	Desktop() {
		System.out.println("Desktop Instance created");
	}

	@Override
	public void processing() {
       System.out.println("Doing on Desktop");
	}
}
