$(document).ready(function() {
    $("#register-form").on("submit", function(event) {
        event.preventDefault();

        const formData = {
            nome: $("#nome").val(),
            dataNascimento: $("#dataNascimento").val(),
            email: $("#email").val(),
            password: $("#senha").val()
        };

        $.ajax({
            type: "POST",
            url: "/cadastro",
            data: JSON.stringify(formData),
            contentType: "application/json",
            success: function(response) {
                window.location.href = "/login";
            },
            error: function(error) {
                console.error("Erro ao cadastrar usuário", error);
            }
        });
    });
});
