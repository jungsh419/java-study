package javaMid2.genegic.test.ex2;

import javaMid2.genegic.animal.Cat;
import javaMid2.genegic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        // 제네릭 실패 -> 우리가 원하는건 Animal인데 인티저, 오브젝트 등 다른 모든게 들어감
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}
