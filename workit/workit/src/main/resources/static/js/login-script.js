$(document).ready(function() {
    const themeToggleCheckbox = $('#theme-toggle-checkbox');
    themeToggleCheckbox.on('change', function() {
        if (this.checked) {
            $('body').removeClass('light-mode').addClass('dark-mode');
            document.cookie = "theme=dark; path=/";
        } else {
            $('body').removeClass('dark-mode').addClass('light-mode');
            document.cookie = "theme=light; path=/";
        }
    });

    const cookies = document.cookie.split(';');
    cookies.forEach(cookie => {
        const [name, value] = cookie.split('=').map(c => c.trim());
        if (name === 'theme' && value === 'dark') {
            $('body').addClass('dark-mode');
            themeToggleCheckbox.prop('checked', true);
        } else {
            $('body').addClass('light-mode');
        }
    });

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
                window.location.href = '/home.html';
            },
            error: function(xhr, status, error) {
                alert('Erro ao fazer login: ' + xhr.responseText);
            }
        });
    });
});
