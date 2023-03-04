package personal.utils;

public class Validate {

    public void checkNumber(String telephone) throws Exception {
        if(!telephone.substring(0,1).equals("+")) {
            throw new PhoneException("Неверный формат набора номера, начинаете с +");
        }
        else if(telephone.length() != 12) {
            throw new PhoneException("Неверное количество цифр в номере телефона, попробуйте еще раз");
        }
    }
}