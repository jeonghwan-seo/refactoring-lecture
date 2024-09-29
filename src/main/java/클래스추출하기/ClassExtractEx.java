package 클래스추출하기;

public class ClassExtractEx {
}

class Person {
    private String name;
    private String street;
    private String city;
    private String detailAddress;

    public String getName() {
        return name;
    }
    public String getAddress() {
        return city + " " + street + "," + detailAddress;
    }
}


