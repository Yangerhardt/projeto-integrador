$(document).ready(function() {
    $('#login-form').on('submit', function(event) {
        event.preventDefault();

        const email = $('#email').val();
        const password = $('#password').val();

        $.ajax({
            url: '/api/login',
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify({ email, password }),
            success: function(response) {
                setCookie('userId', response, 1);
                window.location.href = '/home';
            },
            error: function(xhr, status, error) {
                alert('Erro ao fazer login: ' + xhr.responseText);
            }
        });
    });

    function setCookie(name, value, days) {
        var expires = "";
        if (days) {
            var date = new Date();
            date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
            expires = "; expires=" + date.toUTCString();
        }
        document.cookie = name + "=" + (value || "") + expires + "; path=/";
    }
});
