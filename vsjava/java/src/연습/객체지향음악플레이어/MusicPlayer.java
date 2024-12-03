package 연습.객체지향음악플레이어;
    // 해당 클래스 안에 음악 플레이어에 필요한 속성과 기능을 구현했다.
    // 이것을 사용하는 것은 MusicPlayerMain으로 구현함.
    public class MusicPlayer {
        int volume = 0;
        boolean isOn=false;


    void on(){
     // data.isOn=true; 위에있는 자기자신의 데이터를 사용할 것이므로 가져오지 않는다.
        isOn=true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off(){
        isOn=false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }
    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }
    }