package 연습.객체지향음악플레이어;

import 연습.음악플레이어.MusicPlayerData;

public class MusicPlayerMain {
    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        // 음악 플레이어 켜기
        player.on();
        // 볼륨증가
        player.volumeUp();
        // 볼륨증가
        player.volumeUp();
        // 볼륨감소
        player.volumeDown();
        // 음악 플레이어 상태
        player.showStatus();
        // 음악 플레이어 끄기
        player.off();



        // 속성과 기능은 MusicPlayer에 모두 정의되었다.
        // 음악 플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것.
        // 이렇게 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라 한다.

        // MusicPlayerMain은 Musicplay 객체를 생성하고 필요한 기능(메서드)를 호출하기만 한다.
        // 필요한 모든 것은 MusicPlayer 안에 들어있다.

        //MusicPlayer를 사용하는 입장에서는 MusicPlayer의 데이터인 volume,isOn 같은 데이터는 전혀 사용하지 않는다.
        // MusicPlayer를 사용하는 입장에서는 MusicPlayer 내부에 어떤 속성(데이터)가 있는지 전혀 몰라도 된다.'
        // MusicPlayer를 사용하는 입장ㅇ에서는 단순하게 MusicPlayer가 제공하는 기능 중에 필요한 기능을 호출해서 사용하기만 하면된다.



    }
}
