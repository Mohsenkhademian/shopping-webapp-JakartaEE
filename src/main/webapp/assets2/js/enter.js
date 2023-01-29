$("#btnreg").click(function(){
    $("#loadpage").load("./registeration.html");
});

$("#enterbtn").click(function(){
    if ($("#username").val()=="" || $("#password").val() ==""){
        alert("لطفا تمامی فیلدها را پر کنید.");
        $("#username").css({"border": "1px solid red"});
        $("#password").css({"border": "1px solid red"});
    }
    else{
        $("#username").css({"border": "1px solid gainsboro"});
        $("#password").css({"border": "1px solid gainsboro"});
        alert("با موفقیت وارد شدید");
        history.back();
    }
});


$("#registerbtn").click(function(){
    if ($("#usernam").val()=="" || $("#pass").val() =="" || $("#name").val() =="" || $("#lastname").val() ==""){
        alert("لطفا تمامی فیلدها را پر کنید.");
        $("#name").css({"border": "1px solid red"});
        $("#lastname").css({"border": "1px solid red"});
        $("#usernam").css({"border": "1px solid red"});
        $("#pass").css({"border": "1px solid red"});
    }
    else if($("#usernam").val()!="" && $("#pass").val() !="" && $("#name").val() !="" && $("#lastname").val() !=""){
        $("#usernam").css({"border": "1px solid gainsboro"});
        $("#lastname").css({"border": "1px solid gainsboro"});
        $("#name").css({"border": "1px solid gainsboro"});
        $("#pass").css({"border": "1px solid gainsboro"});
        alert("ثبت نام با موفقیت انجام شد.");
        history.back();
    }
});


