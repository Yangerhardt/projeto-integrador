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
                window.location.href = '/home';
            },
            error: function(xhr, status, error) {
                alert('Erro ao fazer login: ' + xhr.responseText);
            }
        });
    });
});
