package POO.Modificadoracceso;

public class AppMyDate {

    static void main(String[] args) {


        MyDate myDate = new MyDate(32,11,0);

        myDate.getDay();
        System.out.println(myDate.getDay()+"/"+ myDate.getMonth()+"/"+myDate.getYear());

        System.out.println(myDate.imprimirfecha());



    }


}
