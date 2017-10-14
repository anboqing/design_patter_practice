package anboqing;

public class ConcreateComponent extends Component {
	private String attribute = "Concreate Component attribute";
	@Override
	public void operation() {
		System.out.println(attribute);
	}

}
