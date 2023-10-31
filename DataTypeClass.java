package javahomeworkpakage;

public class DataTypeClass {


        public static void main(String[] args) {
            byte a = -128;
            System.out.println("a=" +a);
            short b= -5768;
            System.out.println("b=" +b);
            int c = 2107583748;
            System.out.println("c=" + c);
            long d =  -9223372036854775808L;
            System.out.println("d=" +d);
            float e = 56566545858125111145454565.111111111111111f;
            System.out.println("e=" +e);
            double f = -9278561631313131313.1111111111111111111111;
            System.out.println("f=" +f);
            char g = 'a';
            System.out.println("g=" +g);
            boolean h = false;
            System.out.println("h=" +h);
            boolean i = true;
            System.out.println("i=" +i);
            String j= "I am a software tester";
            System.out.println(j+"i=");
            String k ="Software";
            String l ="Tester";
            System.out.println(l+k);
            int n;
//Assignment
            System.out.println(n=a+b);
            System.out.println(n-=a);
            System.out.println(n*=a);
            System.out.println(n%=a);
            System.out.println(n+=a);
            System.out.println(n/=a);
            System.out.println(n^=a);
//Relational
            System.out.println(a==b);
            System.out.println(a!=b);
            System.out.println(a<b);
            System.out.println(a>b);
            System.out.println(a>=b);
            System.out.println(a<=b);
//Arithmetic
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(c*b);
            System.out.println(e/f);
            System.out.println(a%b);
//Unary
            System.out.println(a++);
            System.out.println(++a);
            System.out.println(--a);
            System.out.println(a--);
            System.out.println(!i);
            System.out.println(!h);
//Logical
            System.out.println(a<140 && a>145);
            System.out.println(a<195 || a>189);
            System.out.println(!(a<179 && a>175));
        }
    }

