document.getElementById('register-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const nome = document.getElementById('nome').value;
    const email = document.getElementById('email').value;
    const senha = document.getElementById('senha').value;
    const dataNascimento = document.getElementById('dataNascimento').value;

    const user = {
        nome: nome,
        email: email,
        senha: senha,
        dataNascimento: dataNascimento
    };

    fetch('/api/users', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    })
    .then(response => response.json())
    .then(data => {
        alert('Usuário cadastrado com sucesso!');
        console.log('Success:', data);
        window.location.href = '/login'
    })
    .catch((error) => {
        alert('Erro ao cadastrar usuário.');
        console.error('Error:', error);
    });
});
