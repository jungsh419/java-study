package javastart.if_else;

public class MovieRateEx {
    public static void main(String[] args) {
        int rate = 6;
        if(rate <= 9){
            System.out.println("어바웃 타임을 추천");
        } else if (rate <= 8  ) {
            System.out.println("어바웃 타임을 추천");
            System.out.println("토이스토리를 추천");
        } else if (rate <= 7 ) {
            System.out.println("어바웃 타임을 추천");
            System.out.println("토이스토리를 추천");
            System.out.println("고질라를 추천");
        }



    }
}
