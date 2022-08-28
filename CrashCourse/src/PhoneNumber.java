public class PhoneNumber {

    String phoneNumber = "";

    PhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    String getNumber() {
        String res = phoneNumber.replaceAll("[-+ ,()@!:.]", "");
        String test;

        if (res.charAt(0) == '1') {
            res = res.substring(1);
        }

        if (res.charAt(0) == '0'){
            throw  new IllegalArgumentException("area code cannot start with zero");
        } else if (res.charAt(0) == '1') {
            throw  new IllegalArgumentException("area code cannot start with one");

        }

        //for (int i=0; i )

         if (res.length() != 10){
            throw  new IllegalArgumentException("Too long");

        }

        System.out.println(res);
        return res;

    }

    public static void main(String[] args) {

        PhoneNumber phoneNumber = new PhoneNumber("+1 (013)-995-0253");
        //phoneNumber.setPhoneNumber();
        System.out.println(phoneNumber.getNumber());

    }

}
