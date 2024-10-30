$(function(){
    $('.nav>ul').mouseover(function(){
        $(this).addClass('over');
    });
    $('.nav ul').mouseleave(function(){
        $(this).removeClass('over');
    });
    //removeClass addClass 안에는 .안적어도 된다.

    $('.mobile_tab').click(function(){
        $('.mobile_nav').addClass('active');
        $('.transparency').addClass('active');
        return false;
    });
    
});