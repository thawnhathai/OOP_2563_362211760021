package LAB8;

public class CompanyApp {
    private static   void main(String[] args){
        Employee emp1 = new Employee();

        emp1.setPid("18200400287901");
        emp1.setName("Thawanhathai poomprasit");
        emp1.setAge(22);
        emp1.setGender("bell");
        emp1.setTel("084246xxxx");

        emp1.setEmID("emp001");
        emp1.setPosition("Prgrammer");
        emp1.setSalary(10000.00);

        //display object data
        System.out.println(emp1.toString());

    }//main
}
