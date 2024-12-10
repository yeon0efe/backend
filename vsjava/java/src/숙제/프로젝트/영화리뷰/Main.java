package 숙제.프로젝트.영화리뷰;

import java.util.*;

class Movie {
    private String title;      // 영화 제목
    private String director;   // 감독 이름
    private int releaseYear;   // 개봉년도
    private String watchDate;  // 감상일
    private double rating;     // 평점
    private String review;     // 한줄 리뷰

    public Movie(String title, String director, int releaseYear, String watchDate, double rating, String review) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.watchDate = watchDate;
        this.rating = rating;
        this.review = review;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "제목: " + title + ", 감독: " + director + ", 개봉년도: " + releaseYear + ", 감상일: " + watchDate + ", 평점: " + rating + ", 한줄 리뷰: " + review;
    }
}

class MovieReviewSystem {
    private List<Movie> movieList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 영화 추가
    public void addMovie(String title, String director, int releaseYear, String watchDate, double rating, String review) {
        movieList.add(new Movie(title, director, releaseYear, watchDate, rating, review));
    }

    // 영화 제목으로 정보 조회 (중복된 제목도 모두 조회)
    public void searchByTitle(String title) {
        List<Movie> foundMovies = new ArrayList<>();
        for (Movie movie : movieList) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                foundMovies.add(movie);
            }
        }

        if (foundMovies.isEmpty()) {
            System.out.println("영화 제목이 없습니다.");
        } else {
            System.out.println("검색된 영화 목록:");
            for (Movie movie : foundMovies) {
                System.out.println(movie);
            }
        }
    }

    // 평점별로 영화 조회
    public void searchByRating(double rating) {
        boolean found = false;
        for (Movie movie : movieList) {
            if (movie.getRating() == rating) {
                System.out.println(movie);
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 평점의 영화가 없습니다.");
        }
    }

    // 감상년도별로 영화 조회
    public void searchByReleaseYear(int year) {
        boolean found = false;
        for (Movie movie : movieList) {
            if (movie.getReleaseYear() == year) {
                System.out.println(movie);
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 년도의 영화가 없습니다.");
        }
    }

    // 영화 삭제
    public void deleteMovie(String title) {
        Iterator<Movie> iterator = movieList.iterator();
        while (iterator.hasNext()) {
            Movie movie = iterator.next();
            if (movie.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                System.out.println("영화 '" + title + "'이 삭제되었습니다.");
                return;
            }
        }
        System.out.println("영화 '" + title + "'을 찾을 수 없습니다.");
    }

    // 영화 정보 수정
    public void updateMovie(String title) {
        for (Movie movie : movieList) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                System.out.println("수정할 영화 정보:");
                System.out.println(movie);

                System.out.print("새로운 평점을 입력하세요: ");
                double newRating = scanner.nextDouble();
                scanner.nextLine();  // consume the newline character
                movie.setRating(newRating);

                System.out.print("새로운 한줄 리뷰를 입력하세요: ");
                String newReview = scanner.nextLine();
                movie.setReview(newReview);

                System.out.println("영화 정보가 수정되었습니다.");
                return;
            }
        }
        System.out.println("영화 '" + title + "'을 찾을 수 없습니다.");
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\n==== 영화 리뷰 프로그램 ====");
            System.out.println("1. 영화 추가");
            System.out.println("2. 영화 제목으로 검색");
            System.out.println("3. 평점별 영화 검색");
            System.out.println("4. 감상년도별 영화 검색");
            System.out.println("5. 영화 삭제");
            System.out.println("6. 영화 정보 수정");
            System.out.println("7. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline character

            switch (choice) {
                case 1:
                    addMovieMenu();
                    break;
                case 2:
                    searchByTitleMenu();
                    break;
                case 3:
                    searchByRatingMenu();
                    break;
                case 4:
                    searchByReleaseYearMenu();
                    break;
                case 5:
                    deleteMovieMenu();
                    break;
                case 6:
                    updateMovieMenu();
                    break;
                case 7:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 메뉴별 기능 구현
    private void addMovieMenu() {
        System.out.print("영화 제목을 입력하세요: ");
        String title = scanner.nextLine();
        System.out.print("감독 이름을 입력하세요: ");
        String director = scanner.nextLine();
        System.out.print("개봉 년도를 입력하세요: ");
        int releaseYear = scanner.nextInt();
        scanner.nextLine();  // consume the newline character
        System.out.print("감상일을 입력하세요 (yyyy-mm-dd): ");
        String watchDate = scanner.nextLine();
        System.out.print("평점을 입력하세요 (0.0 ~ 10.0): ");
        double rating = scanner.nextDouble();
        scanner.nextLine();  // consume the newline character
        System.out.print("한줄 리뷰를 입력하세요: ");
        String review = scanner.nextLine();

        addMovie(title, director, releaseYear, watchDate, rating, review);
        System.out.println("영화가 추가되었습니다.");
    }

    private void searchByTitleMenu() {
        System.out.print("검색할 영화 제목을 입력하세요: ");
        String title = scanner.nextLine();
        searchByTitle(title);
    }

    private void searchByRatingMenu() {
        System.out.print("검색할 평점을 입력하세요 (0.0 ~ 10.0): ");
        double rating = scanner.nextDouble();
        searchByRating(rating);
    }

    private void searchByReleaseYearMenu() {
        System.out.print("검색할 감상 년도를 입력하세요: ");
        int year = scanner.nextInt();
        searchByReleaseYear(year);
    }

    private void deleteMovieMenu() {
        System.out.print("삭제할 영화 제목을 입력하세요: ");
        String title = scanner.nextLine();
        deleteMovie(title);
    }

    private void updateMovieMenu() {
        System.out.print("수정할 영화 제목을 입력하세요: ");
        String title = scanner.nextLine();
        updateMovie(title);
    }
}

public class Main {
    public static void main(String[] args) {
        MovieReviewSystem system = new MovieReviewSystem();
        system.displayMenu();
    }
}

