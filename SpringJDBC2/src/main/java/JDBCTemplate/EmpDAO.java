package JDBCTemplate;

import java.util.List;

public interface EmpDAO {
	Employee getEmployeeByNo(Integer eno);

	List<Employee> getAllEmployees();

	boolean deleteEmployee(Employee e);

	boolean updateEmployee(Employee e);

	boolean createEmployee(Employee e);
}