import org.webmacro.ResourceException;
import org.webmacro.Template;
import org.webmacro.servlet.HandlerException;
import org.webmacro.servlet.WMServlet;
import org.webmacro.servlet.WebContext;


public class HelloWMServlet extends WMServlet {

	@Override
	public Template handle(WebContext cont) throws HandlerException {
		String[][] exam = {
				{"A", "B", "C"},
				{"1", "2", "3"},
		};
		// TODO Auto-generated method stub
		try {
			cont.put("sayThis", "Hello!");
			cont.put("exam", exam);
			return this.getTemplate("hello.wm");
		} catch (ResourceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new HandlerException(e.getMessage());
		}
	}

}
