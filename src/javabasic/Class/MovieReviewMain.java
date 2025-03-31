package javabasic.Class;

public class MovieReviewMain {

    public static void main(String[] args) {

        MovieRevie[] mrs = new MovieRevie[2];

        MovieRevie mr1 = new MovieRevie();
        mr1.title = "대충 영화제목";
        mr1.review = "대충 영화 리뷰";

        MovieRevie mr2 = new MovieRevie();
        mr2.title = "대충 영화제목2";
        mr2.review = "대충 영화 리뷰2";

        mrs[0] = mr1;
        mrs[1] = mr2;

        System.out.println("영화 제목 : " + mr1.title + " 리뷰 : "+ mr1.review);
        System.out.println("영화 제목 : " + mr2.title + " 리뷰 : "+ mr2.review);

        System.out.println("*************for문**************");
        for(int i= 0; i< mrs.length;i++)
        {
            System.out.println("영화 제목 : " + mrs[i].title + " 리뷰 : "+ mrs[i].review);
        }
    }
}
