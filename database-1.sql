SELECT * FROM "employees";

SELECT * FROM "employees" where department_id = 50 AND salary > 4000;

SELECT * FROM "employees" where first_name LIKE '%a';

SELECT * FROM "employees" where (department_id = 50 OR department_id = 80) AND commission_pct IS NOT NULL;

SELECT * FROM "employees" where salary >= 8000 AND salary <= 9000;

SELECT phone_number, REPLACE (phone_number, '.', '-') new_phone_number FROM "employees";

SELECT department_id, salary, COUNT (*) FROM employees GROUP BY department_id, salary HAVING COUNT (*) > 1;

SELECT * FROM employees WHERE LENGTH (first_name) = (SELECT MAX (LENGTH (first_name)) FROM employees);


