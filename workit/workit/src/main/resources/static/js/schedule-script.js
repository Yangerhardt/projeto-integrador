$(document).ready(function() {
    function getCookie(name) {
        let cookieArr = document.cookie.split(";");
        for (let i = 0; i < cookieArr.length; i++) {
            let cookiePair = cookieArr[i].split("=");
            if (name == cookiePair[0].trim()) {
                return decodeURIComponent(cookiePair[1]);
            }
        }
        return null;
    }

    function fetchTrainingData(userId, day) {
        return $.ajax({
            url: `/api/workouts/${userId}/${day}`,
            method: "GET",
            dataType: "json"
        });
    }

    function renderTrainingData(trainingData) {
        let tbody = $("#training-table tbody");
        let title = $("training-name");
        tbody.empty();

        if (trainingData.length > 0) {
            let tipoTreino = trainingData[0].tipoTreino;
            title.text(`Treino: ${tipoTreino}`);

            trainingData.forEach(function(dayData) {
                dayData.exercises.forEach(function(exercise) {
                    let row = `<tr>
                        <td>${exercise.nomeExercicio}</td>
                        <td>${exercise.series}</td>
                        <td>${exercise.carga}</td>
                    </tr>`;
                    tbody.append(row);
                });
            });
        } else {
            title.text("Treino");
            tbody.append("<tr><td colspan='3'>Nenhum exercício encontrado.</td></tr>");
        }
    }

    $(".weekday-btn").on("click", function() {
        let day = $(this).attr("id");
        let userId = getCookie("userId");

        if (userId) {
            fetchTrainingData(userId, day)
                .done(function(data) {
                    renderTrainingData(data);
                })
                .fail(function(jqXHR, textStatus, errorThrown) {
                    console.error("Error fetching training data:", textStatus, errorThrown);
                });
        } else {
            console.error("User ID cookie not found.");
        }
    });
});
