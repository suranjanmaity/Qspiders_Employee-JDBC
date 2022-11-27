package com.qsp;

import java.util.Scanner;

public class EmployeeDriver{
    public static void main(String[] args) {

        //////////////////////////test
            int idt=1001;
            String namet="suranjan_maity";
            int salaryt=50000;
            int deptnot=1;
            String jobt="SDE1";
        String insert = "insert into employee values("+idt+", '"+namet+"', "+salaryt+","+deptnot+",'"+jobt+"')";
        System.out.println(insert);
        
        //////////////////////////test

        try (Scanner scn = new Scanner(System.in)) {
            int id;
            String name;
            int salary;
            int deptno;
            String job;
            boolean exit=false;
            int choice;
            Employee employee =new Employee();

            System.out.println("  ______________________________________________________________________________________");
            while (exit!=true) {
                System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                System.out.println(" |\t\t\t\tQSPIDERS EMPLOYEE DATABASE\t\t\t\t|");
                System.out.println(" |______________________________________________________________________________________|");
                System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                System.out.println(" |\tMAIN MENU :-\t\t\t\t\t\t\t\t\t|");
                System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                System.out.println(" |\t1.INSERT.\t\t\t\t\t\t\t\t\t|");
                System.out.println(" |\t2.DELETE.\t\t\t\t\t\t\t\t\t|");
                System.out.println(" |\t3.UPDATE.\t\t\t\t\t\t\t\t\t|");
                System.out.println(" |\t4.SEARCH.\t\t\t\t\t\t\t\t\t|");
                System.out.println(" |\t5.SHOW ALL.\t\t\t\t\t\t\t\t\t|");
                System.out.println(" |\t6.EXIT.\t\t\t\t\t\t\t\t\t\t|");
                System.out.println(" |______________________________________________________________________________________|");
                
                System.out.print(" |\tEnter your choice : ");
                choice = scn.nextInt();
                switch (choice) {
                    //Insert
                    case 1:{
                        System.out.println(" |______________________________________________________________________________________|");
                        System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                        System.out.print(" |\tEnter id : ");
                        id = scn.nextInt();
                        System.out.print(" |\tEnter name : ");
                        name = scn.next();
                        System.out.print(" |\tEnter salary : ");
                        salary = scn.nextInt();
                        System.out.print(" |\tEnter deptno : ");
                        deptno = scn.nextInt();
                        System.out.print(" |\tEnter job : ");
                        job = scn.next();

                        System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                        System.out.println(" |\tInserting data...\t\t\t\t\t\t\t\t|");
                        employee.employeeInsert(id, name, salary, deptno, job);
                        // employee.employeeDetails();
                        System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                        System.out.println(" |______________________________________________________________________________________|");

                        break;
                    }
                    //Delete
                    case 2:{
                        System.out.println(" |______________________________________________________________________________________|");
                        System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                        System.out.print(" |\tEnter id : ");
                        id = scn.nextInt();
                        System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                        System.out.println(" |\tDeleting data...\t\t\t\t\t\t\t\t|");
                        employee.employeeDelete(id);
                        System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                        System.out.println(" |______________________________________________________________________________________|");

                        break;
                    }
                    //Update
                    case 3:{
                        System.out.println(" |______________________________________________________________________________________|");
                    System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\tUpdate Menu :-\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t1.Id.\t\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t2.Name.\t\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t3.Salary.\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t4.Deptno.\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t5.Job.\t\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t6.EXIT.\t\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |______________________________________________________________________________________|");
                    
                    System.out.print(" |\tEnter your choice : ");
                    choice = scn.nextInt();
                        switch (choice) {
                            //update id
                            case 1:{
                                System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                                System.out.print(" |\tEnter old id : ");
                                id = scn.nextInt();
                                System.out.print(" |\tEnter new id : ");
                                int new_id = scn.nextInt();
                                employee.employeeUpdated(id, new_id);
                                System.out.println(" |______________________________________________________________________________________|");
                                break;
                            }
                            //update name
                            case 2:{
                                System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                                System.out.print(" |\tEnter id : ");
                                id = scn.nextInt();
                                System.out.print(" |\tEnter new name : ");
                                name = scn.next();
                                employee.employeeUpdateName(id, name);
                                System.out.println(" |______________________________________________________________________________________|");
                                break;
                            }
                            //update salary
                            case 3:{
                                System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                                System.out.print(" |\tEnter id : ");
                                id = scn.nextInt();
                                System.out.print(" |\tEnter new salary : ");
                                salary = scn.nextInt();
                                employee.employeeUpdateSalary(id, salary);
                                System.out.println(" |______________________________________________________________________________________|");
                                break;
                            }
                            //update deptno
                            case 4:{
                                System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                                System.out.print(" |\tEnter id : ");
                                id = scn.nextInt();
                                System.out.print(" |\tEnter new deptno : ");
                                deptno = scn.nextInt();
                                employee.employeeUpdateDeptno(id, deptno);
                                System.out.println(" |______________________________________________________________________________________|");
                                break;
                            }
                            //update job
                            case 5:{
                                System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                                System.out.print(" |\tEnter id : ");
                                id = scn.nextInt();
                                System.out.print(" |\tEnter new job : ");
                                job = scn.next();
                                employee.employeeUpdateJob(id, job);
                                System.out.println(" |______________________________________________________________________________________|");
                                break;
                            }
                            //update exit
                            case 6:{
                                System.out.println(" |______________________________________________________________________________________|");
                                break;
                            }
                            }
                        break;
                    }
                    //Search
                    case 4:{
                        System.out.println(" |______________________________________________________________________________________|");
                    System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\tSearch Menu :-\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t1.Id.\t\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t2.Name.\t\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t3.Salary.\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t4.Deptno.\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t5.Job.\t\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |\t6.EXIT.\t\t\t\t\t\t\t\t\t\t|");
                    System.out.println(" |______________________________________________________________________________________|");
                    
                    System.out.print(" |\tEnter your choice : ");
                    choice = scn.nextInt();
                    switch (choice) {
                        //Search id
                        case 1:{
                            System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                            System.out.print(" |\tEnter id : ");
                            id = scn.nextInt();
                            employee.employeeSearchId(id);
                            System.out.println(" |______________________________________________________________________________________|");
                            break;
                        }
                        //Search name
                        case 2:{
                            System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                            System.out.print(" |\tEnter name : ");
                            name = scn.next();
                            employee.employeeSearchName(name);
                            System.out.println(" |______________________________________________________________________________________|");
                            break;
                        }
                        //Search salary
                        case 3:{
                            System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                            System.out.print(" |\tEnter salary : ");
                            salary = scn.nextInt();
                            employee.employeeSearchSalary(salary);
                            System.out.println(" |______________________________________________________________________________________|");
                            break;
                        }
                        //Search deptno
                        case 4:{
                            System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                            System.out.print(" |\tEnter deptno : ");
                            deptno = scn.nextInt();
                            employee.employeeSearchDeptno(deptno);
                            System.out.println(" |______________________________________________________________________________________|");
                            break;
                        }
                        //Search job
                        case 5:{
                            System.out.println(" |\t\t\t\t\t\t\t\t\t\t\t|");
                            System.out.print(" |\tEnter job : ");
                            job = scn.next();
                            employee.employeeSearchJob(job);
                            System.out.println(" |______________________________________________________________________________________|");
                            break;
                        }
                        //Search exit
                        case 6:{
                            System.out.println(" |______________________________________________________________________________________|");
                            break;
                        }
                        }
                        break;
                    }
                    //Show all
                    case 5:{
                        employee.employeeShowAll();
                        System.out.println(" |______________________________________________________________________________________|");
                        break;
                    }
                    //Exit
                    case 6:{
                        exit=true;
                        System.out.println(" |\tClosing the application...Bye...\t\t\t\t\t\t|");
                        System.out.println(" |______________________________________________________________________________________|");
                        System.out.println();
                        break;
                    }
                    default:
                        System.out.println(" |\tInvalid choice ! Try again...\t\t\t\t\t\t\t|");
                        System.out.println(" |______________________________________________________________________________________|");
                        break;
                }
            }
        }

    }
}
