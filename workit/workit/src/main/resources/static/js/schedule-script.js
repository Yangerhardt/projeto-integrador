$(document).ready(function() {
    // Função para buscar dados do treino
    function fetchTrainingData(day) {
        // Simulação de uma chamada ao banco de dados para obter os dados do treino
        let trainingData = {
            "segunda": [
                { exercicio: "Supino Reto", series: "4 x 12", carga: 20 },
                { exercicio: "Supino Inclinado", series: "4 x 12", carga: 15 },
                { exercicio: "Crucifixo", series: "4 x 12", carga: 10 },
                { exercicio: "Tríceps Francês", series: "4 x 12", carga: 8 },
                { exercicio: "Tríceps Barra H", series: "4 x 12", carga: 10 },
                { exercicio: "Tríceps Barra Reta", series: "4 x 12", carga: 30 }
            ],
            // Adicione outros dias da semana conforme necessário
        };

        return trainingData[day] || [];
    }

    // Função para renderizar dados do treino na tabela
    function renderTrainingData(day) {
        let trainingData = fetchTrainingData(day);
        let tbody = $("#training-table tbody");
        tbody.empty();

        trainingData.forEach(function(item) {
            let row = `<tr>
                <td>${item.exercicio}</td>
                <td>${item.series}</td>
                <td>${item.carga}</td>
            </tr>`;
            tbody.append(row);
        });
    }

    // Carrega dados do treino ao clicar em um botão de dia da semana
    $(".weekday-btn").on("click", function() {
        let day = $(this).attr("id");
        renderTrainingData(day);
    });
});
