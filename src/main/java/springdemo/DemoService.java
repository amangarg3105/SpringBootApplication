package springdemo;


import org.springframework.stereotype.Service;

@Service
public class DemoService {

	DemoService() {
		System.out.println("Demo Service Called");
	}
}
