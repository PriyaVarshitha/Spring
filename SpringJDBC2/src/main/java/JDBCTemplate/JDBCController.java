package JDBCTemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JDBCController {
	private final EmpDAO em;

	@Autowired
	public JDBCController(EmpDAO em) {
		this.em = em;
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("Home Page Requested");
		return "home";
	}

	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		System.out.println("all empolyee are printed");
		List<Employee> empList = em.getAllEmployees();
		System.out.println(empList);
		model.addAttribute("elist", empList);
		return "emplist";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAllEmployees(@Validated Employee e, Model model) {
		System.out.println("adding of  empolyee are printed");
		boolean add = em.createEmployee(e);
		model.addAttribute("empNo", e.getEmpNo());
		return "addp";
	}
}
