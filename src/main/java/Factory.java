
public class Factory {
	static Math math = new Math();
	
	public static Math getObject() {
		return math;
	}

}
