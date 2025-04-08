package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        //char c2 = "A"; // this is not a char, it is a string
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' ';//blank space

        //Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("ShilpaSS");
        System.out.println("Shilpa"+new_line+"SS");
        System.out.println("Shilpa"+tab_line+"SS");
        System.out.println("Shilpa"+back_space+"SS");
        System.out.println("Shilpa is old"+carriage_return+"SS");

        System.out.println("Hi, This is a First line"+new_line+"This is Second line");

        char c10 = 'A';
        //ASCII, (Limited numbers) - A -> 65

        char rupees = '₹';
        System.out.println(rupees);
        char my_laugh_smiley = '\u1f60'; // :)
        System.out.println(my_laugh_smiley);

        char c11 = '\u1f60';

    }
}
