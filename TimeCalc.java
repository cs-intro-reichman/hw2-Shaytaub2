public class TimeCalc {
    public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); // 24 format hh:mm - need to change the input
        int minutesToAdd = Integer.parseInt(args [1]);
        int totalMinuts = (hours*60) + minutes + minutesToAdd;
        int newHoures = (totalMinuts/60)%24;
        int newMinuts = totalMinuts-(totalMinuts/60)*60;
        String hString;
        String mString;
        if (newHoures<10) {hString = "0" + String.valueOf(newHoures);} else {hString = String.valueOf(newHoures);}
        if (newMinuts<10) {mString = "0" + String.valueOf(newMinuts);} else {mString = String.valueOf(newMinuts);}
        String time = hString + ":" + mString;
        System.out.println(time);
    }
}
