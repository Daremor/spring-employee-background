package ru.sberbark.employee.background.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.sberbark.employee.background.exception.EmployeeNotFoundException;
import ru.sberbark.employee.background.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		
		switch (id) {
			case 1:
				return new Employee(1, "hr6zdl@yandex.ru", "SBRF1234567", "+7-321-111-22-33");
			case 2:
				return new Employee(2, "pa5h@mail.ru", "SBRF1213156", "+7-123-222-33-44");
			case 3:
				return new Employee(3, "2shlaq@outlook.com", "SBRF1233123", "+7-213-555-66-66");
			case 4:
				return new Employee(4, "768ptl4nv@gmail.com", "SBRF1233321", "+7-213-666-66-66");
			default:
				throw new EmployeeNotFoundException("id-" + id);
		}

	}

}
