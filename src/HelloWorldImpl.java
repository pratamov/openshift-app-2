import javax.jws.WebService;

@WebService(endpointInterface="HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String helloWorld(String param) {
		return "Hello " + param;
	}

}
