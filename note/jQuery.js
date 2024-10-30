$('요소').first() //$('요소:first')  첫번째 요소만 선택
$('요소').last() // $('요소:last')   마지막 요소만 선택

$('요소:even') // 짝수 인덱스만 선택(홀수번째)
$('요소:odd') // 홀수 인덱스만 선택(짝수번째)


offset().top / offset().bottom / offset().right / offset().left
/*
jQuery의 offset() 메서드는 선택한 요소의 문서 내 위치를 알려준다.
두 가지 방식으로 사용 (요소의 현재 위치 읽어올 때 / 특정 위치에 요소 배치할 떄)
*/

var dbox = $('.box4').css("top", "2300px");
/*
제이쿼리의 .css()메서드는 px단위가 필요하다.
css("top",2300);처럼 숫자만 쓰면 단위를 인식할 수 없다
대안으로, css 메서드에서 px을 사용하지 않으려면 숫자값에 + 'px'를 추가하여 사용할 수 있습니다: css("top", 2300 + 'px');.
속성명 top을 문자열로 전달할 때 따옴표를 써야합니다. 이는 JavaScript에서 속성명을 문자열로 인식하기 위해 필수입니다.
*/


$(window) 
/* 브라우저의 윈도우 객체 선택 
페이지의 전체적인 뷰포트(화면) 크기와 스크롤 위치 제어하거나,
윈도우 크기 변경 이벤트 등을 처리할 때 사용*/ 
$(document.body) 
/* HTML문서의 <body>요소 선택, 페이지 콘텐츠에 접근하고 요소조작,스타일적용

++++ HTML문서는 계층적인 구조, 이 구조에서 <html>요소가 최상위 노드이고,
그 아래 <head>와 <body>가 위치
document 객체는 이 HTML 문서 전체를 나타내며, <body>는 그 안의 하위 요소 중 하나
document는 HTML 문서 전체를 나타내고, <body>는 그 일부입니다. 그래서 document.body로 <body> 요소에 접근할 수 있는 것 

++++ 자바스크립트와 제이쿼리에서는 각각 document.body $(document.body)를 통해 <body>에 접근 */


$(window).scroll(function(){   // 윈도우에서 스크롤이벤트가 발생할떄마다 동작하는 함수
    var sct = $(this).scrollTop();  //현재 스크롤 위치를 가져옴 
})

/*
scrollTop(): 세로 스크롤 위치를 가져옵니다.
scrollLeft(): 수평 스크롤 위치를 가져옵니다.

*/ 
$(window).scroll(function() {
    var verticalScroll = $(this).scrollTop(); // 세로 스크롤 위치
    var horizontalScroll = $(this).scrollLeft(); // 수평 스크롤 위치

    console.log('세로 스크롤 위치: ' + verticalScroll);
    console.log('수평 스크롤 위치: ' + horizontalScroll);
    //주로 스크롤은 위에서 아래로, 왼쪽에서 오른쪽으로 움직이기 떄문에 Top과 Left를 기준으로 한다. 
});

//--------------------------------------------

