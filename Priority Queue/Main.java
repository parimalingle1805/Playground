import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
    private int name;
    private double salary;

    public Employee(int name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return ""+name;
    }
    @Override
    public int compareTo(Employee employee) {
        if(this.getSalary() > employee.getSalary()) {
            return 1;
        } else if (this.getSalary() < employee.getSalary()) {
            return -1;
        } else {
            return 0;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<>();
        Scanner scan = new Scanner(System.in);
        int n=0;
		int p=0;
        do{
        	System.out.println("Enter the value to insert:");
        	n=scan.nextInt();
        	if(n>=0){
        		System.out.println("Enter the priority of that value:");
        		p=scan.nextInt();
        		if(n>=0 && p>=0){
        			employeePriorityQueue.add(new Employee(n, p));
        		}
        	}
        }while(n>-0);
       
        

        while (!employeePriorityQueue.isEmpty()) {
            System.out.print(employeePriorityQueue.remove()+" ");
        }
    }
}