package POO.Modificadoracceso;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day , int month , int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String RellenarCeros(int value){
        if (value < 10){
            return "0"+value;
        }
        return String.valueOf((value));

    }

    public String imprimirfecha (){
      String errores= "";

      if (day > 31 || day <= 0){
          errores += "Dia invalido";
      }

      if (month > 12 || month <=0){
          errores += "Mes invalido";

      }

      if (this.year <=0){
          errores += "Año invalido";
      }
      if (!errores.isEmpty()){
          return errores.trim();
      }
        String day = RellenarCeros(this.day);
        String month = RellenarCeros(this.month);
        return day + "/" + month + "/" + this.year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
