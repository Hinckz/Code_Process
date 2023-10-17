SELECT department_id, employee_id, employee_name, employee_salary
FROM ( SELECT department_id, employee_id, employee_name, employee_salary,
           ROW_NUMBER() OVER (PARTITION BY department_id ORDER BY employee_salary DESC) AS row_num
    FROM [employee_salary-1]) 
	AS ranked_employees
WHERE row_num <= 3
ORDER BY employee_salary DESC;