
    var swiper = new Swiper('.mySwiper',{
       slidesPerView: 3,
       spaceBetween : 30,
       navigation:{
         nextEl: ".swiper-button-next",
         prevEl: ".swiper-button-prev",
       },
       autoplay:true,
      
    });



var num = 0;
$('.prev').hide();

$('.next').click(function(){
    if(num<4){
        num++;
        $('.listWrap').stop().animate({'margin-left':-1010*num},500)
        $('.prev').show();
    }
    if(num==3){
        $('.next').hide();
    }
})

// $('.prev').click(function(){
//     if(num==0){
//         $('.prev').hide();
//     }else{
//         num--;
//         $('.listWrap').stop().animate({'margin-left':1010*num},500) 
//     }
// })
// prev는 양수, next는 음수주는거 아님....ㅠ 마진은 num값으로 조절함.

$('.prev').click(function(){
    if(num > 0){
        num--;
        $('.listWrap').stop().animate({'margin-left': -1010 * num}, 500);
        $('.next').show();
    }

    if(num == 0){
        $('.prev').hide();
    }
});


$('.closeBtn').click(function(){
    $('.cgv-ad-top>.container').hide();
    //banner와 cloesBtn이 있는 container를 숨김
    $('.cgv-ad-top').css('height',0);
    $('.nav .navBg').css('top',164);
    
})


 
$('.specialHall_list li').mouseenter(function(){
    var i =  $(this).index();
    //alert(i);
    $('.specialHall_list li').removeClass('on');
    $('.specialHall_list li').eq(i).addClass('on');
    $('.tapContent a').removeClass('on');
    $('.tapContent a').eq(i).addClass('on');
  });
