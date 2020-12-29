package LAB2;

public class BasicDataTyp {
        public static void main(String[] args) {
            //boolean => T,F (1,0)
            boolean myboo = true;
            System.out.print(myboo);
            myboo = false;
            System.out.print(myboo);

            //character => only 1 character such as 'a','x','s'
            char c = 'a';
            System.out.print(c);

            //integer => -2 -1 0 1 2 3 ... 10000
            int number;
            number = 100;
            System.out.print(number);//100
            System.out.print(number*5);//500

            //real number => float, double => 10.11, -22.1
            float a = 10.10f;
            double b = 20.20;
            System.out.print(a+b); //30.30

            //String => message => "...." => "Hello"
            //String คือ ข้อมูลชนิดแบบข้อความ ที่มีตัวอักษรต่อเรียงกัน
            String msg = "Hello RUTS Saiyai 2020";
            System.out.print(msg);
            System.out.print(msg.toUpperCase());
            System.out.print(msg.length());

            //constant variable
            final  int num = 100;


        }//main
    }//class




