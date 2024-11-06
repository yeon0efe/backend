$('.sub').hide();
$('.sub').eq(0).show();
$('.m_menu>li>a').click(function(){
    var kkk = $(this).next().css('display');
    //이 경우엔 next()안에 '.sub' 써도되고 안써도되고...
    // alert(kkk);
    if(kkk=="none"){
        $('.sub').slideUp();
        $(this).next('.sub').slideDown();
    }else{
         $('.sub').slideUp();
    }
})