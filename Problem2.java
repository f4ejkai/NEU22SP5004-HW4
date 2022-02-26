/**
 * Problem 2 [40pts]
 * Create a class Employee that includes the following instance variables
 * • First name (String) cannot be empty,
 * • Last name (String) cannot be empty,
 * • Monthly salary (double) must be non-negative.
 * Provide a set and a get method for each instance variable. The setters must return boolean
 * and perform validation. If the monthly salary is not positive, set its value to zero. If a name is
 * empty set it to “[empty]”. 
 * Provide a constructor that initializes the three instance variables.
 * No default constructor is required. Also, overwrite equals() and toString(). Write a
 * test class named EmployeeTest that demonstrates class Employee’s capabilities. Create two
 * different Employee objects. Use println() to display information about each employee (this
 * will invoke toString()). Then compare the two using equals() and display the result.
 * Submission format: You MUST define TWO classes. One is Employee which must be declared
 * as a non-public class. Two is EmployeeTest which is public and contains the main()
 * method. So, you must submit one file EmployeeTest.java containing the above two classes.
 * The tests must be performed in the main() method.
 */
public class Problem2 {
    private static class Employee{
        private String Fir_name;
        private String Las_name;
        private double Monthly_pay;

        public Employee()
        {
         Fir_name = "";
         Las_name = "";
         Monthly_pay = 0.0;
        }
            public boolean setFir_name(String Fir_name)
            {
            if (Fir_name.equals(""))
                {
                this.Fir_name = "";
                return false;
                }
                this.Fir_name = Fir_name;
                return true;
            }

            public boolean setLas_name(String Las_name)
            {
                if (Las_name.equals(""))
                {
                    this.Las_name = "";
                    return false;
                }
                
                this.Las_name = Las_name;
                return true;
            }

            public boolean setMonthly_pay(double Monthly_pay)
            {
                if (Monthly_pay <= 0)
                {
                    this.Monthly_pay = 0;
                    return false;
                }
                this.Monthly_pay = Monthly_pay;
                return true;
            }
            
            public String getFir_name()
            {
                return Fir_name;
            }

            public String getLas_name()
            { 
                return Las_name;
            }

            public double getMonthly_pay()
            {
                return Monthly_pay;
            }
            public String toString()
            {
                return Fir_name + " " + Las_name + ": " + Monthly_pay;
            }
            public boolean equals(Employee obj)
            {
                return Fir_name.equals(obj.Fir_name) && Las_name.equals(obj.Las_name)&&Monthly_pay == obj.Monthly_pay;
        
            }

        public static void main(String[] args)
        {
            Employee Number1 = new Employee();
            Employee Number2 = new Employee();

            Number1.setFir_name("Kevin");
            Number1.setLas_name("Wang");
            Number1.setMonthly_pay(9000.0);

            Number2.setFir_name("Hward");
            Number2.setLas_name("Mason");
            Number2.setMonthly_pay(10000.0);

            System.out.println(Number1.toString());
            System.out.println(Number2.toString());
            System.out.println(Number1.equals(Number2));
        }
    }       
}
