SELECT s1.name AS Employee
FROM Employee s1
JOIN Employee s2
ON s1.managerId=s2.id
WHERE s1.salary>s2.salary;
