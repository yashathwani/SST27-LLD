package exercise;
public class AdapterEmployeeCsv implements Employee {
    private EmployeeCSV employeeCSV;
    private String[] tokens;

    public AdapterEmployeeCsv(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return employeeCSV.tokens()[0];
    }

    @Override
    public String getFirstName() {
        return employeeCSV.tokens()[1];
    }

    @Override
    public String getLastName() {
        return employeeCSV.tokens()[2];
    }

    @Override
    public String getEmail() {
        return employeeCSV.tokens()[3];
    }
    
}
