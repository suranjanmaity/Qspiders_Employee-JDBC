package com.qsp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Employee {
    int id;
    String name;
    int salary;
    int deptno;
    String job;
    //default constructor
    Employee(){

    }
    //parameterized constructor
    Employee(int id, String name, int salary, int deptno, String job){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deptno = deptno;
        this.job = job;
    }
    
    //add or insert into database
    public void employeeInsert(int id, String name, int salary, int deptno, String job){
        Connection conn = null;
        try {
            //step 1 load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // step 2 establish the commection
            String url = "jdbc:mysql://localhost:3306/Qspiders";
            String user = "maity";
            String pass = "1Q2w3e4r@";

            conn = DriverManager.getConnection(url, user, pass);

            // step 3 create the statement
            Statement statement = conn.createStatement();

            // step 4 execute query
            String insert = "insert into employee values("+id+", '"+name+"', "+salary+","+deptno+",'"+job+"')";
            statement.execute(insert);
            System.out.println(" |\tinserted...\t\t\t\t\t\t\t\t\t|");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        finally{
            // step 5 close the connection
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Delete
    public void employeeDelete(int id) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Qspiders";
            String user = "maity";
            String pass = "1Q2w3e4r@";
            conn = DriverManager.getConnection(url, user, pass);

            Statement statement= conn.createStatement();
            String delete = "delete from employee where id = "+id+"";
            int status = statement.executeUpdate(delete);
            if (status!=0) {
                System.out.println(" |\tData deleted...\t\t\t\t\t\t\t\t\t|");
            } else {
                System.out.println(" |\tcheck id no that is not present\t\t\t\t\t\t\t|");
            }
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }

    // Update by Id
    // Update id
    public void employeeUpdated(int id , int newId) {
        Connection conn= null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Qspiders";
            String user = "maity";
            String pass = "1Q2w3e4r@";
            
            conn = DriverManager.getConnection(url, user, pass);
            
            Statement statement = conn.createStatement();

            String update = "update employee set id = "+newId+" where id = "+id+"";
            int iid = statement.executeUpdate(update);
            if (iid!=0) {
                System.out.println(" |\tData Updated...\t\t\t\t\t\t\t\t\t|");
            } else {
                System.out.println(" |\tcheck your id that is not present\t\t\t\t\t\t|");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.getStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    // Update name
    public void employeeUpdateName(int id , String name) {
        Connection conn= null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Qspiders";
            String user = "maity";
            String pass = "1Q2w3e4r@";
            
            conn = DriverManager.getConnection(url, user, pass);
            
            Statement statement = conn.createStatement();

            String update = "update employee set name ='"+name+"' where id = "+id+"";
            int nid = statement.executeUpdate(update);
            if (nid!=0) {
                System.out.println(" |\tData Updated...\t\t\t\t\t\t\t\t\t|");
            } else {
                System.out.println(" |\tcheck your id that is not present\t\t\t\t\t\t|");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.getStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    // Update salary
    public void employeeUpdateSalary(int id , int salary) {
        Connection conn= null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Qspiders";
            String user = "maity";
            String pass = "1Q2w3e4r@";
            
            conn = DriverManager.getConnection(url, user, pass);
            
            Statement statement = conn.createStatement();

            String update = "update employee set salary = "+salary+" where id = "+id+"";
            int sid = statement.executeUpdate(update);
            if (sid!=0) {
                System.out.println(" |\tData Updated...\t\t\t\t\t\t\t\t\t|");
            } else {
                System.out.println(" |\tcheck your id that is not present\t\t\t\t\t\t|");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.getStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    // Update deptno
    public void employeeUpdateDeptno(int id , int deptno) {
        Connection conn= null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Qspiders";
            String user = "maity";
            String pass = "1Q2w3e4r@";
            
            conn = DriverManager.getConnection(url, user, pass);
            
            Statement statement = conn.createStatement();

            String update = "update employee set deptno = "+deptno+" where id = "+id+"";
            int did = statement.executeUpdate(update);
            if (did!=0) {
                System.out.println(" |\tData Updated...\t\t\t\t\t\t\t\t\t|");
            } else {
                System.out.println(" |\tcheck your id that is not present\t\t\t\t\t\t|");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.getStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    // Update job
    public void employeeUpdateJob(int id , String job) {
        Connection conn= null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Qspiders";
            String user = "maity";
            String pass = "1Q2w3e4r@";
            
            conn = DriverManager.getConnection(url, user, pass);
            
            Statement statement = conn.createStatement();

            String update = "update employee set job ='"+job+"' where id = "+id+"";
            int jid = statement.executeUpdate(update);
            if (jid!=0) {
                System.out.println(" |\tData Updated...\t\t\t\t\t\t\t\t\t|");
            } else {
                System.out.println(" |\tcheck your id that is not present\t\t\t\t\t\t|");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.getStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }

    // Search
    // Search by ID
    public void employeeSearchId(int id) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Qspiders";
            String user = "maity";
            String pass = "1Q2w3e4r@";
            conn = DriverManager.getConnection(url, user, pass);

            Statement statement= conn.createStatement();
            String display = "select * from employee where id = "+id+"";
            ResultSet resultSet = statement.executeQuery(display);
            
             while (resultSet.next()) {
                System.out.println(" |--------------------------------------------------------------------------------------|");
                System.out.println(" |\tid = "+resultSet.getInt(1)+" ");
                System.out.println(" |\tname = "+resultSet.getString(2)+" ");
                System.out.println(" |\tsalary = "+resultSet.getString(3)+" ");
                System.out.println(" |\tdeptno = "+resultSet.getString(4)+" ");
                System.out.println(" |\tjob = "+resultSet.getString(5)+" ");
                System.out.println(" |--------------------------------------------------------------------------------------|");
            }
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    // Search by Name
    public void employeeSearchName(String name) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Qspiders";
            String user = "maity";
            String pass = "1Q2w3e4r@";
            conn = DriverManager.getConnection(url, user, pass);

            Statement statement= conn.createStatement();
            String display = "select * from employee where name = '"+name+"'";
            ResultSet resultSet = statement.executeQuery(display);
            
             while (resultSet.next()) {
                System.out.println(" |--------------------------------------------------------------------------------------|");
                System.out.println(" |\tid = "+resultSet.getInt(1)+" ");
                System.out.println(" |\tname = "+resultSet.getString(2)+" ");
                System.out.println(" |\tsalary = "+resultSet.getString(3)+" ");
                System.out.println(" |\tdeptno = "+resultSet.getString(4)+" ");
                System.out.println(" |\tjob = "+resultSet.getString(5)+" ");
                System.out.println(" |--------------------------------------------------------------------------------------|");
            }
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    // Search by Salary
    public void employeeSearchSalary(int salary) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Qspiders";
            String user = "maity";
            String pass = "1Q2w3e4r@";
            conn = DriverManager.getConnection(url, user, pass);

            Statement statement= conn.createStatement();
            String display = "select * from employee where salary = "+salary+"";
            ResultSet resultSet = statement.executeQuery(display);
            
             while (resultSet.next()) {
                System.out.println(" |--------------------------------------------------------------------------------------|");
                System.out.println(" |\tid = "+resultSet.getInt(1)+" ");
                System.out.println(" |\tname = "+resultSet.getString(2)+" ");
                System.out.println(" |\tsalary = "+resultSet.getString(3)+" ");
                System.out.println(" |\tdeptno = "+resultSet.getString(4)+" ");
                System.out.println(" |\tjob = "+resultSet.getString(5)+" ");
                System.out.println(" |--------------------------------------------------------------------------------------|");
            }
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    // Search by Deptno
    public void employeeSearchDeptno(int deptno) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Qspiders";
            String user = "maity";
            String pass = "1Q2w3e4r@";
            conn = DriverManager.getConnection(url, user, pass);

            Statement statement= conn.createStatement();
            String display = "select * from employee where deptno = "+deptno+"";
            ResultSet resultSet = statement.executeQuery(display);
            
             while (resultSet.next()) {
                System.out.println(" |--------------------------------------------------------------------------------------|");
                System.out.println(" |\tid = "+resultSet.getInt(1)+" ");
                System.out.println(" |\tname = "+resultSet.getString(2)+" ");
                System.out.println(" |\tsalary = "+resultSet.getString(3)+" ");
                System.out.println(" |\tdeptno = "+resultSet.getString(4)+" ");
                System.out.println(" |\tjob = "+resultSet.getString(5)+" ");
                System.out.println(" |--------------------------------------------------------------------------------------|");
            }
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    // Search by Job
    public void employeeSearchJob(String job) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Qspiders";
            String user = "maity";
            String pass = "1Q2w3e4r@";
            conn = DriverManager.getConnection(url, user, pass);

            Statement statement= conn.createStatement();
            String display = "select * from employee where job = '"+job+"'";
            ResultSet resultSet = statement.executeQuery(display);
            
            while (resultSet.next()) {
                System.out.println(" |--------------------------------------------------------------------------------------|");
                System.out.println(" |\tid = "+resultSet.getInt(1)+" ");
                System.out.println(" |\tname = "+resultSet.getString(2)+" ");
                System.out.println(" |\tsalary = "+resultSet.getString(3)+" ");
                System.out.println(" |\tdeptno = "+resultSet.getString(4)+" ");
                System.out.println(" |\tjob = "+resultSet.getString(5)+" ");
                System.out.println(" |--------------------------------------------------------------------------------------|");
            }
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }

    // show all
    public void employeeShowAll() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Qspiders";
            String user = "maity";
            String pass = "1Q2w3e4r@";
            conn = DriverManager.getConnection(url, user, pass);

            Statement statement= conn.createStatement();
            String display = "select * from employee";
            ResultSet resultSet = statement.executeQuery(display);
            
             while (resultSet.next()) {
                System.out.println(" |--------------------------------------------------------------------------------------|");
                System.out.println(" |\tid = "+resultSet.getInt(1)+" ");
                System.out.println(" |\tname = "+resultSet.getString(2)+" ");
                System.out.println(" |\tsalary = "+resultSet.getString(3)+" ");
                System.out.println(" |\tdeptno = "+resultSet.getString(4)+" ");
                System.out.println(" |\tjob = "+resultSet.getString(5)+" ");
                System.out.println(" |--------------------------------------------------------------------------------------|");
            }
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        finally{
            try {
                conn.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
    //employee details current
    public void employeeDetails(){
        System.out.println(" |\tid\t"+id+        "\t\t\t\t\t\t\t\t\t|");
        System.out.println(" |\tname\t"+name+    "\t\t\t\t\t\t\t\t|");
        System.out.println(" |\tsalary\t"+salary+"\t\t\t\t\t\t\t\t\t|");
        System.out.println(" |\tdeptno\t"+deptno+"\t\t\t\t\t\t\t\t\t|");
        System.out.println(" |\tjob\t"+job+      "\t\t\t\t\t\t\t\t|");

    }
}
