$(document).ready(function(){
    $.ajax({
        type: "GET",
        url: "http://127.0.0.1:7070/book/list",
        // data: form, // api 호출을 위한 요청 변수가 필요하다면 사용해주세요.
        dataType: "json"
    })
        .done(function (result) {
            console.log(result);
            const select = $('#booklist');
            result.forEach(item => {
                select.append(`<div class="boo">
                                    <div>도서명 : ${item.name}</div>
                                    <div>작가 : ${item.writer}</div>
                                    <div>등록자 : ${item.registrant}</div>
                                </div>`);
            });
        })
        .fail(function(jqXHR) {
            console.log(jqXHR);
        })

})