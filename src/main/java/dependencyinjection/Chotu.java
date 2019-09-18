package dependencyinjection;

import springdemo.Laptop;

public class Chotu {

	Desktop desktop;

	MobileDevice mobileDevice;



	public void setDesktop(Desktop desktop) {
		this.desktop = desktop;
	}


	public void setMobileDevice(MobileDevice laptop) {
		this.mobileDevice = laptop;
	}


	public static void main(String[] args) {
		Chotu chotu = new Chotu();
		chotu.setDesktop(null);
		chotu.setMobileDevice(null);


		Chotu chotu1 = new Chotu();
		chotu1.setMobileDevice(null);
	}

}
