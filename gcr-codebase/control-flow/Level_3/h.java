class Department {

    int deptId;
    String deptName;
    String location;
    DepartmentType type;

    Department(int deptId, String deptName, String location, DepartmentType type) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.location = location;
        this.type = type;
    }

    void displayDepartment() {
        System.out.println("Department ID   : " + deptId);
        System.out.println("Department Name : " + deptName);
        System.out.println("Location        : " + location);
        System.out.println("Type            : " + type);
    }

}

class Employee {

    int empId;
    String empName;
    double salary;
    Department department;   

    Employee(int empId, String empName, double salary, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    void displayEmployee() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);

    
        System.out.println("Department ID : " + department.deptId);
        System.out.println("Department    : " + department.deptName);
        System.out.println("Location      : " + department.location);
        System.out.println("Type          : " + department.type);
    }
}
