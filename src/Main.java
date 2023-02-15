public class Main {
    public static void main(String[] args) {
        //TODO tapshyrma :
     /*   Person деген abstract класс түзүңүз (name, gender) жана
        work() деген abstract методу болсун.
        Employee деген класс түзүп (id), ал Person деген класстан мурасталсын
        Main класстан эки объектисин түзүп, 1чи объектиге id'сине 0,
        2чисине 1 деген айди берип work деген методун иштеткенде.
        0 айди менен - "Жумушчу иштебейт"
        1 айди менен - "Жумушчу иштейт" деп консольго чыксын*/
        Person person1 = new Empolyee("Adilet",'M',0);
        Person person2 = new Empolyee("Aizat",'W',1);
        Person[]people={person1,person2};
        for (Person s:people) {
            System.out.println(s);
            s.work();
        }



    }
}