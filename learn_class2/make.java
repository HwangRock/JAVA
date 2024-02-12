package learn_class2;

public class make {
    String name;
	double volume,weight;
	public void setName(String a) {
		this.name=a;
	}
	public void setVolume(double a) {
		this.volume=a;
	}
	public void setWeight(double a) {
		this.weight=a;
	}
	public double density() {
		return weight/volume;
	}
}
