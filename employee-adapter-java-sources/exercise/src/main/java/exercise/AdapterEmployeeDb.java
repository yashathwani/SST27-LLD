package exercise;
class AdapterEmployeeDb implements Employee {
    private final EmployeeDB employeeDB;

    public AdapterEmployeeDb(EmployeeDB employeeDB) {
        this.employeeDB = employeeDB;
    }

    @Override
    public String getId() {
        return String.valueOf(employeeDB.getId());
    }

    @Override
    public String getFirstName() {
        return employeeDB.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeDB.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeDB.getEmailAddress();
    }
}
