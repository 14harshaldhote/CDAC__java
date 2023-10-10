package relationship.Agregation;

class College {
    private String name;
    private Department[] departments; // Renamed 'dept' to 'departments'

    public College(String name, Department[] departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public Department[] getDepartments() {
        return departments;
    }
}

class Department {
    private String name;
    private int capacity; // Corrected attribute name to 'capacity'

    public Department(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class testAgr {
    public static void main(String[] args) {
        Department[] departments = {
            new Department("COMPUTER SCIENCE", 100),
            new Department("ELECTRICAL ENGINEERING", 80),
        };
        College college = new College("GHRCE", departments);

        System.out.println("College Name: " + college.getName());

        System.out.println("Departments:");
        for (Department department : college.getDepartments()) {
            System.out.println("  Department Name: " + department.getName());
            System.out.println("  Capacity: " + department.getCapacity());
            System.out.println();
        }
    }
}
