$(function(){
    var clone = $('.slide .sg a:first').clone();
    $(".sg").append(clone);

 
    var i = 0;
    var repeat;

    $('.slide .dot a').click(function(){
        i = $(this).index();
        $(".slide .sg").stop().animate({"margin-left":-i*100+"%"},600);
        $(".slide .dot a").removeClass("on");
        $(this).addClass("on");
    });


function timer(){
        if(i==4){
            i=0;
            $(".slide .sg").css("margin-left",0);
        }
        i++;
        $(".slide .sg").stop().animate({
            "margin-left":-i*100+"%"
        },600);
         
        if(i==4){
            $(".slide .dot a").removeClass("on");
            $(".slide .dot a").eq(0).addClass("on");
        }else{
            $(".slide .dot a").removeClass("on");
            $(".slide .dot a").eq(i).addClass("on");
        }
  
}


var id = setInterval(timer, 3000); 

$('.slide').mouseenter(function() {
    clearInterval(id);
});
$('.slide').mouseleave(function() {
    id = setInterval(timer,3000);
});

// 슬라이드 끝

// 탭메뉴 시작


$(".menu_top ul li").click(function(){
    
    $('.menu_wrap .menu').stop().animate({"margin-left":0+"px"},0)
    //새로운 menu 열릴때마다 첫페이지로 + animate 0로 설정함(즉시변경)
    
    var tap_num = $(this).index();
    // alert(tap_num);

    $('.mt_right li').removeClass("on");
    $(this).addClass('on');
    
    //기본값 : css에서 1번째 menu빼고 모두 숨겨둠
    
    $(".menu_wrap .menu").hide();
    $(".menu_wrap .menu").eq(tap_num).show();
    
    return false;
})

$('.next').click(function(){
    if($('.menu_wrap .menu').css("margin-left")=="0px"/*&& $('.menu_wrap .menu:nth-child(4) li').length >= 5*/){
        $('.menu_wrap .menu').stop().animate({"margin-left":-1200+"px"},600)
        return false;
    }else{return false;}
})
$('.prev').click(function(){
    if($('.menu_wrap .menu').css("margin-left")=="-1200px"){
        $('.menu_wrap .menu').stop().animate({"margin-left":0+"px"},600)
        return false;
    }else{return false}
})




});