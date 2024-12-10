package 연습.bookconstruct;

public class Book {
    String name;
    String author;
    int page;

    // 클래스와 생성자의 이름은 같아야한다.
    // 클래스 이름은 대문자로 시작

    Book(){
        this("","",0);
    }

    Book(String name,String author , int page){
        this.name = name;
        this.author= author;
        this. page = page;
    }

    Book(String name,String author){
        this(name,author,0);
    }

    void displayInfo(){
        System.out.println("제목 : " + name + ",저자 : "+ author + ",페이지 :" +page);
    }
}
